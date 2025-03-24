public class Car {
    String model;
    int yearProduction;
    String color;

    void displayInfo(){
        System.out.println(model);
        System.out.println(yearProduction);
        System.out.println(color);
    }

    int carAge(int yearToday){
        return yearToday - yearProduction;
    }

}
