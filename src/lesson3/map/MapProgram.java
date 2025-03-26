package lesson3.map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        //Creation and additions
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");

        Map<Integer, String> map2 = Map.of(1, "1", 2, "2");

        System.out.println(map);
        System.out.println(map2);

        //Deletions
        map.remove(1);

        //Useful methods
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        //Traverse a Map - Using Keys
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        //Traverse a Map - Using Values
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        //Traverse a Map - Using Entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //Search for a key
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(3));

        //Search for a value
        System.out.println(map.containsValue("1"));
        System.out.println(map.containsValue("2"));
        System.out.println(map.containsValue("3"));

        //Retrieve a value
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        //Clear the Map
        map.clear();
        System.out.println(map);
    }
}
