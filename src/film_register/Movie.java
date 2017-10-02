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
public class Movie extends Register_Item{
    private int length;

    public Movie(int length, String title, String description, String director, String releaseData) {
        super(title, description, director, releaseData);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    
}
