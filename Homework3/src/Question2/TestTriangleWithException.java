/**
 * Class that tests the Triangle class and 
 * IllegalTriangleException class
 *
 * @course CS203
 * @author Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/20 1am
 */
package Question2;

public class TestTriangleWithException {

    public static void main(String[] args) {
        try {
            // initializing legal triangle
            System.out.println("Legal triangle:");
            Triangle triangle1 = new Triangle(2.0, 2.0, 2.0);
            System.out.println("Perimeter: " + triangle1.getPerimeter());
            System.out.printf("%s%.2f\n\n","Area: ", triangle1.getArea());

            // initializing illegal triangle
            System.out.println("Illegal triangle:");
            Triangle triangle2 = new Triangle(1.0, 2.0, 3.0);
            System.out.println("Perimeter: " + triangle2.getPerimeter());
            System.out.printf("%s%.2f\n\n","Area: ", triangle2.getArea());

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
