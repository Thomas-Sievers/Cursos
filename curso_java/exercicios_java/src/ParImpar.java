import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um número: ");
        numeroDigitado = leitura.nextInt();

        if(numeroDigitado%2 == 0){
            System.out.println("Seu número é Par!");
        }
        else{
            System.out.println("Seu número é Impar!");
        }
    }
}
