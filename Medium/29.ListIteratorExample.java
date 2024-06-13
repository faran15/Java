import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("C");
        elements.add("A");
        elements.add("E");
        elements.add("B");
        elements.add("D");
        elements.add("F");
        ListIterator<String> iterator = elements.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.set(element + "+");
        }
        System.out.println("Elements in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
