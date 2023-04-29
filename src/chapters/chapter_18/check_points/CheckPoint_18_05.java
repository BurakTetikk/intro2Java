package chapters.chapter_18.check_points;

public class CheckPoint_18_05 {
    public static void main(String[] args) {
        System.out.printf("%.2f", powerOfX(4, 3));
    }

    public static double powerOfX(double number, int power) {
        if (power == 0)
            return 1;
        else
            return number * powerOfX(number, (power - 1));
    }
}
