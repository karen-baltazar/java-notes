// Class to represent a Book with an ID and title
class Book {
    public int id;
    public String title;

    // Constructor to initialize the Book object
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

public class Arrays {

    public static void main(String[] args) {
        singleDimensionalArray();
        multiDimensionalArray();
        arrayOfObjects();
    }

    // Single-Dimensional Array
    static void singleDimensionalArray() {
        System.out.println("Single-Dimensional Array:");

        // Declaration and initialization of a single-dimensional array
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println();
    }

    // Multi-Dimensional Array
    static void multiDimensionalArray() {
        System.out.println("Multi-Dimensional Array:");

        // Declaration of a 3x3 2D array with fixed size
        int[][] matrix = new int[3][3];

        // Filling the 2D array with values
        int value = 1;  // Starting value to fill the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;  // Assign value to the current element
                value++;  // Increment value for the next element
            }
        }

        // Access and print each element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }
        System.out.println();
    }

    // Array of Objects Example
    static void arrayOfObjects() {
        System.out.println("Array of Objects:");

        // Create an array of Book objects
        Book[] library = {
            new Book(101, "Java Programming"),
            new Book(102, "Data Structures"),
            new Book(103, "Algorithm Design")
        };

        // Access and print each Book object's properties
        for (int i = 0; i < library.length; i++) {
            System.out.println("Book ID: " + library[i].id + ", Title: " + library[i].title);
        }
        System.out.println();
    }
}
