public class Main {
    public static void main(String[] args){
        Person firstPerson = new Person();
        firstPerson.printMessage();

        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.multiplication(2, 6));

        Music topMusic = new Music();
        topMusic.title = "Diz pra mim";
        topMusic.artist = "Jean Tassy";
        topMusic.releaseYear = 2020;

        topMusic.displayInfo();
        topMusic.userRating(6);
        topMusic.userRating(7);
        topMusic.userRating(10);
        System.out.println(topMusic.averageRating());
        System.out.println(topMusic.numberRates);

        Car oldCar = new Car();
        oldCar.model = "Nivus";
        oldCar.yearProduction = 2020;
        oldCar.color = "white";

        oldCar.displayInfo();
        System.out.println(oldCar.carAge(2024));

        Student student01 = new Student();
        student01.name = "Thomas";
        student01.age = 18;

        student01.displayInfo();
    }
}
