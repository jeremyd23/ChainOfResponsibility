package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HomeView
{
    private VBox box;
    private HBox menu;
    private Button button;

    public VBox getStartButton()
    {
        box = new VBox(20);
        box.setAlignment(Pos.CENTER);

        Button button = new Button("Start");
        button.setMinHeight(40);
        button.setMinWidth(55);
        button.setFont(Font.font("Gill Sans MT", FontWeight.NORMAL, 15));

        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
                ScenePane.getInstance().setCenterPane(new DungeonView("closed_doors.png").getDungeon());
                ScenePane.getInstance().setBottomPane(getMenu());
            }
        });

        box.getChildren().add(button);
        return box;
    }

    private HBox getMenu()
    {
        menu = new HBox(20);
        menu.setAlignment(Pos.CENTER);

        button = new Button("Open Box");
        button.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                ScenePane.getInstance().setCenterPane(new DungeonView("closed_doors_chest_open.png").getDungeon());
            }
        });

        menu.getChildren().add(button);

        return menu;
    }
}
