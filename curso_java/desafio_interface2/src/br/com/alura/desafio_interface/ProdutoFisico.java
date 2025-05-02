package br.com.alura.desafio_interface;

public class ProdutoFisico implements Calculavel {
    String nomeProduto = "";
    double preco = (double)0.0F;

    public ProdutoFisico() {
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String produto) {
        this.nomeProduto = produto;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoFinal(int quantidade) {
        if (quantidade >= 3) {
            this.preco = this.getPreco() * (double)quantidade / (double)2.0F;
            return this.preco;
        } else {
            this.preco = this.getPreco() * (double)quantidade;
            return this.preco;
        }
    }
}
