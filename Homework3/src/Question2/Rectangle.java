/**
 * Class Rectangle which represents the rectangle shape
 * and implements the abstract class GeometricObject
 * and overrides its abstract methods
 *
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 3
 * last modified: 11/20 12am
 */
package Question2;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Return perimeter
     */
    @Override
    public double getPerimeter() {
        return (width * 2.0) + (height * 2.0);
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Return a string representation of this object
     */
    @Override
    public String toString() {
        return "Rectangle: width = " + width + ", height = " + height;
    }

}
