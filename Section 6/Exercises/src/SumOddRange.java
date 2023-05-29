public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,10));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0) {
            return -1;
        } else if (end < start) {
            return -1;
        }
        for (int i = start;i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
