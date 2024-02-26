public class FractionConverter {
    public static void main(String[] args) {
        int numerator, denominator;
        double decimal;
        Scanner scan = new Scanner(System.in);

        // Read the numerator and denominator from the user
        System.out.print("Enter the numerator: ");
        numerator = scan.nextInt();

        System.out.print("Enter the denominator: ");
        denominator = scan.nextInt();

        // Check if denominator is not zero
        if (denominator != 0) {
            // Calculate the decimal equivalent of the fraction
            decimal = (double) numerator / denominator;

            // Display the result
            System.out.println("Decimal equivalent: " + decimal);
        } else {
            // Denominator is zero, cannot calculate
            System.out.println("Cannot divide by zero. Please enter a non-zero denominator.");
        }
    }
}
