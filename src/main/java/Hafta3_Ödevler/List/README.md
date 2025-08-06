# MyList<T> - Custom Generic List Implementation in Java

This project is a custom implementation of a dynamic list structure in Java using generics.  
It mimics some of the behavior of Java's built-in `ArrayList` class **without using any Java Collections Framework**.

---

## 🚀 Features

- Generic type support (e.g., `MyList<Integer>`, `MyList<String>`)
- Dynamic array resizing (doubles capacity when needed)
- Manual management of capacity and elements
- Built-in utility methods such as:
    - `add(T data)`
    - `get(int index)`
    - `remove(int index)`
    - `set(int index, T data)`
    - `toString()`
    - `indexOf()`, `lastIndexOf()`
    - `contains()`, `isEmpty()`, `clear()`
    - `toArray()`, `subList(int start, int end)`

---

## 🛠️ Technologies Used

- Java SE (Standard Edition)
- No external libraries
- No use of `ArrayList`, `LinkedList`, or any Java Collection

---

## 📁 Project Structure

src/
┣ MyList.java // The custom generic list class
┗ Main.java // Class for testing all functionality

---

## ▶️ How to Run

1. Make sure you have Java installed on your machine (JDK 8 or higher).
2. Clone or download the repository.
3. Open the terminal in the `src/` directory.
4. Compile both files:

```bash
javac MyList.java Main.java
Run the program:

📌 Example Output

Is list empty? true
Capacity: 10
Size: 0
Size after additions: 11
Capacity after additions: 20
List: [10,20,30,40,20,50,60,70,80,90,100]
Element at index 2: 30
Removing element at index 2: 30
Setting index 0 to 999: 10
List after changes: [999,20,40,20,50,60,70,80,90,100]
Index of 20: 1
Last index of 20: 3
Contains 50? true
Contains 777? false
First element in array: 999
Sublist (0 to 4): [999,20,40,20]
List after clear: []
Is list empty now? true
👤 Author
Developed by Muhammet Emin Gökalp Kurt

Custom Generic List for Backend Java Training – Patika+

📃 License
This project is open-source and available for educational purposes