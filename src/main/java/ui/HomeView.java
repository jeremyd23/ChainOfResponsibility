package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.net.URL;

public class HomeView
{
    private VBox box;
    private HBox menu;
    private Button button;

    public VBox getStartView()
    {
        box = new VBox();
        box.setAlignment(Pos.CENTER);

        String url = "closed_doors.png";

        BackgroundImage background = new BackgroundImage(new Image(url,1040,
                640, true, true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        box.setBackground(new Background(background));

        Button button = new Button("Start");
        button.setMinHeight(40);
        button.setMinWidth(55);
        button.setFont(Font.font("Gill Sans MT", FontWeight.NORMAL, 15));

        button.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
                ScenePane.getInstance().setCenterPane(new DungeonView(url).getDungeon());
            }
        });

        box.getChildren().add(button);
        return box;
    }
}
