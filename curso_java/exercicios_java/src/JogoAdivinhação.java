import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhação {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroCriado = 0;

        for( int i = 0; i < 5; i++){

            int numeroUsuario = 0;
            numeroCriado = new Random().nextInt(100);

            System.out.println("Um número aletório de 1 a 100 foi gerado, qual é esse número?");
            //System.out.println(numeroCriado);
            numeroUsuario = leitura.nextInt();

            if(numeroCriado == numeroUsuario){
                System.out.println("Você acertou!");
                break;
            }
            else if(numeroCriado > numeroUsuario){
                System.out.println("Número gerado é maior que o número que você chutou.");
            }
            else{
                System.out.println("Número gerado é menor que o número que você chutou.");
            }
        }
    }
}
