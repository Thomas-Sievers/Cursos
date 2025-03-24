package br.com.alura.models;

public class Product {
    private String name;
    private double price;

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("The name of the product is: " + name);
        System.out.println("The price of the product is: $" + price);
    }

    public double discount(double percentage){
        return price - (percentage/100 * price);
    }
}
