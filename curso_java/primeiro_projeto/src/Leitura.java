import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();


        System.out.println("Digite o ano de lançamento do filme");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual nota você da pro filme?");
        double notaFilme = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(notaFilme);
    }
}
