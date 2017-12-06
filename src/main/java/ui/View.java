package ui;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

/**
 * @author Jeremy Daker
 * @version 1.0 4 Dec, 2017
 * View.java
 * Abstract class that defines a VBox for the center pane of the program.
 */
public class View
{
    private VBox vBox;

    /**
     * Instantiates and styles the VBox that holds the content.
     */
    public View()
    {
        vBox = new VBox();
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setStyle("-fx-border-top: black;" +
                "-fx-border-width: 1;" +
                "-fx-border-style: solid;");
    }

    /**
     * Clears the contents of the VBox and adds a javaFX node to the VBox.
     * @param node javaFX node to be added to the VBox.
     */
    public void addToView(Node node)
    {
        vBox.getChildren().clear();
        vBox.getChildren().add(node);
    }

    /**
     * Returns the VBox.
     * @return The VBox.
     */
    public VBox getView()
    {
        return vBox;
    }
}
