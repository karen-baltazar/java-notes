public class NumberSwapper {
    public static void main(String[] args) {
        int x = 5, y = 3;

        // Display values before swap
        System.out.println("Before Swap");
        System.out.println("x: " + x + ", y: " + y);

        // Swap x and y using a temporary variable
        int temp = x; // Store the value of x in temp
        x = y;        // Assign the value of y to x
        y = temp;     // Assign the value of temp (original x) to y

        // Display values after swap
        System.out.println("After Swap");
        System.out.println("x: " + x + ", y: " + y);
    }
}
