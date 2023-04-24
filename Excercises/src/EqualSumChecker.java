public class EqualSumChecker {
    public static void main(String[] args) {
     System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int n1, int n2, int n3) {
        int sum = n1 + n2;
        return sum == n3;
    }
}
