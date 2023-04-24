public class Main {
    public static void main(String[] args) {

        int result = calculateHighScorePosition(1500);
        displayHighScorePosition("Luka", result);

        result = calculateHighScorePosition(1000);
        displayHighScorePosition("Luka", result);

        result = calculateHighScorePosition(500);
        displayHighScorePosition("Luka", result);

        result = calculateHighScorePosition(100);
        displayHighScorePosition("Luka", result);

        result = calculateHighScorePosition(25);
        displayHighScorePosition("Luka", result);
    }

    public static void displayHighScorePosition(String playerName, int playerPos) {
        System.out.println(playerName + " managed to get into position " + playerPos + " on the high score list.");
    }
    public static int calculateHighScorePosition(int playerScore) {
        int result = 4;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        }
        return result;

    }
}
