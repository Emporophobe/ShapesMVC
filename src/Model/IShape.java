package Model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public interface IShape
{
    Color getColor();
    void setColor(Color color);

    Point2D getTopLeft();
    void setTopLeft(Point2D topLeft);

    int getWidth();
    void setWidth(int x);

    int getHeight();
    void setHeight(int y);

    //Point2D getVelocity();
    //void setVelocity(Point2D v);

    void draw(GraphicsContext gc);
}
