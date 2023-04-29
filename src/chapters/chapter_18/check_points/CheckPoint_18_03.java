package chapters.chapter_18.check_points;

public class CheckPoint_18_03 {
    public static void main(String[] args) {
       // System.out.printf("Sum is %d", xMethods(5));
        xMethod(1234567);
    }

    public static int xMethods(int number) {
        if (number == 1)
            return 1; //-> base case
        return number + xMethods(number - 1); // -> recursive call
    }

    public static void xMethod(int number) {
        if (number > 0) {
            System.out.println(number % 10);
            xMethod(number / 10);
        }
    }
}
