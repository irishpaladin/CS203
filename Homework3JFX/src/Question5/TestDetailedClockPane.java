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
package Question5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TestDetailedClockPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        DetailedClockPane clock_pane = new DetailedClockPane();
        Text text = new Text(clock_pane.getHour()+":"
                +clock_pane.getMinute()+":"+clock_pane.getSecond());
        VBox vbox = new VBox(clock_pane,text);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox);
        primaryStage.setTitle("Characters around circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
