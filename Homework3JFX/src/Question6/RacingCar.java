/**
 * Program that test the class pane
 * displays the time the program was executed
 *
 * @course CS203
 * @author by Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/22 5pm
 */
package Question6;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RacingCar extends Application{

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // panes and othe robjects
    Pane pane = new Pane();//contains car pane and line
    pane.setPrefSize(250, 250);
    CarPane car = new CarPane();
    Line line = new Line(-25,245,285,245);
    line.setStroke(Color.TRANSPARENT);
    
    // Add car and line to the pane
    pane.getChildren().add(car);
    pane.getChildren().add(line);
    
    // Create a path transition 
    PathTransition pt = new PathTransition();
    double timer = 4000;
    pt.setDuration(Duration.millis(timer));
    pt.setPath(line);
    pt.setNode(car);
    pt.setCycleCount(Timeline.INDEFINITE);
    pt.setAutoReverse(false);
    pt.setInterpolator(Interpolator.LINEAR);
    pt.play(); // Start animation 
    
    //event handlers
    pane.setOnKeyPressed(e->{
        if(e.getCode()==KeyCode.UP){
            pt.setDuration(pt.getDuration().add(Duration.millis(50)));
            System.out.println("Duration: "+pt.getDuration().toString());
        }else if(e.getCode()==KeyCode.DOWN){
            pt.setDuration(pt.getDuration().subtract(Duration.millis(50)));
        }
    });
    pane.setOnMousePressed(e -> pt.pause());
    pane.setOnMouseReleased(e -> pt.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setResizable(false);
    primaryStage.setTitle("Racing Car"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}

class CarPane extends Pane{
    // drawing the car
    CarPane(){
        paintCar();
    }
    public void paintCar(){
        setPrefSize(50,30);
        
        //drawing the upper part of the car
        Polygon upper = new Polygon();
        upper.getPoints().addAll(new Double[]{
           10.0,10.0,
            20.0,0.0,
            30.0,0.0,
            40.0,10.0});
        upper.setFill(Color.DEEPSKYBLUE);
        
        // drwing the middle pard of the car
        Rectangle middle = new Rectangle(0,10,50,10);
        middle.setFill(Color.CYAN);
        
        //drawing wheels
        Circle wheelL = new Circle(15,25,5);
        wheelL.setFill(Color.BLACK);
        Circle wheelR = new Circle(35,25,5);
        wheelR.setFill(Color.BLACK);
        
        getChildren().clear();
        getChildren().addAll(upper, middle, wheelL, wheelR);
    }
}