package handlers;

import controller.Controller;
import model.Key;

public class DoorTwo implements DoorChain
{
    private DoorChain nextDoor;

    @Override
    public void setNextDoor(DoorChain nextDoor)
    {
        this.nextDoor = nextDoor;
    }

    @Override
    public void tryDoor(Key key)
    {
        if (key.getvalue() == 2)
        {
            Controller.getInstance().openMiddleDoor();
        }
        else
        {
            this.nextDoor.tryDoor(key);
        }
    }
}