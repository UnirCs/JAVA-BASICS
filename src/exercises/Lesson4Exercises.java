package exercises;

import java.util.List;

public class Lesson4Exercises {

    /**
     * TODO: Implement average method
     *
     * It takes a list of integer as input, returns the average value
     *
     * average(1, 2, 3, 4, 5, 6, 7, 8) -> 4.5
     */
    static Double average(List<Integer> list) {
        return 0.0;
    }


    /**
     * TODO: Implement max method
     *
     * It takes a list of integer as input (unordered), returns the greatest value
     *
     * max(1, 2, 3, 4, 5, 6, 9, 8) -> 9
     */
    static Integer max(List<Integer> list) {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(average(List.of(1, 2, 3, 4, 5, 6, 7, 8))); // 4.5
        System.out.println(max(List.of(1, 2, 3, 4, 5, 6, 9, 8))); // 9
    }
}
