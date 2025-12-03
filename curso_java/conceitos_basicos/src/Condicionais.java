public class Condicionais {
    public static void main (String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lacamento que os clientes estão curtindo");
        } else {
            System.out.println("Filmes clássicos");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        } else {
            System.out.println("Deve pagar locaćão");
        }
    }
}
