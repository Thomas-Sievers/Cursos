import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite dois números: ");
        num1 = read.nextInt();
        num2 = read.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        }
        else if (num1 < num2) {
            System.out.println("O segundo número é maior que o primeiro");
        }
        else {
            System.out.println("Os dois números são iguais");
        }
    }
}
