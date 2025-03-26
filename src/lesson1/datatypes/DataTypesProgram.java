package lesson1.datatypes;

public class DataTypesProgram {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Numeric integer values
        byte byteVariable = 12; // 1 Byte (2^8)
        short shortVariable = 122; // 2 Bytes (2^16)
        int intVariable = 123456789; // 4 Bytes (2^32)
        long longVariable = 1234567890123456789L; // 8 Bytes (2^64)

        // Numeric decimal values
        float floatVariable = 123465789.13131313f; // 4 Bytes (2^32)
        double doubleVariable = 123465789.13131313; // 8 Bytes (2^64)

        // Boolean data
        boolean booleanVariableTrue = true; // 1 Bit
        boolean booleanVariableFalse = false; // 1 Bit

        // Text
        char character = 'c'; // 2 Bytes (2^16)
        String text = "Hello World!"; // 2 Bytes (2^16) per character

        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longVariable: " + longVariable);
        System.out.println("floatVariable: " + floatVariable);
        System.out.println("doubleVariable: " + doubleVariable);
        System.out.println("booleanVariableTrue: " + booleanVariableTrue);
        System.out.println("booleanVariableFalse: " + booleanVariableFalse);
        System.out.println("character: " + character);
        System.out.println("text: " + text);

        System.out.println("------------OPERATIONS------------");
        System.out.println('c' + 'a'); // 196
        System.out.println('c' + 1); // 100
        System.out.println(text + 1); // Hello World!1
        System.out.println(intVariable + doubleVariable); // 123456789.13131313
        System.out.println(booleanVariableTrue && booleanVariableFalse); // false
        System.out.println(booleanVariableTrue || booleanVariableFalse); // true
        System.out.println(12%2); // 0
    }
}