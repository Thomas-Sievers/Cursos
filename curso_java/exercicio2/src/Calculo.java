import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice = 0;

        //Variables square
        double side = 0;
        double areaSquare = 0;

        //Variables circle
        double pi = 3.14;
        double radius = 0;
        double areaCircle = 0;

        System.out.println("1. Quadrado | 2. Círculo");
        choice = read.nextInt();

        if (choice == 1) {
            System.out.println("Digite em cm o ccomprimento de um dos lados do quadrado: ");
            side = read.nextDouble();
            areaSquare = side * side;
            System.out.println("A área do quadrado é: " + areaSquare);
        }
        else if (choice == 1) {
            System.out.println("Digite em cm o raio do círculo: ");
            radius = read.nextDouble();
            areaCircle = pi * (radius * radius);
            System.out.println("A área do círculo é: " + areaCircle);
        }
        else {
            System.out.println("Digite uma općão válida");
        }
    }
}
