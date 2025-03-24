package br.com.alura.models;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String owner;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void displayInfo(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: " + balance);
        System.out.println("Account owner: " + owner);
    }
}
