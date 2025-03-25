package br.com.alura.desafio_heranca.bank;

public class CheckingAccount extends BankAccount{

    @Override
    public void deposit(double getDepositMoney) {
        super.deposit(getDepositMoney);

        double taxMoney = (getDepositMoney / 100) * 10;
        setBalance(getBalance() - taxMoney);
    }
}
