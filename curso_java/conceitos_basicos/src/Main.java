public class Main
{
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        //We need to declare the variable type
        int anoDeLancamento = 2022; //CammelCase
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}