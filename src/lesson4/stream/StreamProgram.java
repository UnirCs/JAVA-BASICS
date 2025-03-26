package lesson4.stream;

import javax.swing.text.html.Option;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class StreamProgram {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list2 = list.stream().map(number -> number*=2).toList();
        System.out.println(list2);

        List<Integer> listFiltered = list.stream().filter(number -> number % 2 == 0).toList();
        System.out.println(listFiltered);

        Optional<Integer> firstNumberGreaterThan10 = list.stream().filter(number -> number > 10).findFirst();
        System.out.println(firstNumberGreaterThan10);

        Integer x = list.stream().filter(number -> number > 10).findFirst().orElse(-1);
        System.out.println(x);

        List<Integer> anotherList = list.stream().filter(number -> number % 2 != 0).map(number -> number *= 3).toList();
        System.out.println(anotherList);
    }
}
