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
        if (topscore > secondTopScore && topscore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

    }
}
