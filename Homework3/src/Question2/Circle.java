/**
 * Class Circle which represents the rectangle shape
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

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
            String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radius is " + radius);
    }

    /**
     * Return perimeter/circumference
     */
    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * getRadius();
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    /**
     * Return a string representation of this object
     */
    @Override
    public String toString() {
        return "Circle: radius = " + radius;
    }
}
