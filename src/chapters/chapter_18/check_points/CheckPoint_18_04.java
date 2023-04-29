package chapters.chapter_18.check_points;

public class CheckPoint_18_04 {
    public static void main(String[] args) {
        System.out.printf("%d", powerOf2(10));

    }

    public static int powerOf2(int number) {
        if (number == 0)
            return 1;
        else
            return 2 * powerOf2(number - 1);
    }
}
