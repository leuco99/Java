public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1984.292445, 1984.292444));
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        int check1 = (int) (num1 * 1000);
        int check2 = (int) (num2 * 1000);
        System.out.println("C1 = " + check1 + " C2 = " + check2);
        int ans = check2 - check1 ;
        return ans == 0;
    }
}
