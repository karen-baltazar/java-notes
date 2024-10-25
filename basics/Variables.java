class Variables {
    public static void main(String args[]) {
        // Declare and initialize variables
        char a = 'A';
        int i = 43;
        byte b = 2;
        short s = 53;
        double d = 4.43353;
        float f = 54.5f;
        long l = 1343235;
        String str = "Hello, Java!"; // String variable
        int[] arr = {1, 2, 3, 4, 5}; // Array of integers

        // Print variable values
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println("string: " + str);
        
        // Print array elements
        System.out.print("array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline after array elements
    }
}
