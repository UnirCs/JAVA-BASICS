package lesson4.optional;

import java.util.Optional;

public class OptionalProgram {

    public static void main(String[] args) {

        Optional<String> strOptional = Optional.of("Something");
        Optional<String> emptyOptional = Optional.empty();

        //Check if present or empty
        if(strOptional.isPresent()) {
            System.out.println(strOptional.get());
        } else {
            System.out.println("Empty Optional");
        }

        if(emptyOptional.isEmpty()) {
            System.out.println("Empty Optional");
        } else {
            System.out.println(emptyOptional.get());
        }

        //Other ways...
        System.out.println(strOptional.orElse("Empty"));
        System.out.println(emptyOptional.orElse("Empty"));
        System.out.println(strOptional.orElseThrow());
        System.out.println(strOptional.orElseThrow(IllegalArgumentException::new));
    }
}
