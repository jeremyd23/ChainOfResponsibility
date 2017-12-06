package handlers;

import controller.Controller;
import model.Key;

public class DoorOne implements DoorChain
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
        if (key.getvalue() == 1)
        {
            Controller.getInstance().openLeftDoor();
        }
        else
        {
            this.nextDoor.tryDoor(key);
        }
    }
}
