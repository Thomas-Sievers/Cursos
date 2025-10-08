public class Main{
    public static void main(String[] args) {
        double celcius = 28;
        double farenheit = (celcius * 1.8) + 32;
        int farenheitInteiro = (int) farenheit;

        String mensagem = String.format("A temperatura em Celcius é de %.1f. Mas quando transformamos em farenheit, fica %.1f", celcius, farenheit);
        String mensagemInteiro = ("Quando usamos casting, o farenheit fica assim: " + farenheit);

        System.out.println(mensagem);
        System.out.println(mensagemInteiro);
    }
}