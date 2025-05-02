import br.com.alura.desafio_interface.*;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda meuConversor = new ConversorMoeda();
        meuConversor.converterDolarParaReal(1);

        CalculadoraSalaRetangular meuCalculo = new CalculadoraSalaRetangular();
        meuCalculo.calcularArea(10, 10);
        meuCalculo.calcularPerimetro(10, 10);

        TabuadaMultiplicacao minhaTabuada = new TabuadaMultiplicacao();
        minhaTabuada.mostrarTabuada(9);

        ConversorTemperaturaPadrao meuConversorTemp = new ConversorTemperaturaPadrao();
        meuConversorTemp.celsiusParaFahreinheit(20);
        meuConversorTemp.fahrenheitParaCelcius(10);

        ProdutoFisico meuProduto = new ProdutoFisico();
        meuProduto.setNomeProduto("TV");
        meuProduto.setPreco(1200);
        System.out.println(meuProduto.calcularPrecoFinal(4));

        Livro meuLivro = new Livro();
        meuLivro.setTitulo("Garra");
        meuLivro.setPrecoLocacao(12);
        System.out.println(meuLivro.calcularPrecoFinal(10));
    }
}
