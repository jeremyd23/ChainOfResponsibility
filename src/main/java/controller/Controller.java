package controller;

import model.KeyManager;
import ui.DungeonView;
import ui.ScenePane;

public class Controller
{
    private static Controller instance;
    private KeyManager manager;

    private Controller()
    {
        manager = new KeyManager();
    }

    public static Controller getInstance()
    {
        if (instance == null)
        {
            instance = new Controller();
        }

        return instance;
    }

    public void addKey()
    {
        manager.addKey();

        System.out.println(manager.getKeyValue());
    }

    public void openLeftDoor()
    {
        ScenePane.getInstance().setCenterPane(new DungeonView("left_door_open.png").getDungeon());
    }
}
