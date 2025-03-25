package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Show;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void includes(Movie m) {
//        totalTime += m.getDuration();
//    }
//
//    public void includes(Show s) {
//        totalTime += s.getDuration();
//    }

    public void includes(Title t) {
        System.out.println("Adding duration in minutes of " + t );
        totalTime += t.getDuration();
    }
}
