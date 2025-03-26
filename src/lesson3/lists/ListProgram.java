package lesson3.lists;

import java.util.LinkedList;
import java.util.List;

public class ListProgram {

    public static void main(String[] args) {

        //Creation and additions
        List<String> words = new LinkedList<>();
        List<String> words2 = List.of("hello", "I", "am", "here", "to", "show", "you", "my", "skills");

        words.add("hello");
        words.add("there");
        System.out.println(words);

        //Useful methods
        System.out.println(words.contains("hello"));
        System.out.println(words.isEmpty());
        int thereIndex = words.indexOf("there");
        System.out.println(thereIndex);

        //Deletion
        words.remove(thereIndex);
        words.remove("hello");
        words.clear();

        //Add data from another list
        words.addAll(words2);

        //Traverse the list
        for(int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
        System.out.println(words);

        //For each loop
        for(String word : words) {
            System.out.println(word);
        }
        System.out.println(words);
    }
}
