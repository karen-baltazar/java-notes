// Demo for Classes, Objects, and Methods in Java

// Define the Book class
class Book {
    String title;
    String author;
    int year;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

public class DemoClassesObjects {
    public static void main(String[] args) {
        // Using the default constructor
        Book book1 = new Book();
        System.out.println("Using default constructor:");
        book1.displayInfo();

        // Using the parameterized constructor
        Book book2 = new Book("1984", "George Orwell", 1949);
        System.out.println("\nUsing parameterized constructor:");
        book2.displayInfo();
    }
}
