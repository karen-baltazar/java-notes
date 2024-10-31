// Demonstrates parameter passing in Java

public class ParameterPassing {

    // Method to modify a primitive type parameter
    public void modifyPrimitive(int number) {
        number += 10; // Attempts to modify the original value
        System.out.println("Inside modifyPrimitive: " + number); // Shows modified value within method
    }

    // Method to modify an object's field
    public void modifyObjectField(Person person) {
        person.name = "Changed Name"; // Modifies the name field of the passed object
        System.out.println("Inside modifyObjectField: " + person.name); // Shows modified name within method
    }

    public static void main(String[] args) {
        ParameterPassing example = new ParameterPassing();

        // Passing a primitive type
        int originalNumber = 20;
        System.out.println("Before modifyPrimitive: " + originalNumber); // Shows original value
        example.modifyPrimitive(originalNumber); // Passes primitive type
        System.out.println("After modifyPrimitive: " + originalNumber); // Shows unchanged value outside method

        // Passing an object
        Person person = new Person("Original Name");
        System.out.println("Before modifyObjectField: " + person.name); // Shows original name
        example.modifyObjectField(person); // Passes object reference
        System.out.println("After modifyObjectField: " + person.name); // Shows modified name outside method
    }
}

// Helper class to demonstrate object parameter passing
class Person {
    String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }
}
