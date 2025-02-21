public class Temperatura {
    public static void main(String[] args) {

        int celsius = 34;
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temeperatura de %d Celsius é equivalente a %f fahrenheit", celsius, fahrenheit);
        System.out.println(mensagem);

        int fahrenheitZero = (int) fahrenheit;
        String mensagem2 = String.format("A temperatuda inteira de fahrenheit é de: %d", fahrenheitZero);
        System.out.println(mensagem2);
        }
    }