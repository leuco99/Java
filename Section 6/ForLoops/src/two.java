public class two {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; count < 10 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a Prime Number");
                count++;
            }
        }
        System.out.println("There are " + count + " prime numbers");
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
