public class VariableScope {

    // Instance variable (class scope)
    static int classVariable = 100;

    public static void main(String[] args) {
        // Local variable (local scope)
        int localVariable = 50;

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Class Variable: " + classVariable);

        method();
    }

    static void method() {
        // Local variable within method
        int methodVariable = 30;

        // Accessing instance variable from the class scope
        System.out.println("Method Variable: " + methodVariable);
        System.out.println("Class Variable from method: " + classVariable);
    }
}
