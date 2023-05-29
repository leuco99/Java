import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loopCount = 0;
        double max = 0;
        double min = 0;

        do {
            System.out.println("Enter a number, or any character to exit:");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                if (loopCount == 0 || number < min) {
                    min = number;
                }
                if (loopCount == 0 || number > max) {
                    max = number;
                }
                loopCount++;

            } catch (NumberFormatException quit) {
                break;
            }
        } while (true);

        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid data entered");

        }
    }
}
