package handlers;

import model.Key;

public interface DoorChain
{
    void setNextChain(DoorChain nextChain);

    void tryDoor(Key key);
}
