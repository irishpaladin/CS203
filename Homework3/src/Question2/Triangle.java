/**
 * Class Rectangle which represents the rectangle shape
 * and implements the abstract class GeometricObject
 * and overrides its abstract methods
 *
 * @course CS203
 * @author Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/20 1am
 */
package Question2;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException(side1, side2, side3, "The sum of any two sides are greater than the other side");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /* Return perimeter */
    @Override
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    /* Return area */
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
    }

    /**
     * Return a string representation of this object
     */
    @Override
    public String toString() {
        return "Triangle: side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = " + getSide3();
    }

    /**
     * @return the side1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * @return the side3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * @param side3 the side3 to set
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }
}

class IllegalTriangleException extends Exception {

    private double side1;
    private double side2;
    private double side3;
    private String message;

    public IllegalTriangleException(double side1, double side2, double side3, String message) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Side1: " + side1 + "\n"
                + "Side2: " + side2 + "\n"
                + "Side3: " + side3 + "\n"
                + message;
    }
}
