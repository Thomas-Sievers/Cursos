package br.com.alura.desafio_heranca.bank;

public class BankAccount {
    private double balance;
    private double depositMoney;
    private double withdrawMoney;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getWithdrawMoney() {
        return withdrawMoney;
    }

    public void setWithdrawMoney(double withdrawMoney) {
        this.withdrawMoney = withdrawMoney;
    }

    public void checkBalance(){
        System.out.println("You've $" + balance + " in your bank account");
    }

    public void deposit(double depositMoney){
        balance += depositMoney;
    }

    public void withdraw(double withdrawMoney){
        if (balance < withdrawMoney){
            System.out.println("You don't have money to withdraw");
        }
        else{
            balance -= withdrawMoney;
            System.out.println("Withdraw done with success!");
        }
    }
}
