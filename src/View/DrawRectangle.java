package View;

import Model.Circle;
import Model.Rectangle;
import javafx.scene.canvas.GraphicsContext;

public class DrawRectangle implements IDrawShape
{
    @Override
    public void addRectangleToGC(Rectangle rectangle, GraphicsContext gc)
    {
        gc.setFill(rectangle.getColor());
        gc.fillRect(rectangle.getTopLeft().getX(),
                rectangle.getTopLeft().getY(),
                rectangle.getWidth(),
                rectangle.getHeight());
    }

    @Override
    public void addCircleToGC(Circle circle, GraphicsContext gc)
    {

    }
}
