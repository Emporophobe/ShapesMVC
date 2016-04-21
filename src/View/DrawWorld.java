package View;

import Model.World;
import javafx.scene.canvas.GraphicsContext;

public class DrawWorld
{
    public static void draw(World w, GraphicsContext gc)
    {
        w.LoShapes.forEach(s -> s.draw(gc));
    }


}
