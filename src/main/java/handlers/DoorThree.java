package handlers;

import controller.Controller;
import model.Key;
import ui.HomeView;
import ui.ScenePane;

public class DoorThree implements DoorChain
{

    @Override
    public void setNextDoor(DoorChain nextDoor)
    {

    }

    @Override
    public void tryDoor(Key key)
    {
        if (key.getvalue() == 3)
        {
            Controller.getInstance().openRightDoor();
        }
        else
        {
            ScenePane.getInstance().setCenterPane(new HomeView().getStartView());
        }
    }
}
