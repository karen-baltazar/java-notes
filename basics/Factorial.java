public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Define the number for which we want to calculate the factorial
        long result = factorial(n); // Call the factorial function
        System.out.println("Factorial of " + n + ": " + result);
    }

    // Function to calculate factorial of n
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case: Factorial of 0 or 1 is 1
        
        long result = 1; // Variable to store the factorial result
        
        // Calculate factorial by multiplying from 2 to n
        for (int i = 2; i <= n; i++) {
            result *= i; // Multiply the current number to the result
        }

        return result; // Return the factorial of n
    }
}
