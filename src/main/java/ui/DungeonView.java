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

        setDungeonView(url);
    }

    public void setDungeonView(String url)
    {

        box.setPrefWidth(1040);
        box.setPrefHeight(640);
        BackgroundImage background = new BackgroundImage(new Image(url,1040,
                640, true, true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        box.setBackground(new Background(background));

        group.getChildren().add(box);

        if (url.equals("closed_doors.png"))
        {
            group.getChildren().add(getChestButton());
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

    public Group getDungeon()
    {
        return group;
    }
}