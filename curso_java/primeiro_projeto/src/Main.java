public class Main {

    public static void main (String[] args) {

        int anoLancamento = 2022;

        boolean incluidoPlano = true;

        double notaFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;  //media calculada pelas 3 notas da Jack, Paulo e Suelem
        System.out.println (media);

        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
    }
}
