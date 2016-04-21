package app;

import Controller.KeyHandler;
import Model.Circle;
import Model.IShape;
import Model.Rectangle;
import Model.World;
import View.DrawWorld;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Canvas!");

        Group root = new Group();
        Scene theScene = new Scene(root);

        Canvas canvas = new Canvas(400, 200);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Rectangle r = new Rectangle(new Point2D(45, 30), 10, 40, Color.BLUE);
        Circle c = new Circle(new Point2D(75, 50), 15, Color.BLACK);

        ArrayList<IShape> shapes = new ArrayList<>();

        shapes.add(r);
        shapes.add(c);

        World w = new World(shapes);

        DrawWorld.draw(w, gc);

        theScene.setOnKeyPressed(
                new EventHandler<KeyEvent>()
                {
                    @Override
                    public void handle(KeyEvent event)
                    {
                        KeyHandler.handleKeyPressed(event);
                    }
                });

        theScene.setOnKeyReleased(
                new EventHandler<KeyEvent>()
                {
                    @Override
                    public void handle(KeyEvent event)
                    {
                        KeyHandler.handleKeyReleased(event);
                    }
                });

        new AnimationTimer()
        {
            @Override
            public void handle(long currentNanoTime)
            {
                gc.clearRect(0, 0, 400, 200);
                KeyHandler.processKeys(w);
                DrawWorld.draw(w, gc);
            }
        }.start();


        root.getChildren().add(canvas);
        primaryStage.setScene(theScene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}