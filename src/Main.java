import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Person person = new Person(1,"Nuriza","Muratva", 18,"nURIZA@",  "+996554488060", new Bank().getBankAccount(), Payments.COMSERVICE);

        System.out.println( bank.getBankAccount());
        System.out.println( person.getBankAccount());

        ServicIml.transferMoney(Payments.COMSERVICE);
        System.out.println(person.getBankAccount());

        ServicIml.transferMoney(Payments.MOBILECOMMUNICATION);
        System.out.println( person.getBankAccount());

        person.setAge(150);
        person.setEmail("nuriza_email.com");
        person.setPhoneNumber("+1234567890");
        person.placeOfWork();
    }
}












