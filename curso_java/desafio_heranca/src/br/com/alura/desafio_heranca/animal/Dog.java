package br.com.alura.desafio_heranca.animal;

public class Dog extends Mammals{

    @Override
    public void sound(){
        System.out.println("au au au");
    }

    public void stick(){
        System.out.println("running after the stick");
    }
}
