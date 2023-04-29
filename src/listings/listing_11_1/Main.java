package listings.listing_11_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /*Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is  " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());*/
/*
        Circle circle = new Circle();
        System.out.println(circle);*/

        /*Object myObject = new Circle();
        //System.out.println(((Circle)myObject).getDiameter());
        System.out.println(myObject instanceof Circle);
        System.out.println(myObject instanceof GeometricObject);
        System.out.println(myObject instanceof Rectangle);
        System.out.println(myObject instanceof Object);
*/

        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.shuffle(list);
        System.out.println(list);
    }
}
