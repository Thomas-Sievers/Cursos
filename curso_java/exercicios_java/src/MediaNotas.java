public class MediaNotas {
    public static void main (String[] args) {

        double nota01 = 5;
        double nota02 = 7.8;
        int media = (int) (nota01 + nota02) / 2;

        String mensagem = String.format("A média das notas, %f e %f é um total de: %d", nota01, nota02, media);
        System.out.println(mensagem);
    }
}
