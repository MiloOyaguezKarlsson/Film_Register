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
public class TVSerie extends Register_Item{
    private int seasons;
    private int episodes;

    public TVSerie(int seasons, int episodes, String title, String description, String director, String releaseData) {
        super(title, description, director, releaseData);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }
    
    
}

