/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film_register;

/**
 *
 * @author milooyaguez karlsson
 */
public abstract class Item {
    private String title;
    private String description;
    private String director;
    private String releaseDate;
    private float rating;
    private float imdbRating;
    private String imdbLink;
    private int id;
    private int status; // seen/not seen

    public Item(String title, String description, String director, String releaseDate, float rating, float imdbRating, String imdbLink, int id, int status) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.imdbRating = imdbRating;
        this.imdbLink = imdbLink;
        this.id = id;
        this.status = status;
    }

    

    

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public float getRating() {
        return rating;
    }

    public String getImdbLink() {
        return imdbLink;
    }

    public int getId() {
        return id;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public int getStatus() {
        return status;
    }
    public abstract int getLength();
    public abstract int getSeasons();
    public abstract int getEpisodes();
   
    
    
    
    
}