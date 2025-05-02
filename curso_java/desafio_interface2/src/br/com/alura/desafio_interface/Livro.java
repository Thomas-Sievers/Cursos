package br.com.alura.desafio_interface;

public class Livro implements Calculavel {
    String titulo = "";
    double precoLocacao = (double)0.0F;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecoLocacao() {
        return this.precoLocacao;
    }

    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public double calcularPrecoFinal(int dias) {
        if (dias >= 7) {
            this.precoLocacao = this.precoLocacao * (double)dias / (double)2.0F;
            return this.precoLocacao;
        } else {
            this.precoLocacao *= (double)dias;
            return this.precoLocacao;
        }
    }
}
