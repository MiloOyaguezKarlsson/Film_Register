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
    @Override
    public int getSeasons(){
        return 0;
    }
    @Override
    public int getEpisodes(){
        return 0;
    }

    
    
}
