import java.util.Scanner;

public class Positivo
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int userNum = 0;

        System.out.println("Digite um número, negativo ou positivo");
        userNum = read.nextInt();

        if (userNum > 0) {
            System.out.println("Seu número é positivo");
        }
        else if (userNum == 0) {
            System.out.println("Seu número é 0!");
        }
        else {
            System.out.println("Seu número é negativo");
        }
    }
}