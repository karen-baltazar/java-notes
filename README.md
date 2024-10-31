# java-notes

This repository contains my Java learning progress. Below is a table of contents linking to specific topics covered.

## Table of Contents

| Topic               | Description                                                                |
|---------------------|----------------------------------------------------------------------------|
| [Basics](#basics)    | Variables, data types, conditionals, loops, modifiers, and operators |
| [Arrays & Strings](#arrays--strings) | Arrays, strings, type conversion, and scope     |
| [Classes, Objects & Methods](#classes-objects--methods) | Classes, objects, methods, constructors, and method overloading/overriding |

## Basics

### Data Types & Variables
In Java, data types specify the size and type of values that can be stored in variables. Common data types include:
- **Primitive Types**: int, char, boolean, float, etc.
- **Non-Primitive Types**: Strings, arrays, classes.

Variables are containers for storing data values. You can declare a variable like this:
```java
int number = 10;
String name = "John";
```

### Conditional Statements
Java provides several ways to control the flow of execution based on conditions:
- **if**: Executes code if a condition is true.
- **if-else**: Executes code based on whether a condition is true or false.
- **switch**: Allows multi-way branching based on the value of an expression.
- **break**: Exits a loop or switch statement.
- **continue**: Skips the current iteration of a loop.
- **jump statements**: Such as return to exit a method.

Example:
```java
if (number > 5) {
    System.out.println("Number is greater than 5");
} else {
    System.out.println("Number is 5 or less");
}
```

### Loops
Loops allow repetitive execution of a block of code:
- **for loop**: Executes a block of code a specific number of times.
- **while loop**: Repeats as long as a condition is true.
- **do-while loop**: Executes at least once before checking the condition.
- **nested loops**: Loops inside other loops for multi-dimensional iterations.

Example:
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Modifiers & Operators
- **Modifiers**: Control the visibility and behavior of classes, methods, and variables. Examples: public, private, static.
- **Operators**: Perform operations on variables and values. Types include arithmetic (+, -, *, /), relational (==, !=), and logical (&&, ||).

```java
int sum = 5 + 10;  // Arithmetic
boolean isEqual = (sum == 15);  // Relational
boolean result = (isEqual && true);  // Logical
```

## Arrays & Strings

### Arrays

Arrays are data structures that store multiple values of the same type. They allow for efficient data management and manipulation. Key characteristics include:

- **Declaration**: Arrays are declared with a fixed size, which determines how many elements can be stored.

- **Initialization**: Elements can be initialized at the time of declaration or later.

- **Access**: Individual elements are accessed using their index, starting from 0.

- **Types**: Java supports single-dimensional and multi-dimensional arrays, as well as arrays of objects.

Arrays facilitate the storage and retrieval of data efficiently, making them essential for various algorithms.

Example:
```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[2]); // Output: 3
```

### Strings

Strings in Java are sequences of characters used to represent text. They are immutable, meaning once created, their values cannot be altered. Common functionalities include:

- **Concatenation**: Combining strings using the `+` operator.
  
- **Length**: The `length()` method returns the number of characters in a string.

- **Uppercase Conversion**: The `toUpperCase()` method converts all characters to uppercase.

- **Substring Extraction**: The `substring(startIndex, endIndex)` method retrieves part of a string.

- **Comparison**: Use `equals()` to compare two strings for equality.

- **Splitting**: The `split(delimiter)` method divides a string into an array based on a specified delimiter.

Strings are fundamental for handling textual data in Java applications.

Example:
```java
String greeting = "Hello, " + "World!";
System.out.println(greeting); // Output: Hello, World!
```

### ArrayList

ArrayList is a part of the Java Collection Framework and provides a resizable array implementation. Unlike standard arrays, ArrayLists can grow dynamically as elements are added or removed. Key features include:

- **Dynamic Resizing**: ArrayLists can adjust their size automatically, allowing for more flexible data storage.
  
- **Index-Based Access**: Elements can be accessed using their index, similar to arrays.

- **Methods**: ArrayLists provide various methods such as `add()`, `remove()`, `get()`, and `size()` for managing elements.

- **Type Safety**: With generics, ArrayLists can store specific types, ensuring type safety at compile time.

ArrayLists are particularly useful when the number of elements is unknown or changes frequently.

Example:
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
System.out.println("First fruit: " + fruits.get(0)); // Output: First fruit: Apple
```

### Scope of Variables

The scope of a variable defines the region within a program where the variable can be accessed or referenced. Java has several scopes, including:

- **Local Scope**: Variables defined within a method or block are local to that method or block. They cannot be accessed outside of it.
  
- **Instance Scope**: Instance variables are associated with an object and can be accessed by any method in the class. They are defined within a class but outside any method.

- **Class Scope**: Class variables (static variables) are shared among all instances of a class. They can be accessed using the class name and are defined with the `static` keyword.

Understanding variable scope is crucial for managing memory and ensuring that variables are used effectively within a program.

Example:
```java
void method() {
    int localVariable = 10; // Local scope
    System.out.println(localVariable);
}
```

### Type Conversion

Type conversion in Java refers to converting a variable from one data type to another. There are two main types of conversions:

- **Implicit Conversion**: Also known as automatic type conversion, this occurs when the compiler automatically converts a smaller data type to a larger data type without explicit instructions. For example, converting an `int` to a `double`.

- **Explicit Conversion**: Also known as casting, this requires a specific instruction to convert a larger data type to a smaller data type. This is done by placing the desired data type in parentheses before the variable. For example, converting a `double` to an `int`.

Type conversion is important for performing operations on different data types and ensuring data integrity.

Example:
```java
int number = 5;
double convertedNumber = number; // Implicit conversion
int castedNumber = (int) 9.99; // Explicit conversion
```

## Classes, Objects & Methods

### Classes & Objects

In Java, a **class** is a blueprint that defines the properties (attributes) and behaviors (methods) common to all objects of that type. An **object** is an instance of a class containing specific values for its attributes.

- **Creating a Class**: Define attributes and methods that describe the object.
- **Instantiating an Object**: Use the `new` keyword to create an object from a class.

Example:
```java
class Car {
    String color;
    int year;

    void displayInfo() {
        System.out.println("Color: " + color + ", Year: " + year);
    }
}

Car myCar = new Car();
myCar.color = "Red";
myCar.year = 2020;
myCar.displayInfo(); // Outputs: Color: Red, Year: 2020
```

### Methods in Java

A **method** is a function that belongs to a class, defining a behavior and potentially performing actions or returning values.

- **Declaring a Method**: Defined with a return type, name, and optionally parameters in parentheses.
- **Calling a Method**: Invoked using an object of the class or directly if it is static.

Example:
```java
void greet() {
    System.out.println("Hello!");
}

greet(); // Outputs: Hello!
```

### Method Overloading | Method Overriding

- **Overloading**: Allows defining multiple methods with the same name in a class, as long as they have different parameter types or counts.

Example:
```java
void display(int num) {
    System.out.println("Number: " + num);
}

void display(String text) {
    System.out.println("Text: " + text);
}
```

- **Overriding**: Allows a subclass to provide a specific implementation of a method already defined in its superclass.

### Parameter Passing in Java

Java passes parameters to methods in two main ways:

- **By Value**: Primitives are passed by value, so changes inside the method do not affect the original variable.
- **By Reference**: Objects are passed by reference, allowing modifications to their attributes within the method.

Example:
```java
void updateNumber(int num) {
    num = num + 10;
    System.out.println("Inside method: " + num);
}

int myNum = 5;
updateNumber(myNum); // Outputs: Inside method: 15
System.out.println("Outside method: " + myNum); // Outputs: Outside method: 5
```

### Constructors in Java

A **constructor** is a special method called automatically when an object is created. It is used to initialize the object with specific values.

- **Default Constructor**: Java provides a no-argument constructor if none is defined.
- **Parameterized Constructor**: You can create a constructor with parameters to set initial values.

Example:
```java
class Car {
    String color;
    int year;

    Car(String color, int year) {
        this.color = color;
        this.year = year;
    }
}

Car myCar = new Car("Blue", 2021);
```
