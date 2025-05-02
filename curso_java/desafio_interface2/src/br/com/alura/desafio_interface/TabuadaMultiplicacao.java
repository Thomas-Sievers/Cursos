package br.com.alura.desafio_interface;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for(int i = 0; i <= numero; i++){
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }
}
