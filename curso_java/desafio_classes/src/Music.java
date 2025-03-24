public class Music {
    String title;
    String artist;
    int releaseYear;
    double allRates;
    double numberRates;

    void displayInfo(){
        System.out.println(title);
        System.out.println(artist);
        System.out.println(releaseYear);
    }

    void userRating(double userRate){
        allRates += userRate;
        numberRates++;
    }

    double averageRating(){
        return allRates / numberRates;
    }
}
