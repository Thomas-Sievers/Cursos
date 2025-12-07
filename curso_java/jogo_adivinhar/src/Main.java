import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int counter = 0;
        int userInput = 0;

        while (counter < 5) {
            if (counter > 0) {
                String messageTries = String.format("Você tem mais %d tentativas", 5 - counter);
                System.out.println(messageTries);
            }

            System.out.println("Digite um número de 0 a 99: ");
            userInput = read.nextInt();

            if(userInput == randomNumber) {
                System.out.println("Parabéns! Você acertou o número");
                break;
            }
            else {
                counter++;
                System.out.println("Tente mais uma vez!");
            }
        }
    }
}