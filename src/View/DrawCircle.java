package View;

import Model.Circle;
import Model.Rectangle;
import javafx.scene.canvas.GraphicsContext;

public class DrawCircle implements IDrawShape
{
    @Override
    public void addRectangleToGC(Rectangle rectangle, GraphicsContext gc)
    {

    }

    @Override
    public void addCircleToGC(Circle circle, GraphicsContext gc)
    {
        gc.setFill(circle.getColor());

        gc.fillOval(circle.getTopLeft().getX(),
                circle.getTopLeft().getY(),
                circle.getWidth(),
                circle.getHeight());
    }
}
