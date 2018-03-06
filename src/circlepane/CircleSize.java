package circlepane;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class CircleSize extends CircleMouse {
    
    public BorderPane getPane() {
        BorderPane pane = super.getPane();

        ImageView imgEnlarge = new ImageView(new Image("circlepane/images/plus.png"));
        ImageView imgShrink = new ImageView(new Image("circlepane/images/minus.png"));
        Button enlargeButton = new Button("", imgEnlarge);
        Button shrinkButton = new Button("", imgShrink);

        enlargeButton.setOnAction(e -> cp.enlarge());
        shrinkButton.setOnAction(e -> cp.shrink());

        VBox enlargeShrink = new VBox();
        enlargeShrink.getChildren().addAll(enlargeButton, shrinkButton);
        
        HBox controls = new HBox();
        controls.getChildren().addAll(enlargeShrink);
        controls.setPadding(new Insets(10));
        controls.setSpacing(10);
        controls.setAlignment(Pos.BOTTOM_CENTER);
        
        pane.setBottom(controls);
        
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
