package Controller;

import Model.World;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class KeyHandler
{
    private static ArrayList<KeyCode> inputKeys = new ArrayList<>();

    public static void handleKeyPressed(KeyEvent e)
    {
        KeyCode code = e.getCode();

        if(!inputKeys.contains(code))
        {
            inputKeys.add(code);
        }
    }

    public static void handleKeyReleased(KeyEvent e)
    {
        KeyCode code = e.getCode();
        inputKeys.remove(code);
    }

    public static void processKeys(World w)
    {
        if(inputKeys.contains(KeyCode.SPACE))
        {
            w.LoShapes.forEach(s -> s.setColor(Color.RED));
        }
        else
        {
            w.LoShapes.forEach(s -> s.setColor(Color.BLACK));
        }

        // Alternatively,
        //w.LoShapes.forEach(s -> s.setColor(inputKeys.contains(KeyCode.SPACE) ? Color.RED : Color.BLACK));
    }
}
