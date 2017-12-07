package ui;

import controller.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class DungeonView
{
    private Group group;
    private HBox box;

    public DungeonView(String url)
    {
        group = new Group();
        box = new HBox();
        box.setPrefWidth(1040);
        box.setPrefHeight(640);

        setDungeonView(url);
    }

    public void setDungeonView(String url)
    {
        group.getChildren().clear();

        BackgroundImage background = new BackgroundImage(new Image(url,1040,
                640, true, true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        box.setBackground(new Background(background));

        group.getChildren().add(box);

        if (url.equals("closed_doors.png"))
        {
            group.getChildren().add(getChestButton());
        }
        else if(url.equals("closed_doors_chest_open.png"))
        {
            group.getChildren().add(getKeyButton());
        }
        else if (url.equals("Left_door_open.png"))
        {
            group.getChildren().add(getLeftDoor());
        }
        else if (url.equals("middle_door_open.png"))
        {
            group.getChildren().add(getMiddleDoor());
        }
        else if (url.equals("right_door_open.png"))
        {
            group.getChildren().add(getRightDoor());
        }
    }

    private Button getChestButton()
    {
        Button chestButton = new Button();
        chestButton.setStyle("-fx-background-image: url('chest.png')");
        chestButton.setPrefSize(110, 100);

        chestButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                Controller.getInstance().addKey();
                ScenePane.getInstance().setCenterPane(new DungeonView("closed_doors_chest_open.png").getDungeon());
            }
        });

        chestButton.setLayoutX(588);
        chestButton.setLayoutY(488);

        return chestButton;
    }

    private Button getKeyButton()
    {
        Button keyButton = new Button();
        keyButton.setStyle("-fx-background-image: url('key.png')");
        keyButton.setPrefSize(50, 50);

        keyButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                Controller.getInstance().openDoor();
            }
        });

        keyButton.setLayoutX(450);
        keyButton.setLayoutY(488);

        return keyButton;
    }

    private Button getLeftDoor()
    {
        Button leftDoor = new Button();
        leftDoor.setStyle("-fx-background-image: url('Left_door.png')");
        leftDoor.setPrefSize(30, 45);

        leftDoor.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                Controller.getInstance().newRoom();
            }
        });

        leftDoor.setLayoutX(125);
        leftDoor.setLayoutY(325);

        return leftDoor;
    }

    private Button getMiddleDoor()
    {
        Button middleDoor = new Button();
        middleDoor.setStyle("-fx-background-image: url('middle_door.png')");
        middleDoor.setPrefSize(25, 25);

        middleDoor.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                Controller.getInstance().newRoom();
            }
        });

        middleDoor.setLayoutX(563);
        middleDoor.setLayoutY(327);

        return middleDoor;
    }

    private Button getRightDoor()
    {
        Button rightDoor = new Button();
        rightDoor.setStyle("-fx-background-image: url('right_door.png')");
        rightDoor.setPrefSize(50, 59);

        rightDoor.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
               Controller.getInstance().newRoom();
            }
        });

        rightDoor.setLayoutX(882); //was 875
        rightDoor.setLayoutY(350); //was 355

        return rightDoor;
    }

    public Group getDungeon()
    {
        return group;
    }
}