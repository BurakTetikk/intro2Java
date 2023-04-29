package chapters.chapter_18.check_points;

public class CheckPoint_18_06 {
    public static void main(String[] args) {
        System.out.printf("%d", sumWithRecursive(17));
    }

    public static int sumWithRecursive(int number) {
        if (number == 1)
            return 1;
        return number + sumWithRecursive(number - 1);
    }
}
