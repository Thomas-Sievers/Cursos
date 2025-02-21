public class LucroProduto {
    public static void main (String[] args) {

        double precoProduto = 2.99;
        int quantidadeProduto = 100;
        double precoTodos = (double) precoProduto * quantidadeProduto;

        String mensagem = String.format("Você possui %f produtos, cada um vale %d e o total de lucro é %.2f",
                precoProduto, quantidadeProduto, precoTodos);

        System.out.println(mensagem);
    }
}
