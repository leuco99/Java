public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Luka");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens.");
        }

        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topscore > secondTopScore) && (topscore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topscore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        // == -> equal to
        // != -> not equal to
        // boolean isCar = false;
        // if (isCar) {
        // This tests if isCar is true

        // boolean isCar = True;
        // if (isCar) {
        // This tests if isCar is true

        //Ternary operator
        // operand1 ? operand 2 : operand 3
    }
}
