/**
 * Program that simulates car moving
 *
 * @course CS203
 * @author by Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/22 11pm
 */

package Question6;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class RacingCar extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        CarPane ballPane = new CarPane(); // Create a ball pane

        // Pause and resume animation
        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        // Increase and decrease animation   
        ballPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                ballPane.increaseSpeed();
            } else if (e.getCode() == KeyCode.DOWN) {
                ballPane.decreaseSpeed();
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(ballPane, 250, 250);
        primaryStage.setTitle("Racing Car"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        // Must request focus after the primary stage is displayed
        ballPane.requestFocus();
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

class CarPane extends Pane {

    private double x = -50, y = 250;
    private double dx = 1;

    private Circle wheelL;
    private Circle wheelR;

    private Rectangle rectangle;
    Polygon upper;

    private Timeline animation;

    public CarPane() {
        //set and add wheels
        wheelL = new Circle(x + 15, y - 5, 5);
        wheelL.setFill(Color.BLACK);
        wheelR = new Circle(x + 35, y - 5, 5);
        wheelR.setFill(Color.BLACK);
        getChildren().addAll(wheelL, wheelR);

        //set and add rectangle
        rectangle = new Rectangle(x, y - 20, 50, 10);
        rectangle.setFill(Color.CYAN);
        getChildren().add(rectangle);

        // at and set polygon
        upper = new Polygon();
        upper.getPoints().addAll(new Double[]{
            x + 10, y - 20,
            x + 20, y - 30,
            x + 30, y - 30,
            x + 40, y - 10});
        upper.setFill(Color.DEEPSKYBLUE);
        getChildren().add(upper);

        // Create an animation for moving the ball
        animation = new Timeline(
                new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() {
        animation.setRate(
                animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }

    public DoubleProperty rateProperty() {
        return animation.rateProperty();
    }

    protected void moveBall() {
        // Check boundaries
        if (x > getWidth()) {
            //dx *= -1; // Change ball move direction
            x = -50;
        }

        // Adjust ball position
        x += dx;
        wheelL.setCenterX(x + 15);
        wheelR.setCenterX(x + 35);
        rectangle.setX(x);
        rectangle.setY(y - 20);
        upper.getPoints().clear();
        upper.getPoints().addAll(new Double[]{
            x + 10, y - 20,
            x + 20, y - 30,
            x + 30, y - 30,
            x + 40, y - 20});
    }
}
