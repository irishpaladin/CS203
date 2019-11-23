/**
 * Program that displays a string "Welcome to Java " around a circle
 *
 * @course CS203
 * @author Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/21 1pm
 */
package Question4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharactersAroundCircle extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the pane
        Pane pane = new Pane();
        pane.setPrefSize(300, 300);

        // set font
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 35);

        // Welcome to Java string
        String welcome = "Welcome to Java";
        
        // counter variables
        double rotation = 0; // for position and rotation of the text
        double offset = pane.getPrefWidth() / 2-15; //x and y of the center of circle
        double radius = 100; // distance between the character and the center

        // create text file of each character and position it
        for (int i = 0; i < welcome.length(); i++) {
            double x = offset + Math.cos(Math.toRadians(rotation)) * radius;
            double y = offset + Math.sin(Math.toRadians(rotation)) * radius;
            Text text = new Text(x, y, (welcome.charAt(i)+ "").toUpperCase());
            text.setFont(font);
            text.setRotate(rotation+90);
            pane.getChildren().add(text);
            rotation += 22.5;
        }
        
        //displays
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Characters around circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}