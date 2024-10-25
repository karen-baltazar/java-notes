public class Conditionals {
    public static void main(String args[]) {
        int i = 5;
        
        // Call methods to demonstrate different conditional statements
        ifDemo(i);
        ifElseDemo(i);
        ifElseIfDemo(i);
        switchDemo(i);
        continueDemo();
    }
    
    // Demonstrate a simple if statement
    static void ifDemo(int num) {
        if (num < 15) {
            System.out.println("Inside If block");
            System.out.println(num + " is less than 15");
        }
        System.out.println("Outside If block");
    }

    // Demonstrate an if-else statement
    static void ifElseDemo(int num) {
        if (num < 10) {
            System.out.println(num + " is less than 10");
        } else {
            System.out.println(num + " is 10 or greater");
        }
    }

    // Demonstrate an if-else if-else statement
    static void ifElseIfDemo(int num) {
        if (num < 0) {
            System.out.println(num + " is negative");
        } else if (num == 0) {
            System.out.println(num + " is zero");
        } else {
            System.out.println(num + " is positive");
        }
    }

    // Demonstrate a switch statement
    static void switchDemo(int num) {
        switch (num) {
            case 1:
                System.out.println(num + " is one");
                break;
            case 5:
                System.out.println(num + " is five");
                break;
            default:
                System.out.println(num + " is not one or five");
                break;
        }
    }

    // Demonstrate the use of continue in a loop
    static void continueDemo() {
        System.out.println("Demonstrating continue in a loop:");
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(j + " is an odd number");
        }
    }
}
