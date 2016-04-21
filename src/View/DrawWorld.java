package View;

import Model.IShape;
import Model.World;
import javafx.scene.canvas.GraphicsContext;

public class DrawWorld
{
    public static void draw(World w, GraphicsContext gc)
    {
        for (IShape s : w.LoShapes)
        {
            s.draw(gc);
        }
    }


}
