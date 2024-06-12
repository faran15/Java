import java.util.Arrays;

public class GenericSorter<T extends Comparable<T>> {

    public void sort(T[] array) {
        Arrays.sort(array);
    }
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        GenericSorter<Integer> intSorter = new GenericSorter<>();
        System.out.println("Integer array before sorting:");
        intSorter.printArray(intArray);
        intSorter.sort(intArray);
        System.out.println("Integer array after sorting:");
        intSorter.printArray(intArray);

        String[] stringArray = {"apple", "orange", "banana", "pear"};
        GenericSorter<String> stringSorter = new GenericSorter<>();
        System.out.println("\nString array before sorting:");
        stringSorter.printArray(stringArray);
        stringSorter.sort(stringArray);
        System.out.println("String array after sorting:");
        stringSorter.printArray(stringArray);

        Double[] doubleArray = {3.2, 1.5, 4.7, 2.8};
        GenericSorter<Double> doubleSorter = new GenericSorter<>();
        System.out.println("\nDouble array before sorting:");
        doubleSorter.printArray(doubleArray);
        doubleSorter.sort(doubleArray);
        System.out.println("Double array after sorting:");
        doubleSorter.printArray(doubleArray);
    }
}
