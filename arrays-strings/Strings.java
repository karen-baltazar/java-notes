public class Strings {

    public static void main(String[] args) {
        stringConcatenation();
        stringLength();
        stringUppercase();
        stringSubstring();
        stringComparison();
        stringSplitting();
    }

    // String concatenation using different methods
    static void stringConcatenation() {
        String greeting = "Hello, ";
        String name = "World!";
        
        // Method 1: Using + operator
        String message1 = greeting + name;
        System.out.println("Concatenation using + : " + message1);
        
        // Method 2: Using concat() method
        String message2 = greeting.concat(name);
        System.out.println("Concatenation using concat(): " + message2);
        
        // Method 3: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(greeting).append(name);
        String message3 = sb.toString();
        System.out.println("Concatenation using StringBuilder: " + message3);
    }

    // Getting the length of a string
    static void stringLength() {
        String example = "Length of this string";
        int length = example.length();
        System.out.println("Length: " + length);
    }

    // Converting a string to uppercase
    static void stringUppercase() {
        String original = "lowercase string";
        String upper = original.toUpperCase();
        System.out.println("Uppercase: " + upper);
    }

    // Extracting substrings
    static void stringSubstring() {
        String text = "Extract this substring";
        
        // Method 1: Using substring() with start and end index
        String substring1 = text.substring(8, 18);
        System.out.println("Substring (8, 18): " + substring1);
        
        // Method 2: Using substring() with only start index
        String substring2 = text.substring(8);
        System.out.println("Substring from index 8: " + substring2);
    }

    // String comparison
    static void stringComparison() {
        String str1 = "Java";
        String str2 = "Java";
        boolean isEqual = str1.equals(str2);
        System.out.println("Comparison (equals): " + isEqual);
    }

    // Splitting a string
    static void stringSplitting() {
        String sentence = "Split,this,sentence";
        String[] parts = sentence.split(",");
        System.out.println("Split result: ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
