public class Conversão {
    public static void main (String[] args) {

        double valorDolares = 120.5;
        double valoConversao = 4.94;
        double conversao = valorDolares * valoConversao;

        String mensagem = String.format("O dólar está %.2f reais, e com %.2f doláres, você tem %.2f reais",
                valoConversao, valorDolares, conversao);
        System.out.println(mensagem);
    }
}
