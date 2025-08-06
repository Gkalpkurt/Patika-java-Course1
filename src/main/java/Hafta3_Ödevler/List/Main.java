package Hafta3_Ödevler.List;

public class Main {
    public static void main(String[] args) {

        // Create a new list of integers
        MyList<Integer> list = new MyList<>();

        // Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // Show capacity and current size
        System.out.println("Capacity: " + list.getCapacity());
        System.out.println("Size: " + list.size());

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20); // duplicate element
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        // Size and capacity after adding elements
        System.out.println("Size after additions: " + list.size());
        System.out.println("Capacity after additions: " + list.getCapacity());

        // Print the list
        System.out.println("List: " + list.toString());

        // Get element at index
        System.out.println("Element at index 2: " + list.get(2));

        // Remove element at index
        System.out.println("Removing element at index 2: " + list.remove(2));

        // Set element at index
        System.out.println("Setting index 0 to 999: " + list.set(0, 999));

        // Print updated list
        System.out.println("List after changes: " + list.toString());

        // Check indexes
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        // Check if values exist
        System.out.println("Contains 50? " + list.contains(50));
        System.out.println("Contains 777? " + list.contains(777));

        // Convert to array
        Object[] objArray = list.toArray();
        System.out.println("First element in array: " + objArray[0]);

        // Sublist
        MyList<Integer> sub = list.subList(0, 4);
        System.out.println("Sublist (0 to 4): " + sub.toString());

        // Clear list
        list.clear();
        System.out.println("List after clear: " + list.toString());
        System.out.println("Is list empty now? " + list.isEmpty());
    }
}
