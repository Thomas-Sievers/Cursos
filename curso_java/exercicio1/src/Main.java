public class Main
{
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 6.3;
        double media = (nota1 * nota2) / 2;

        int mediaInteira = (int) media; //Conversão de double para int

        char pontuacao = '!'; //Não usar aspas duplas no chat
        String saudacao = "ola";

        int quantidadeProduto = 10;
        double precoProduto = 7.90;
        double precoTotal = quantidadeProduto * precoProduto;

        double dolarReal = 10.90;
        double dolarDolar = 10.90 * 4.94;

        double precoCheio = 50;
        int percentualDesconto = 10;
        double quantidadeDesconto = ( (double) percentualDesconto / 100) * precoCheio;
        double precoDesconto = precoCheio - quantidadeProduto;

        /*
		%d -> int
		%f -> double
		*/
        String mensagem = String.format("A primeira nota é %.1f, a segunda é %.1f e a média é %.1f", nota1, nota2, media);
        String mensagemInteira = "Aqui está a média usando casting: " + mediaInteira;
        String mensagemProduto = String.format("Nós temos %d produtos, cada um custa %.2f. Todos juntos custão: %.2f", quantidadeProduto, precoProduto, precoTotal);

        System.out.println(mensagem);
        System.out.println(mensagemInteira);
        System.out.println(saudacao + pontuacao);
        System.out.println(mensagemProduto);
        System.out.println(dolarDolar);
        System.out.println(precoDesconto);
    }
}