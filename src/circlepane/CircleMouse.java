package circlepane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CircleMouse extends Application {
    protected CirclePane cp = new CirclePane();
    
    public BorderPane getPane() {
        cp.setOnMouseDragged(e -> cp.move(e.getX(), e.getY()));
        BorderPane main = new BorderPane();
        main.setPadding(new Insets(10));
        main.setCenter(cp);
        return main;
    }
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(getPane(), 450, 450);
        primaryStage.setTitle("CirclePane Improvements"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
