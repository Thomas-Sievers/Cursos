import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Poderoso Chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDuration(180);

        myMovie.displayInfo();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.catchRating());
    }
}
