# java-notes

This repository contains my Java learning progress. Below is a table of contents linking to specific topics covered.

## Table of Contents

| Topic               | Description                                                                |
|---------------------|----------------------------------------------------------------------------|
| [Basics](#basics)    | Variables, data types, conditionals, loops, modifiers, and operators |

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
