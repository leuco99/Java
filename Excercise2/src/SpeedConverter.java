public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.60934);

    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
