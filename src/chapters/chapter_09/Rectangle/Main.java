package chapters.chapter_09.Rectangle;

public class Main {
    public static void main(String[] args) {

        RectangleClass rectangle = new RectangleClass(4, 40);
        System.out.println("Width\t\tHeight\t\tArea\t\tPerimeter");
        System.out.printf("%.1f  %11.1f  %11.1f  %9.1f \n", rectangle.getWidth(), rectangle.getHeight(),
                rectangle.getArea(), rectangle.getPerimeter());

        System.out.println("-------------------------------------------");

        RectangleClass rectangle1 = new RectangleClass(3.5, 35.9);
        System.out.println("Width\t\tHeight\t\tArea\t\tPerimeter");
        System.out.printf("%.1f  %11.1f  %11.1f  %9.1f", rectangle1.getWidth(), rectangle1.getHeight(),
                rectangle1.getArea(), rectangle1.getPerimeter());
    }
}
