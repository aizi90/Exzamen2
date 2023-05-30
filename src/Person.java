import java.math.BigDecimal;
import java.util.Scanner;

public class Person   {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private int bankAccount;
    private Payments payments;

    public Person(long id, String firstName, String lastName, int age, String email, String phoneNumber, int bankAccount, Payments payments) {
        this.id = id;
        this.firstName = firstName;
       this. lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
        this.payments = payments;
    }

    public Person() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 127) {
            System.out.println(" жаш туура емес");
        } else {
            this.age = age;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@ ")) {
            System.out.println("emil туура емес @");
        } else {
            this.email = email;
        }

    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.startsWith("+996") || !phoneNumber.substring(4).matches("\\d+")) {
            System.out.println(" Кыргыз мобилный номерин алабыз");
        } else {
            this.phoneNumber = phoneNumber;
        }


    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {

        this.bankAccount = bankAccount;
    }

    public Payments getPayments() {

        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }
    public void placeOfWork() {

        System.out.println(firstName + " " + lastName + " works in the " + payments + " department.");
    }
}








