import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = createArrayList();
        addElements(list);
        retrieveElement(list);
        removeElement(list);
        iterateList(list);
    }

    static ArrayList<String> createArrayList() {
        return new ArrayList<>();
    }

    static void addElements(ArrayList<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Elements added to the list.");
    }

    static void retrieveElement(ArrayList<String> list) {
        String firstElement = list.get(0);
        System.out.println("First element: " + firstElement);
    }

    static void removeElement(ArrayList<String> list) {
        list.remove("Banana");
        System.out.println("Banana removed from the list.");
    }

    static void iterateList(ArrayList<String> list) {
        System.out.println("Iterating over elements:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
