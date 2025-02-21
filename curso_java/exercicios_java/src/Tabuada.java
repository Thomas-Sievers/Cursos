import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int n1 = 0;

        System.out.println("Digite um número para mostrar a tabuada.");
        n1 = leitura.nextInt();

        for(int i = 0; i <= 10; i++){
            int resultado = i * n1;
            String mensagem = String.format("%d vezes %d é igual a ", n1, i);
            System.out.println(mensagem + resultado);
        }
    }
}
