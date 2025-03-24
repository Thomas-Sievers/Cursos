package br.com.alura.screenmatch.models;

public class Movie {
    Movie myMovie;
    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double allRatings;
    private int totalRatings;
    private int duration;

    public Movie getMyMovie() {
        return myMovie;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalRatings(){
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public void setIncludedPlan(boolean includedPlan){
        this.includedPlan = includedPlan;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void displayInfo(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void rate(double score){
        allRatings += score;
        totalRatings++;
    }

    public double catchRating(){
        return allRatings / totalRatings;

    }
}
