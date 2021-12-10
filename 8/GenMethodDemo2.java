import java.util.ArrayList;
import java.util.List;

public class GenMethodDemo2 {

    public static <T> void addEvens(List<T> from, List<T> to) {
        for (int i = 0; i < from.size(); i += 2)
            to.add(from.get(i));
    }

    public static <T> List<T> newList(int capacity) {
        return new ArrayList<T>(capacity);
    }

    public static void main(String[] args) {
        List<Integer> list1, list2;
        list1 = List.of(1, 2, 3, 4, 5);
        list2 = new ArrayList<Integer>(List.of(6, 7, 8, 9, 0));
        addEvens(list1, list2);
        System.out.println(list2.toString());
        list2 = newList(4);
        System.out.println(list2.toString());
        addEvens(list1, list2);
        System.out.println(list2.toString());

    }
}
