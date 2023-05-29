public class ForStatementChallenge {
    public static void main(String[] args) {

        int countMatches = 0;
        int sumMatches = 0;

        for (int loopVariable = 1; loopVariable <= 1000; loopVariable++) {
            if ((loopVariable % 3 == 0) && (loopVariable % 5 == 0)) {
                countMatches++;
                sumMatches += loopVariable;
                System.out.println("Found a match = " + loopVariable);
            }
            if (countMatches == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sumMatches);
    }


}
