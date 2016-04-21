package Controller;

import Model.IShape;
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
        System.out.println(inputKeys.size());
    }

    public static void handleKeyReleased(KeyEvent e)
    {
        KeyCode code = e.getCode();
        inputKeys.remove(code);
        System.out.println(inputKeys.size());
    }

    public static void processKeys(World w)
    {
        if(inputKeys.contains(KeyCode.SPACE))
        {
            for (IShape s : w.LoShapes)
            {
                s.setColor(Color.RED);
            }
        }
        else
        {
            for (IShape s : w.LoShapes)
            {
                s.setColor(Color.BLACK);
            }
        }
    }
}
