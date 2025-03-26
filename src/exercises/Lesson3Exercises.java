package exercises;

public class Lesson3Exercises {

    /**
     * TODO: Implement nAstConsec method
     *
     * nAstConsec(he**o, 2) = true
     * nAstConsec(he***, 2) = true
     * nAstConsec(he**o, 3) = false
     * nAstConsec(hello, 1) = false
     * nAstConsec(*el*o, 2) = false
     */
    static boolean nAstConsec(String str, int n) {
        return false;
    }

    public static void main(String[] args) {

        // Test your method with the examples given in the method's description
        System.out.println(nAstConsec("he**o", 2)); // Expected: true
        System.out.println(nAstConsec("he***", 2)); // Expected: true
        System.out.println(nAstConsec("he**o", 3)); // Expected: false
        System.out.println(nAstConsec("hello", 1)); // Expected: false
        System.out.println(nAstConsec("*el*o", 2)); // Expected: false
    }
}
