package br.com.alura.desafio_interface;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double dolar) {
        double valorReal = dolar * 5.65;
        System.out.println(valorReal);
    }
}
