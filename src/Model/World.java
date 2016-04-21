package Model;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class World
{
    public ArrayList<IShape> LoShapes = new ArrayList<>();

    public World()
    {

    }

    public World(ArrayList<IShape> LoShapes)
    {
        this.LoShapes = LoShapes;
    }

    public void initWorld()
    {
        // Some random test shapes
        Rectangle r = new Rectangle(new Point2D(45, 30), 10, 40, Color.BLUE);
        Circle c = new Circle(new Point2D(75, 50), 15, Color.BLACK);

        this.LoShapes.add(r);
        this.LoShapes.add(c);
    }
}
