package br.com.alura.screenmatch.calculo;

public class RecommendationFilter {

    public void filter(Rated rated) {
        if (rated.getRated() >= 4){
            System.out.println("Is one of the favorites in the moment");
        }
        else if (rated.getRated() >= 2) {
            System.out.println("Well rated in the moment");
        }
        else {
            System.out.println("Add to your list to watch later");
        }
    }
}
