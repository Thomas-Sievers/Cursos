package br.com.alura.desafio_interface;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahreinheit(double celcicius) {
        double temperaturaFahrenheit = celcicius * 1.8 + 32;
        System.out.println(temperaturaFahrenheit);
    }

    @Override
    public void fahrenheitParaCelcius(double fahrenheit) {
        double temperaturaCelcius = fahrenheit - 32 / 1.8;
        System.out.println(temperaturaCelcius);
    }
}
