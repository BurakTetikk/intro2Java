package listings.listing_11_8;
import listings.listing_11_1.Circle;

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size? " + cityList.size());
        System.out.println("Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in list?" + cityList.indexOf("Denver"));
        System.out.println("Is the list empty?" + cityList.isEmpty());
        System.out.println("Is the list empty?" + cityList.isEmpty());

        cityList.add(2, "Ankara");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2));
        circles.add(new Circle(3));

        System.out.println("The area of the circle? " + circles.get(0).getArea());

        String city = cityList.get(0);
        System.out.println(city);
        cityList.set(3, "Istanbul");
        System.out.println(cityList.get(3));

    }
}
