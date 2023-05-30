import java.util.Scanner;

public class ServicIml implements Service{
   ;
    @Override
    public static void transferMoney(Payments payments) {

        int amount = (int) payments.getAmount();

        if (amount > payments.getAmount()) {
            System.out.println("You don't have enough money.");
        } else {

            System.out.println("Money transferred successfully.");
        }
    }

    @Override
    public void transferMoney(Payments payments, String phoneNumber) {

        Bank bank= new Bank();
        int amount = (int) payments.getAmount();

        if (amount >  bank.getBankAccount()) {
            System.out.println("You don't have enough money.");
        } else {

            System.out.println("Money transferred to " + phoneNumber + " successfully.");
        }



        }

    }

