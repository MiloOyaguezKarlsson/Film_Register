/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film_register;

import java.io.IOException;
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
public class IMDbScraperTest {

    public IMDbScraperTest() {
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
     * Test of scrapeTitle method, of class IMDbScraper.
     */
//    -----------Test på om man matar in en felaktiglänk eller ingen länk alls fick aldrig att funka för det kastas annat fel från inbyggda jsoup funktionen--------
//    @Test(expected = IllegalArgumentException.class) //det är det felet man får om det inte är någon länk med
//    public void testScrapeTitleIllegalArgumentException() {
//        System.out.println("scrapeTitleIllegalArgumentException");
//        String url = "";
//        IMDbScraper instance = new IMDbScraper();
//        String result = instance.scrapeTitle(url);
//    }
//    @Test(expected = IOException.class)
//    public void testScrapeTitleIOException() { //om man har en fungerande länk men den går inte till en imdb-film/serie sida
//        System.out.println("scrapeTitleIOException");
//        String url = "http://www.imdb.com/?ref_=nv_home";
//        IMDbScraper instance = new IMDbScraper();
//        String result = instance.scrapeTitle(url);
//    }
    @Test
    public void testScrapeTitle() {
        System.out.println("scrapeTitle");
        String url = "http://www.imdb.com/title/tt3348730"; //testar med nya jigsaw
        IMDbScraper instance = new IMDbScraper();
        String expResult = "Jigsaw";
        String result = instance.scrapeTitle(url);
        assertEquals(expResult, result);
    }

    /**
     * Test of scrapeScore method, of class IMDbScraper.
     */
    @Test
    public void testScrapeScore() {
        System.out.println("scrapeScore");
        String url = "http://www.imdb.com/title/tt0111161"; //testar med nyckeln till frihet
        IMDbScraper instance = new IMDbScraper();
        float expResult = 9.3F;
        float result = instance.scrapeScore(url);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of scrapeDescription method, of class IMDbScraper.
     */
    @Test
    public void testScrapeDescription() {
        System.out.println("scrapeDescription");
        String url = "http://www.imdb.com/title/tt0111161"; //återigen nyckeln till frihet
        IMDbScraper instance = new IMDbScraper();
        String expResult = "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.";
        String result = instance.scrapeDescription(url);
        assertEquals(expResult, result);
    }

    /**
     * Test of scrapeDuration method, of class IMDbScraper.
     */
    @Test
    public void testScrapeDuration() {
        System.out.println("scrapeDuration");
        String url = "http://www.imdb.com/title/tt0111161"; //du gissade rätt: nyckeln till frihet
        IMDbScraper instance = new IMDbScraper();
        String expResult = "142";
        String result = instance.scrapeDuration(url);
        assertEquals(expResult, result);
    }

    /**
     * Test of scrapeReleaseDate method, of class IMDbScraper.
     */
    @Test
    public void testScrapeReleaseDate() {
        System.out.println("scrapeReleaseDate");
        String url = "http://www.imdb.com/title/tt0111161";
        IMDbScraper instance = new IMDbScraper();
        String expResult = "3 March 1995";
        String result = instance.scrapeReleaseDate(url);
        assertEquals(expResult, result);
    }

    /**
     * Test of scrapeEpisodes method, of class IMDbScraper.
     */
    @Test
    public void testScrapeEpisodesMovie() {
        System.out.println("scrapeEpisodesMovie");
        String url = "http://www.imdb.com/title/tt0111161"; //Nyckeln till frihet
        IMDbScraper instance = new IMDbScraper();
        String expResult = ""; //det är en film så då förväntar den sig en tom sträng
        String result = instance.scrapeEpisodes(url);
        assertEquals(expResult, result);
    }
    @Test
    public void testScrapeEpisodesSeries() {
        System.out.println("scrapeEpisodesSeries");
        String url = "http://www.imdb.com/title/tt5491994"; //planet earth 2
        IMDbScraper instance = new IMDbScraper();
        String expResult = "6"; //serien har 6 avsnitt
        String result = instance.scrapeEpisodes(url);
        assertEquals(expResult, result);
    }

    /**
     * Test of scrapeDirector method, of class IMDbScraper.
     */
    @Test
    public void testScrapeDirector(){
        System.out.println("scrapeDirector");
        String url = "http://www.imdb.com/title/tt0111161"; //nyckeln till frihet
        IMDbScraper instance = new IMDbScraper();
        String expResult = "Frank Darabont";
        String result = instance.scrapeDirector(url);
        assertEquals(expResult, result);
    }

}
