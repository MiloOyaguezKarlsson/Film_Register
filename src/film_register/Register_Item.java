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
public abstract class Register_Item {
    private String title;
    private String description;
    private String director;
    private String releaseDate;

    public Register_Item(String title, String description, String director, String releaseData) {
        this.title = title;
        this.description = description;
        this.director = director;
        this.releaseDate = releaseData;
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
}
