
package film_register;

/**
 * klass för filmer
 * @author milooyaguez karlsson
 */
public class Movie extends Item{
    private int length;

    public Movie(int length, String title, String description, String director, String releaseDate, float rating, float imdbRating, String imdbLink, int id, int status) {
        super(title, description, director, releaseDate, rating, imdbRating, imdbLink, id, status);
        this.length = length;
    }

    


    @Override
    public int getLength() {
        return length;
    }
    @Override //subklass måste overrida abstracta metoder i superklassen
    public int getSeasons(){
        return 0;
    }
    @Override
    public int getEpisodes(){
        return 0;
    }

    
    
}
