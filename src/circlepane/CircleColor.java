

package circlepane;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class CircleColor extends CircleMove {
    public BorderPane getPane() {
        BorderPane pane = super.getPane();

        ToggleGroup tg = new ToggleGroup();
        RadioButton rb1 = new RadioButton("Red");
        RadioButton rb2 = new RadioButton("White");
        RadioButton rb3 = new RadioButton("Blue");
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        rb2.setSelected(true);
        rb3.setToggleGroup(tg);
        
        rb1.setOnAction(e -> cp.setColor(Color.RED));
        rb2.setOnAction(e -> cp.setColor(Color.WHITE));
        rb3.setOnAction(e -> cp.setColor(Color.BLUE));

        VBox rg = new VBox();
        rg.getChildren().addAll(rb1, rb2, rb3);
        
        HBox controls = ((HBox) pane.getBottom());
        controls.getChildren().add(rg);
        
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
