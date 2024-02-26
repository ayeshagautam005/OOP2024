public class Converter {
    public static void main(String[] args) {
        double miles, kilometers;
        final double MILES_TO_KM = 1.60935;
        Scanner scan = new Scanner(System.in);

        // Read miles from user
        System.out.print("Enter the distance in miles: ");
        miles = scan.nextDouble();

        // Convert miles to kilometers
        kilometers = miles * MILES_TO_KM;

        // Display the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
