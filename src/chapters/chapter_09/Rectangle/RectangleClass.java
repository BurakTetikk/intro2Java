package chapters.chapter_09.Rectangle;

public class RectangleClass {
    private double width = 1;
    private double height = 1;

    public RectangleClass() {

    }

    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }


    public double getArea() {
        return  width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

}
