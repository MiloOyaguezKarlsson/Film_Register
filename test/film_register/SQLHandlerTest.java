/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film_register;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author milooyaguez karlsson
 */
public class SQLHandlerTest {
    
    public SQLHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItems method, of class SQLHandler.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        int sortBy = 0;
        SQLHandler instance = new SQLHandler();
        List<Item> result = instance.getItems(sortBy);
        assertNotNull(result); //testar bara att jag får något även ifall det är en tom lista, kommer inte lyckas om databasen inte är uppe
    }

    /**
     * Test of addMovie method, of class SQLHandler.
     */
    @Test
    public void testAddMovie() {
        System.out.println("addMovie");
        String title = "EnhetsTest";
        String description = "";
        String director = "";
        int length = 0;
        float personalRating = 0.0F;
        float imdbRating = 0.0F;
        String imdbLink = "";
        int status = 0;
        String releaseDate = "";
        SQLHandler instance = new SQLHandler();
        boolean expResult = true; //om inserten lyckas så funkar det
        boolean result = instance.addMovie(title, description, director, length, personalRating, imdbRating, imdbLink, status, releaseDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of addSerie method, of class SQLHandler.
     */
    @Test
    public void testAddSerie() {
        System.out.println("addSerie");
        String title = "EnhetsTest";
        String description = "";
        String director = "";
        int seasons = 0;
        int episodes = 0;
        float personalRating = 0.0F;
        float imdbRating = 0.0F;
        String imdbLink = "";
        int status = 0;
        String releaseDate = "";
        SQLHandler instance = new SQLHandler();
        boolean expResult = true;
        boolean result = instance.addSerie(title, description, director, seasons, episodes, personalRating, imdbRating, imdbLink, status, releaseDate);
        assertEquals(expResult, result);
    }

    /**
     * Test of editSerie method, of class SQLHandler.
     */
    @Test
    public void testEditSerie() {
        System.out.println("editSerie");
        String title = "EnhetsTest";
        String description = "";
        String director = "";
        int seasons = 0;
        int episodes = 0;
        float personalRating = 0.0F;
        float imdbRating = 0.0F;
        int status = 0;
        String releaseDate = "";
        int id = 0;
        SQLHandler instance = new SQLHandler();
        boolean expResult = true;
        boolean result = instance.editSerie(title, description, director, seasons, episodes, personalRating, imdbRating, status, releaseDate, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of editMovie method, of class SQLHandler.
     */
    @Test
    public void testEditMovie() {
        System.out.println("editMovie");
        String title = "EnhetsTest";
        String description = "";
        String director = "";
        int length = 0;
        float personalRating = 0.0F;
        float imdbRating = 0.0F;
        int status = 0;
        String releaseDate = "";
        int id = 0;
        SQLHandler instance = new SQLHandler();
        boolean expResult = true;
        boolean result = instance.editMovie(title, description, director, length, personalRating, imdbRating, status, releaseDate, id);
        assertEquals(expResult, result);
    }

    /**
     * Test of emptyDatabase method, of class SQLHandler.
     */
    @Test
    public void testEmptyDatabase() {
        System.out.println("emptyDatabase");
        SQLHandler instance = new SQLHandler();
        boolean expResult = true;
        boolean result = instance.emptyDatabase();
        assertEquals(expResult, result);
    }
    
}
