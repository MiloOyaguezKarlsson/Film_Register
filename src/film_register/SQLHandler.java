/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film_register;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author milooyaguez karlsson
 */
public class SQLHandler {  //min klass för att hantera alla förfrågningar till och från databasen med sqlfrågor

    public List<Item> getItemsDefault() {
        try {
            List<Item> itemList = new ArrayList();

            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM movies";
            ResultSet data = stmt.executeQuery(sql);

            while (data.next()) {
                if (data.getInt("type") == 1) { //om film
                    itemList.add(new Movie(data.getInt("length"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } else if (data.getInt("type") == 2) { //om tv-serie
                    itemList.add(new TVSerie(data.getInt("seasons"),
                            data.getInt("episodes"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                }
            }
            connection.close();
            return itemList;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
        }
        return null;
    }

    public List<Item> getItemsSortByTitle() {
        try {
            List<Item> itemList = new ArrayList();

            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM movies ORDER BY title";
            ResultSet data = stmt.executeQuery(sql);

            while (data.next()) {
                if (data.getInt("type") == 1) { //om film
                    itemList.add(new Movie(data.getInt("length"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } else if (data.getInt("type") == 2) { //om tv-serie
                    itemList.add(new TVSerie(data.getInt("seasons"),
                            data.getInt("episodes"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } 
            }
            connection.close();
            return itemList;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
        }
        return null;
    }

    public List<Item> getItemsSortByRating() {
        try {
            List<Item> itemList = new ArrayList();

            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM movies ORDER BY rating";
            ResultSet data = stmt.executeQuery(sql);

            while (data.next()) {
                if (data.getInt("type") == 1) { //om film
                    itemList.add(new Movie(data.getInt("length"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } else if (data.getInt("type") == 2) { //om tv-serie
                    itemList.add(new TVSerie(data.getInt("seasons"),
                            data.getInt("episodes"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                }
            }
            connection.close();
            return itemList;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
        }
        return null;
    }

    public List<Item> getItemsSortByReleaseDate() {
        try {
            List<Item> itemList = new ArrayList();

            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM movies ORDER BY releasedate";
            ResultSet data = stmt.executeQuery(sql);

            while (data.next()) {
                if (data.getInt("type") == 1) { //om film
                    itemList.add(new Movie(data.getInt("length"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } else if (data.getInt("type") == 2) { //om tv-serie
                    itemList.add(new TVSerie(data.getInt("seasons"),
                            data.getInt("episodes"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                }
            }
            connection.close();
            return itemList;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
        }
        return null;
    }

    public List<Item> getItemsSortByDirector() {
        try {
            List<Item> itemList = new ArrayList();

            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "SELECT * FROM movies ORDER BY director";
            ResultSet data = stmt.executeQuery(sql);

            while (data.next()) {
                if (data.getInt("type") == 1) { //om det är en film
                    itemList.add(new Movie(data.getInt("length"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } else if (data.getInt("type") == 2) { //om det är en tv-serie
                    itemList.add(new TVSerie(data.getInt("seasons"),
                            data.getInt("episodes"),
                            data.getString("title"),
                            data.getString("description"),
                            data.getString("director"),
                            data.getString("releasedate"),
                            data.getFloat("rating"),
                            data.getFloat("imdbrating"),
                            data.getString("imdb_link"),
                            data.getInt("id"),
                            data.getInt("status")
                    ));
                } 
            }
            connection.close();
            return itemList;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
        }
        return null;
    }

    public boolean addMovie(String title, String description, String director, int length, float personalRating, float imdbRating, String imdbLink, int status, String releaseDate) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            
            
            String sql = String.format(Locale.US, "INSERT INTO movies VALUES (" //Locale.US behövs för att formatera float med punkt istället för komma
                    + "NULL, 1, '%s', '%s', '%s', NULL, NULL, '%s', %d, %f, %f, '%s', %d)", 
                    title, description, director, releaseDate, length, personalRating, imdbRating, imdbLink, status);
            stmt.executeUpdate(sql);
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false; //används aldrig men returnerar falskt om det missylckades
        }
    }

    public boolean addSerie(String title, String description, String director, int seasons, int episodes, float personalRating, float imdbRating, String imdbLink, int status, String releaseDate) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            
            
            String sql = String.format(Locale.US, "INSERT INTO movies VALUES (" //Locale.US behövs för att formatera float med punkt istället för komma
                    + "NULL, 2, '%s', '%s', '%s', %d, %d, '%s', NULL, %f, %f, '%s', %d)", 
                    title, description, director, seasons, episodes, releaseDate,  personalRating, imdbRating, imdbLink, status);
            stmt.executeUpdate(sql);
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false; //används aldrig men returnerar falskt om det misslyckats
        }
    }
    
    public boolean editSerie(String title, String description, String director, int seasons, int episodes, float personalRating, float imdbRating, int status, String releaseDate, int id){
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            String sql = String.format(Locale.US, "UPDATE movies SET "
                    + "title = '%s',"
                    + "description = '%s',"
                    + "director = '%s',"
                    + "seasons= %d,"
                    + "episodes = %d,"
                    + "rating = %f,"
                    + "imdbrating = %f,"
                    + "status = %d,"
                    + "releaseDate = '%s'"
                    + "WHERE id = %d",
                    title, description, director, seasons, episodes, personalRating, imdbRating, status, releaseDate, id);
            stmt.executeUpdate(sql);
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false;
        }
    }

    public boolean editMovie(String title, String description, String director, int length, float personalRating, float imdbRating, int status, String releaseDate, int id){
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            String sql = String.format(Locale.US, "UPDATE movies SET "
                    + "title = '%s',"
                    + "description = '%s',"
                    + "director = '%s',"
                    + "length = %d,"
                    + "rating = %f,"
                    + "imdbrating = %f,"
                    + "status = %d,"
                    + "releaseDate = '%s'"
                    + "WHERE id = %d",
                    title, description, director, length, personalRating, imdbRating, status, releaseDate, id);
            stmt.executeUpdate(sql);
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false; // används aldrig men returnerar falskt om det misslyckats
        }
    }
}
