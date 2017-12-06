package ui;

import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class DungeonView
{
    private GraphicsContext graphics;
    VBox box;

    public DungeonView(String url)
    {
        box = new VBox();

        setDungeonView(url);
    }

    public void setDungeonView(String url)
    {
        Image closedDoors = new Image(url);

        ImageView imageView = new ImageView(closedDoors);

        box.getChildren().add(imageView);
    }

    public VBox getDungeon()
    {
        return box;
    }
}