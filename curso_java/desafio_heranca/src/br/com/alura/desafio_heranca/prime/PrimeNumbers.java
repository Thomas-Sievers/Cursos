package br.com.alura.desafio_heranca.prime;

public class PrimeNumbers {
    private int primeNumber;

    public int getPrimeNumber() {
        return primeNumber;
    }

    public void setPrimeNumber(int primeNumber) {
        this.primeNumber = primeNumber;
    }

    public void verifyPrime(){
        if(primeNumber%primeNumber == 0){
            System.out.println("This is a prime number");
        }
        else{
            System.out.println("This isn't a prime number");
        }
    }
}
