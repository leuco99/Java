public class one {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
