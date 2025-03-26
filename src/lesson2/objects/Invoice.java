package lesson2.objects;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Invoice {

    //Class Attributes (Global variables)
    private static int TAX_PERCENTAGE = 12;

    //Instance Attributes (Object variables)
    private String name;
    private String surname;
    private int age;
    private LocalDate birthDate;
    private LocalDateTime invoiceGenerationDateTime;
    private double charge1;
    private double charge2;
    private double charge3;
    private double subTotal;
    private double total;

    public Invoice() {}

    //Overload - Same method with different args aka Static Polymorphism

    public Invoice(String name, String surname, int age, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthDate = birthDate;
        this.invoiceGenerationDateTime = LocalDateTime.now();
    }

    //Functions are not Objects in Java By Default - This is not JavaScript

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getInvoiceGenerationDateTime() {
        return invoiceGenerationDateTime;
    }

    public void setInvoiceGenerationDateTime(LocalDateTime invoiceGenerationDateTime) {
        this.invoiceGenerationDateTime = invoiceGenerationDateTime;
    }

    public double getCharge1() {
        return charge1;
    }

    public void setCharge1(double charge1) {
        this.charge1 = charge1;
    }

    public double getCharge2() {
        return charge2;
    }

    public void setCharge2(double charge2) {
        this.charge2 = charge2;
    }

    public double getCharge3() {
        return charge3;
    }

    public void setCharge3(double charge3) {
        this.charge3 = charge3;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //Other methods
    public void addCharges(double charge1, double charge2, double charge3) {
        this.charge1 = charge1;
        this.charge2 = charge2;
        this.charge3 = charge3;
        this.subTotal = charge1 + charge2 + charge3;
        this.total = this.subTotal + this.subTotal * TAX_PERCENTAGE / 100;
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("Invoice Detail");
        builder.append("\n\tName :" + this.name);
        builder.append("\n\tSurname :" + this.surname);
        builder.append("\n\tDate of Birth :" + this.birthDate);
        builder.append("\n\tGeneration Date :" + this.invoiceGenerationDateTime);
        builder.append("\n\tCharges : " + this.charge1 + " " + this.charge2 + " " + this.charge3 + " (€)");
        builder.append("\n\tSubtotal : " + this.subTotal + " (€)");
        builder.append("\n\tTotal (" + TAX_PERCENTAGE + "% Tax) : " + this.total + " (€)");
        return builder.toString();
    }
}
