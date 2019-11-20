/**
 * Program that test the larger method
 *
 * @course CS203
 * @author Stephanie Irish Paladin
 * @200413341
 * @Assignment 3
 * @last modified: 11/20 1am
 */
package Question2;

class TestLarger {

    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(3.0);
            Circle c2 = new Circle(3.0);
            Circle c3 = new Circle(2.0);
            Rectangle r1 = new Rectangle(2.0, 3.0);
            Rectangle r2 = new Rectangle(3.0, 3.0);
            Triangle t1 = new Triangle(2.0, 2.1, 2.3);
            Triangle t2 = new Triangle(2.0, 3.0, 2.3);

            System.out.println("\nTesting two circles of same radius:");
            LargerResult(larger(c1, c2));

            System.out.println("\nTesting two circles of different radius:");
            LargerResult(larger(c2, c3));

            System.out.println("\nTesting two rectangles of different size:");
            LargerResult(larger(r1, r2));

            System.out.println("\nTesting two triangles of different size:");
            LargerResult(larger(t1, t2));

            System.out.println("\nTesting two different object types:");
            LargerResult(larger(c1, t2));

        } catch (DifferentTypeException e) {
            System.out.println("Two objects are of different Type");
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @displays the result of larger method
     */
    static void LargerResult(GeometricObject obj) {
        if (obj == null) {
            System.out.println("Two objects have equal area");
        } else {
            System.out.println("The returned larger object is: " + obj.toString());
            System.out.printf("%s%.2f\n","The area is " , obj.getArea());
            System.out.printf("%s%.2f\n","The perimeter is " , obj.getPerimeter());
        }
    }

    /**
     * @return object with larger area
     * @return null if same area
     * @throws DifferentTypeException when given different type
     */
    static GeometricObject larger(GeometricObject g1, GeometricObject g2) throws DifferentTypeException {
        // true if two object have different type
        if (!g1.getClass().equals(g2.getClass())) {
            throw new DifferentTypeException();
        }
        // comparing the area of two object
        if (g1.getArea() > g2.getArea()) {
            return g1;
        } else if (g1.getArea() < g2.getArea()) {
            return g2;
        } else {
            return null;
        }
    }
}

class DifferentTypeException extends Exception {
}
