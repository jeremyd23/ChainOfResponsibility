package handlers;

import model.Key;

public interface DoorChain
{
    void setNextDoor(DoorChain nextDoor);

    void tryDoor(Key key);
}