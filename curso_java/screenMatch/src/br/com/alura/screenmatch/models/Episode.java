package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculo.Rated;

public class Episode implements Rated {
    private int number;
    private String name;
    private Show show;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    @Override
    public int getRated() {
        if(totalViews > 100){
            return 4;
        }
        else{
            return 2;
        }
    }
}
