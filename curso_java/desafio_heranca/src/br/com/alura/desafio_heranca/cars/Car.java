package br.com.alura.desafio_heranca.cars;

public class Car {
    private String modelName;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrices(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }


    public double averagePrice(){
        return priceYear1 + priceYear2 + priceYear3 / 3;
    }

    private double calculateLowestPrice() {
        double lowestPrice = priceYear1;

        if(priceYear2 < lowestPrice){
            lowestPrice = priceYear2;
        }

        if(priceYear3 < lowestPrice){
            lowestPrice = priceYear3;
        }

        return lowestPrice;
    }

    private double calculateHighestPrice() {
        double highestPrice = priceYear1;

        if(priceYear2 > highestPrice){
            highestPrice = priceYear2;
        }

        if(priceYear3 > highestPrice){
            highestPrice = priceYear3;
        }

        return highestPrice;
    }


    public void displayInfo(){
        System.out.println("The name of the model is: " + modelName);
        System.out.println("The lowest price is: " + calculateLowestPrice());
        System.out.println("The highest price is: " + calculateHighestPrice());
    }
}
