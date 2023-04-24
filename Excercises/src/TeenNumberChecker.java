public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(0, 99, 20));
    }

    public static boolean hasTeen (int t1, int t2, int t3) {
        return (((t1 >= 13) && (t1 <= 19)) || ((t2 >= 13) && (t2 <= 19)) || ((t3 >= 13) && (t3 <= 19)));
    }

    public static boolean isTeen (int n1) {
        return ((n1 >= 13) && (n1 <= 19));
    }
}
