/**
 * Class pane class which contains clock simulation
 *
 * @course CS203
 * @author allison
 * @modified by Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/22 5pm
 */

package Question5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class DetailedClockPane extends Pane {

    private int hour;
    private int minute;
    private int second;

    // Clock pane's width and height
    private double w = 250, h = 250;

    /**
     * Construct a default clock with the current time
     */
    public DetailedClockPane() {
        setCurrentTime();
    }

    /**
     * Construct a clock with specified hour, minute, and second
     */
    public DetailedClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();
    }

    /**
     * Return hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Set a new hour
     */
    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    /**
     * Return minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Set a new minute
     */
    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    /**
     * Return second
     */
    public int getSecond() {
        return second;
    }

    /**
     * Set a new second
     */
    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    /**
     * Return clock pane's width
     */
    public double getW() {
        return w;
    }

    /**
     * Set clock pane's width
     */
    public void setW(double w) {
        this.w = w;
        paintClock();
    }

    /**
     * Return clock pane's height
     */
    public double getH() {
        return h;
    }

    /**
     * Set clock pane's height
     */
    public void setH(double h) {
        this.h = h;
        paintClock();
    }

    /**
     * Set the current time for the clock
     */
    public void setCurrentTime() {
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();

        // Set current hour, minute, and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock();// Repaint the clock

    }

    /**
     * Paint the clock
     */
    public void paintClock() {
        // Initialize prefered w and length
        setPrefSize(w, h);

        // Initialize clock parameters
        double clockRadius = (Math.min(w, h) * 0.5) - 25;
        double centerX = w / 2;
        double centerY = h / 2;

        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        //displays lines at the edges of the circle
        double rotation = 0;
        Line[] line = new Line[60];
        double x1, y1, x2, y2;
        for (int i = 0; i < 60; i++) {
            if (i % 5 == 0) {

                x1 = centerX + Math.cos(Math.toRadians(rotation)) * (clockRadius - 10);
                y1 = centerX + Math.sin(Math.toRadians(rotation)) * (clockRadius - 10);
            } else {
                x1 = centerX + Math.cos(Math.toRadians(rotation)) * (clockRadius - 5);
                y1 = centerX + Math.sin(Math.toRadians(rotation)) * (clockRadius - 5);

            }
            x2 = centerX + Math.cos(Math.toRadians(rotation)) * clockRadius;
            y2 = centerX + Math.sin(Math.toRadians(rotation)) * clockRadius;

            line[i] = new Line(x1, y1, x2, y2);
            line[i].setStroke(Color.BLACK);

            rotation += 6;
        }

        //displays numbers
        rotation = -90 + 30;
        Text[] text = new Text[12];
        for (int i = 0; i < 12; i++) {
            double x = centerX - 4 + Math.cos(Math.toRadians(rotation)) * (clockRadius - 17);
            double y = centerX + 5 + Math.sin(Math.toRadians(rotation)) * (clockRadius - 17);
            text[i] = new Text(x, y, i + 1 + "");

            rotation += 30;
        }

        // Draw second hand
        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sline = new Line(centerX, centerY, secondX, secondY);
        sline.setStroke(Color.RED);

        // Draw minute hand
        double mLength = clockRadius * 0.65;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, minuteX, minuteY);
        mLine.setStroke(Color.BLUE);

        //Draw hour hand
        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour + minute / 60) * (2 * Math.PI) / 12);
        double hourY = centerY - hLength * Math.cos((hour + minute / 60) * (2 * Math.PI) / 12);
        Line hLine = new Line(centerX, centerY, hourX, hourY);
        hLine.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle, sline, mLine, hLine);
        // add lines to the pane
        for (int i = 0; i < 60; i++) {
            getChildren().add(line[i]);
        }
        //add numbers to the pane
        for (int i = 0; i < 12; i++) {
            getChildren().add(text[i]);
        }

    }

}
