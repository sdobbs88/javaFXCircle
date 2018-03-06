package circlepane;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


class CirclePane extends Pane {

    private Circle circle = new Circle(50);

    public CirclePane() {
        circle.setCenterX(50);
        circle.setCenterY(circle.getCenterX());
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    // enlarge the radius of the circle
    public void enlarge() {
        circle.setRadius(circle.getRadius() + 5);
    }

    // shrink the radius of the circle
    public void shrink() {
        circle.setRadius(circle.getRadius() > 5
                ? circle.getRadius() - 5 : circle.getRadius());
    }

    // move the circle's location to the left
    public void moveLeft() {
        circle.setCenterX(circle.getCenterX() > 10
                ? circle.getCenterX() - 10 : circle.getCenterX());
    }

    // move the circle's location to the right	
    public void moveRight() {
        circle.setCenterX(circle.getCenterX() < getWidth()
                ? circle.getCenterX() + 10 : circle.getCenterX());
    }

    // move the circle's location up	
    public void moveUp() {
        circle.setCenterY(circle.getCenterY() > 10
                ? circle.getCenterY() - 10 : circle.getCenterY());
    }

    // move the circle's location down	
    public void moveDown() {
        circle.setCenterY(circle.getCenterY() < getHeight()
                ? circle.getCenterY() + 10 : circle.getCenterY());
    }

    public void setCenter(double height, double width) {
        circle.setCenterX(width / 2.0);
        circle.setCenterY(height / 2.0);
    }

    public void reset() {
        circle.setRadius(50);
    }

    public void move(double x, double y) {
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
    
    public void setColor(Color c) {
        circle.setFill(c);
    }
}
