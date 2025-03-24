package br.com.alura.models;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Your person name is: " + name);
        System.out.println("Your person is " + age + " years old");
        System.out.println(isAdult());
    }

    public boolean isAdult(){
        return age > 17;
    }
}
