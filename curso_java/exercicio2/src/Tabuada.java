import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int choice = 0;
        int multiplication = 0;

        System.out.println("Digite um número para ver a tabuada");
        choice = read.nextInt();

        for (int i = 0; i <= 10; i++) {
            multiplication = choice * i;
            System.out.println(multiplication);
        }
    }
}
