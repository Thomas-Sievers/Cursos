package br.com.alura.desafio_interface;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double valorArea = altura * largura;
        System.out.println(valorArea);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double valorPerimetro = 2 * (altura + largura);
        System.out.println(valorPerimetro);
    }
}
