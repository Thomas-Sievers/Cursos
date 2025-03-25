import br.com.alura.desafio_heranca.animal.Cat;
import br.com.alura.desafio_heranca.animal.Dog;
import br.com.alura.desafio_heranca.animal.Mammals;
import br.com.alura.desafio_heranca.bank.CheckingAccount;
import br.com.alura.desafio_heranca.cars.Car;
import br.com.alura.desafio_heranca.cars.ModelCar;
import br.com.alura.desafio_heranca.prime.PrimeNumbers;


public class Main {
    public static void main(String[] args) {

        Car myCar = new ModelCar();
        myCar.setModelName("HB20");
        myCar.setPrices(40000, 55000, 70000);
        myCar.displayInfo();

        Mammals elephant = new Mammals();
        elephant.sound();

        Cat serapha = new Cat();
        serapha.sound();
        serapha.playWithToy();

        Dog zaptas = new Dog();
        zaptas.sound();
        zaptas.stick();

        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setBalance(1500);
        myAccount.checkBalance();
        myAccount.deposit(500);
        myAccount.checkBalance();

        PrimeNumbers myPrime = new PrimeNumbers();
        myPrime.setPrimeNumber(4);
        myPrime.verifyPrime();

    }
}
