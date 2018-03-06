package circlepane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class CircleMove extends CircleSize {
    
    public BorderPane getPane() {
        BorderPane pane = super.getPane();

        ImageView imgUp = new ImageView(new Image("circlepane/images/up.png"));
        ImageView imgDown = new ImageView(new Image("circlepane/images/down.png"));
        ImageView imgLeft = new ImageView(new Image("circlepane/images/left.png"));
        ImageView imgRight = new ImageView(new Image("circlepane/images/right.png"));
        Button upButton = new Button("", imgUp);
        Button downButton = new Button("", imgDown);
        Button leftButton = new Button("", imgLeft);
        Button rightButton = new Button("", imgRight);
        
        upButton.setOnAction(e -> cp.moveUp());
        downButton.setOnAction(e -> cp.moveDown());
        leftButton.setOnAction(e -> cp.moveLeft());
        rightButton.setOnAction(e -> cp.moveRight());
        
        VBox direction = new VBox();
        HBox leftRight = new HBox();
        leftRight.getChildren().addAll(leftButton, rightButton);
        direction.getChildren().addAll(upButton, leftRight, downButton);
        direction.setAlignment(Pos.CENTER);
        
        HBox controls = ((HBox) pane.getBottom());
        controls.getChildren().add(direction);
        
        return pane;
    }
    
    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
