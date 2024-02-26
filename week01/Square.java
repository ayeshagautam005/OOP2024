public class Square {
    public static void main(String[] args) {
        int sideLength;
        int perimeter, area;
        Scanner scan = new Scanner(System.in);

        // Read the length of the square's side from the user
        System.out.print("Enter the length of the square's side: ");
        sideLength = scan.nextInt();

        // Calculate the perimeter and area
        perimeter = 4 * sideLength;
        area = sideLength * sideLength;

        // Display the results
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);
    }
}
