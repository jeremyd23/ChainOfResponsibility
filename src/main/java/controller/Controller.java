package controller;

import handlers.DoorChain;
import handlers.DoorOne;
import handlers.DoorThree;
import handlers.DoorTwo;
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
    }

    public void openDoor()
    {
        DoorChain door1 = new DoorOne();
        DoorChain door2 = new DoorTwo();
        DoorChain door3 = new DoorThree();

        door1.setNextDoor(door2);
        door2.setNextDoor(door3);

        door1.tryDoor(manager.getKey());
    }

    public void openLeftDoor()
    {
        ScenePane.getInstance().setCenterPane(new DungeonView("Left_door_open.png").getDungeon());
    }

    public void openMiddleDoor()
    {
        ScenePane.getInstance().setCenterPane(new DungeonView("middle_door_open.png").getDungeon());
    }

    public void openRightDoor()
    {
        ScenePane.getInstance().setCenterPane(new DungeonView("right_door_open.png").getDungeon());
    }

    public void newRoom()
    {
        ScenePane.getInstance().setCenterPane(new DungeonView("closed_doors.png").getDungeon());
    }
}