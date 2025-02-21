import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int n1 = 0;
        int resultado = 1;

        System.out.println("Digite o número que você quer fatorar: ");
        n1 = leitura.nextInt();

        for (int i = n1; i >= 1 ; i--){
            resultado = resultado * i;
        }

        String mensagem = String.format("O fatorial de %d é: ", n1);
        System.out.println(mensagem + resultado);
    }
}
