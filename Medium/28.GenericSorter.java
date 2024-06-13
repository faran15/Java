import java.util.Arrays;

public class GenericSorter<T extends Comparable<T>> {
    private T[] array;
    public GenericSorter(T[] array) {
        this.array = array;
    }
    public void sort() {
        Arrays.sort(array);
    }
    public void display() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 9};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        System.out.println("Before sorting Integer array:");
        intSorter.display();
        intSorter.sort();
        System.out.println("After sorting Integer array:");
        intSorter.display();
        String[] stringArray = {"banana", "apple", "cherry", "date"};
        GenericSorter<String> stringSorter = new GenericSorter<>(stringArray);
        System.out.println("Before sorting String array:");
        stringSorter.display();
        stringSorter.sort();
        System.out.println("After sorting String array:");
        stringSorter.display();
    }
}
