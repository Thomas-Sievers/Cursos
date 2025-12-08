import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = "";
        String type = "";
        double balance = 0;
        boolean processing = false;
        int choice = 0;
        double receiveMoney = 0;
        double transferMoney = 0;

        if (name.isEmpty()) {
            System.out.println("************************");
            System.out.println("Let's create your new bank account!");
            System.out.println("Type your name: ");
            name = read.nextLine();
            System.out.println("Tell me which type of account fit the best for you: ");
            type = read.nextLine();
            System.out.println("Type your balance: ");
            balance = read.nextDouble();
            System.out.println("************************");
            processing = true;
        }
        else {
            System.out.println("Already logged in!");
            processing = true;
        }

        while (processing) {
            System.out.println("************************");
            System.out.println("Choose a number:");
            System.out.println("1 - Profile");
            System.out.println("2 - Receive");
            System.out.println("3 - Transfer");
            System.out.println("4 - Exit");
            choice = read.nextInt();
            System.out.println("************************");

            switch (choice) {
                case 1:
                    System.out.println("Name: " + name);
                    System.out.println("Account type: " + type);
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.println("Type how much money you are receiving: ");
                    receiveMoney = read.nextDouble();
                    balance += receiveMoney;
                    break;
                case 3:
                    System.out.println("Type how much money you are transfering: ");
                    transferMoney = read.nextDouble();
                    if (transferMoney > balance) {
                        System.out.println("Not enought balance.");
                        break;
                    }
                    else {
                        balance -= transferMoney;
                        break;
                    }
                case 4:
                    System.out.println("Finishing process...");
                    processing = false;
                    break;
                default:
                    System.out.println("Type a valid option");
                    break;
            }
        }
    }
}