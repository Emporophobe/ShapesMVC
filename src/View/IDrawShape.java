package View;

import Model.Circle;
import Model.Rectangle;
import javafx.scene.canvas.GraphicsContext;

public interface IDrawShape
{
    void addRectangleToGC(Rectangle rectangle, GraphicsContext gc);
    void addCircleToGC(Circle circle, GraphicsContext gc);
}
