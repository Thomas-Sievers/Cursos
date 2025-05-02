import br.com.alura.screenmatch.calculo.RecommendationFilter;
import br.com.alura.screenmatch.calculo.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Show;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Poderoso Chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDuration(180);

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Avatar");
        anotherMovie.setReleaseYear(2023);
        anotherMovie.setDuration(200);

        myMovie.displayInfo();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.catchRating());

        Show lost = new Show();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.displayInfo();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println(lost.getDuration());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(anotherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setShow(lost);
        episode.setTotalViews(300);
        filter.filter(episode);
    }
}
