
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
 *  Här hanteras all sql och koppling till databasen
 * @author milooyaguez karlsson
 */
public class SQLHandler {  //min klass för att hantera alla förfrågningar till och från databasen med sqlfrågor
    public List<Item> getItems(int sortBy) {
        try {
            List<Item> itemList = new ArrayList();

            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sortByString = " ORDER BY";

            switch (sortBy) {
                case 1:// default ingen sortering
                    sortByString = "";
                    break;
                case 2:
                    sortByString += " title";
                    break;
                case 3:
                    sortByString += " director";
                    break;
                case 4:
                    sortByString += " releasedate";
                    break;
                case 5:
                    sortByString += " rating";
                    break;
                default:
                    sortByString = "";
                    break;
            }

        String sql = "SELECT * FROM movies" + sortByString;
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
    }
    catch (SQLException ex

    
        ) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Database error");
        return null;
    }
}

    public boolean addMovie(String title, String description, String director, int length, float personalRating, float imdbRating, String imdbLink, int status, String releaseDate) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            
            //byta ut enkelcitat "'" i mot "\'" så att det inte blir syntax fel
            title = title.replace("'", "\\'");
            description = description.replace("'", "\\'");
            
            String sql = String.format(Locale.US, "INSERT INTO movies VALUES (" //Locale.US behövs för att formatera float med punkt istället för komma
                    + "NULL, 1, '%s', '%s', '%s', NULL, NULL, '%s', %d, %f, %f, '%s', %d)",
                    title, description, director, releaseDate, length, personalRating, imdbRating, imdbLink, status);
            stmt.executeUpdate(sql);
            connection.close();
            return true;
        

} catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class
.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false;
        }
    }

    public boolean addSerie(String title, String description, String director, int seasons, int episodes, float personalRating, float imdbRating, String imdbLink, int status, String releaseDate) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            //byta ut enkelcitat "'" i mot "\'" så att det inte blir syntax fel
            title = title.replace("'", "\\'");
            description = description.replace("'", "\\'");
            
            String sql = String.format(Locale.US, "INSERT INTO movies VALUES (" //Locale.US behövs för att formatera float med punkt istället för komma
                    + "NULL, 2, '%s', '%s', '%s', %d, %d, '%s', NULL, %f, %f, '%s', %d)",
                    title, description, director, seasons, episodes, releaseDate, personalRating, imdbRating, imdbLink, status);
            stmt.executeUpdate(sql);
            connection.close();
            return true;
        

} catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class
.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false; 
        }
    }

    public boolean editSerie(String title, String description, String director, int seasons, int episodes, float personalRating, float imdbRating, int status, String releaseDate, int id) {
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
            Logger.getLogger(SQLHandler.class
.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false;
        }
    }

    public boolean editMovie(String title, String description, String director, int length, float personalRating, float imdbRating, int status, String releaseDate, int id) {
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
            Logger.getLogger(SQLHandler.class
.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false;
        }
    }

    public boolean emptyDatabase(){
        try {
            Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();

            String sql = "TRUNCATE movies"; //tömma databasen

            stmt.executeUpdate(sql);
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLHandler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error");
            return false;
        }
    }
}
