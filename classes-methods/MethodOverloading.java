// Demonstrates method overloading with different parameter configurations

public class MethodOverloading {

    // Method with one parameter
    public void displayInfo(int age) {
        System.out.println("Age: " + age);
    }

    // Overloaded method with two parameters (change in number of parameters)
    public void displayInfo(int age, String name) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with a different data type (change in data types)
    public void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method with changed order of parameters
    public void displayInfo(String name, int age) {
        System.out.println("Overloaded - Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();

        example.displayInfo(25);                       // Calls method with one int parameter
        example.displayInfo(30, "Alice");              // Calls method with int and String
        example.displayInfo("Bob");                    // Calls method with one String parameter
        example.displayInfo("Charlie", 35);            // Calls method with String and int (order changed)
    }
}
