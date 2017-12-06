package ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

public class DungeonUI extends Application implements Observer
{
    public void start(Stage stage)
    {
        Scene scene = assemble();
        stage.setTitle("The Beaten Path");
        stage.setScene(scene);
        stage.show();
    }

    private Scene assemble()
    {
        HBox title = getTitle();
        ScenePane.getInstance().setTopPane(title);

        HomeView home = new HomeView();
        ScenePane.getInstance().setCenterPane(home.getStartButton());

        return new Scene(ScenePane.getInstance().getBorderPane(), 1040, 680);
    }

    private HBox getTitle()
    {
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color: #812121");

        Text title = new Text("Hodor, The Game!");
        title.setFill(Color.LIGHTYELLOW);
        title.setFont(Font.font("Gill Sans MT", FontWeight.BOLD, 25));

        hBox.getChildren().add(title);

        return hBox;
    }

    @Override
    public void update(Observable o, Object arg)
    {

    }
}
