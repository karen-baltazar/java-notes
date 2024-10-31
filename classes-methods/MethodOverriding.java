// Demonstrates method overriding by redefining a method in a subclass

// Base class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("This animal makes a sound.");
    }
}

// Subclass overriding the sound() method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Another subclass overriding the sound() method
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();    // Calls Animal's sound()
        Animal dog = new Dog();                 // Calls Dog's overridden sound()
        Animal cat = new Cat();                 // Calls Cat's overridden sound()

        genericAnimal.sound();                  // Output: This animal makes a sound.
        dog.sound();                            // Output: The dog barks.
        cat.sound();                            // Output: The cat meows.
    }
}
