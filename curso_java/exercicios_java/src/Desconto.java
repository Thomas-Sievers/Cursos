public class Desconto {
    public static void main (String[] args) {

        double precoOriginal = 100;
        double percentualDesconto = 10;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double valorTotal = precoOriginal - valorDesconto;

        String mensagem = String.format ("O preço original era %f, temos %f de desconto. Aplicando esse desconto, " +
                "seu total fica %f reais", precoOriginal, percentualDesconto, valorTotal);

        System.out.println(mensagem);
    }
}
