package Hafta3_Ödevler.List;

    public class MyList<T> {

        private T[] array;            // Internal array to store elements
        private int size;             // Current number of elements in the list
        private static final int DEFAULT_CAPACITY = 10; // Default initial capacity

        // Default constructor - creates array with default capacity
        public MyList() {
            this.array = (T[]) new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        // Constructor with custom initial capacity
        public MyList(int capacity) {
            this.array = (T[]) new Object[capacity];
            this.size = 0;
        }

        // Adds a new element to the list
        public void add(T data) {
            if (size >= array.length) {
                // Double the capacity if array is full
                T[] newArray = (T[]) new Object[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i]; // copy old elements to new array
                }
                array = newArray;
            }
            array[size++] = data; // add new element and increase size
        }

        // Returns the number of elements in the list
        public int size() {
            return this.size;
        }

        // Returns current capacity of the list
        public int getCapacity() {
            return this.array.length;
        }

        // Returns the element at the specified index
        public T get(int index) {
            if (index >= 0 && index < size) {
                return array[index];
            }
            return null; // invalid index
        }

        // Removes the element at the specified index and shifts elements left
        public T remove(int index) {
            if (index < 0 || index >= size) {
                return null;
            }
            T removed = array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1]; // shift left
            }
            array[size - 1] = null; // remove last duplicate
            size--;
            return removed;
        }

        // Replaces the value at the specified index with a new value
        public T set(int index, T data) {
            if (index >= 0 && index < size) {
                T old = array[index];
                array[index] = data;
                return old;
            }
            return null;
        }

        // Converts the list to a string like [10,20,30]
        public String toString() {
            if (size == 0) return "[]";
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                sb.append(array[i]);
                if (i != size - 1) sb.append(",");
            }
            sb.append("]");
            return sb.toString();
        }

        // Returns the index of the first occurrence of the given element
        public int indexOf(T data) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null && data == null) return i;
                if (array[i] != null && array[i].equals(data)) return i;
            }
            return -1;
        }

        // Returns the index of the last occurrence of the given element
        public int lastIndexOf(T data) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == null && data == null) return i;
                if (array[i] != null && array[i].equals(data)) return i;
            }
            return -1;
        }

        // Checks if the list is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Converts the list into a regular array
        public T[] toArray() {
            T[] result = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                result[i] = array[i];
            }
            return result;
        }

        // Clears the list and resets it to default state
        public void clear() {
            this.array = (T[]) new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        // Returns a new MyList containing a sublist from start to end (exclusive)
        public MyList<T> subList(int start, int end) {
            if (start < 0 || end > size || start > end) return null;
            MyList<T> sub = new MyList<>(end - start);
            for (int i = start; i < end; i++) {
                sub.add(array[i]);
            }
            return sub;
        }

        // Checks whether the given element exists in the list
        public boolean contains(T data) {
            return indexOf(data) != -1;
        }
    }
