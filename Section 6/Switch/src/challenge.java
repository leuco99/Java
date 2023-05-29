public class challenge {
    public static void main(String[] args) {
        printDayOfWeek(2);
    }

    public static void printDayOfWeek (int day) {
        String ans = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.println(day + " stands for " + ans);
    }
}
