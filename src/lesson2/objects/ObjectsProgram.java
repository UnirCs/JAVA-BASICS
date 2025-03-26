package lesson2.objects;

import java.time.LocalDate;

public class ObjectsProgram {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice("Mariano", "Brown", 23, LocalDate.of(2000,1,1));

        System.out.println(invoice1.toString());
        System.out.println(invoice2.toString());

        invoice2.addCharges(20, 30, 50);
        System.out.println(invoice2.toString());

    }
}
