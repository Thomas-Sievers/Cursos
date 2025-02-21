public class Condicional {
    public static void main (String[] args) {

        int anoLancamento = 1990;
        boolean incluidoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        }
        else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoPlano == true && tipoPlano.equals("plus")){ //podemos usar if(incluidoPlano) para verificar se é true
            System.out.println("Filme liberado");
        }
        else{
            System.out.println("Deve pagar a locação");
        }
    }
}
