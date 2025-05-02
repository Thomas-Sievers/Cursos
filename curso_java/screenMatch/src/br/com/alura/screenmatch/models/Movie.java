package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Rated;

public class Movie extends Title implements Rated {
   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRated() {
        return (int) catchRating() / 2;
    }
}
