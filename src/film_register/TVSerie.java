
package film_register;

/**
 *  klass för tv-serier
 * @author milooyaguez karlsson
 */
public class TVSerie extends Item{
    private int seasons;
    private int episodes;

    public TVSerie(int seasons, int episodes, String title, String description, String director, String releaseDate, float rating, float imdbRating, String imdbLink, int id, int status) {
        super(title, description, director, releaseDate, rating, imdbRating, imdbLink, id, status);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    @Override
    public int getLength(){
        return 0;
    }
    @Override
    public int getSeasons() {
        return seasons;
    }
    @Override
    public int getEpisodes() {
        return episodes;
    }
}

