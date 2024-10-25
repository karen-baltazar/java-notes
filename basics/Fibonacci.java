public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Define the position in the Fibonacci sequence
        int result = fibonacci(n); // Call the fibonacci function
        System.out.println("Fibonacci number at position " + n + ": " + result);
    }

    // Function to calculate Fibonacci number at position n
    static int fibonacci(int n) {
        if (n == 0) return 0; // Base case: Fibonacci of 0 is 0
        if (n == 1) return 1; // Base case: Fibonacci of 1 is 1
        
        int a = 0; // Represents F(0)
        int b = 1; // Represents F(1)
        int fib = 0; // Variable to store the current Fibonacci number

        // Calculate Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            fib = a + b; // Calculate the next Fibonacci number
            a = b;       // Update a to the last Fibonacci number
            b = fib;     // Update b to the current Fibonacci number
        }

        return fib; // Return the nth Fibonacci number
    }
}

