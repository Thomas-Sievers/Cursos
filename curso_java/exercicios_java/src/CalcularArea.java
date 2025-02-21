import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        System.out.println("1. Para calcular a área do quadrado");
        System.out.println("2. Para calcular a área do retângulo");
        escolha = leitura.nextInt();

        if(escolha == 1){
            int ladoQuadrado = 0;

            System.out.println("Coloque o tamanho dos lados do quadrado em cm: ");
            ladoQuadrado = leitura.nextInt();
            System.out.println("A área do quadrado é " + ladoQuadrado * ladoQuadrado);
        }
        else{
            int baseTriangulo = 0;
            int alturaTriangulo = 0;

            System.out.println("Coloque o tamanho da base do triangulo em cm: ");
            baseTriangulo = leitura.nextInt();

            System.out.println("Coloque a altura do triangulo em cm: ");
            alturaTriangulo = leitura.nextInt();

            System.out.println("A área do triangulo é " + baseTriangulo * alturaTriangulo/2);
        }
    }
}
