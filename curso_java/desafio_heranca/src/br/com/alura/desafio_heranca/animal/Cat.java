package br.com.alura.desafio_heranca.animal;

public class Cat extends Mammals{

    @Override
    public void sound(){
        System.out.println("miau");
    }

    public void playWithToy(){
        System.out.println("Trying to catch the laser");
    }
}
