
package film_register;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *  Klass för att hämta data (scrapa) från en imdb sida om en specifik film/serie genom en länk till den
 * @author milooyaguez karlsson
 */
public class IMDbScraper { 

    public String scrapeTitle(String url){
        try {
            Document document = Jsoup.connect(url).get();
            String title = document.select("h1[itemprop='name']").get(0).html();
            if (title.contains("&nbsp;")) { //ta bort massa skit tecken efter titeln
                title = title.substring(0, title.indexOf("&nbsp;"));
            }
            return title;
        } catch (Exception ex) { //funkar inte med IOException för den kastar invalidargumentexception när url är konstig
            JOptionPane.showMessageDialog(null, "Invalid link"); //kör bara på just denna för annars kommer det upp många felmeddelanden
            return null;
        }
    }

    public float scrapeScore(String url){
        try {
            float score = (float) 0.0;
            Document document = Jsoup.connect(url).get();
            score = Float.parseFloat(document.select("span[itemprop='ratingValue']").get(0).html());
            return score;
        } catch (Exception ex) {
        }
        return 0;
    }

    public String scrapeDescription(String url){
        try {
            String description = "";
            Document document = Jsoup.connect(url).get();
            description = document.select("div.summary_text").get(0).html();
            return description;
        } catch (Exception ex) {
            return null;
        }
    }

    public String scrapeDuration(String url){
        try {
            Document document = Jsoup.connect(url).get();
            String duration = document.select("time[itemprop='duration']").get(0).html();
            //göra om från timmar och minuter till bara minuter
            if (duration.contains("h")) {
                int h = Integer.parseInt(duration.substring(0, duration.indexOf("h")));
                int min = Integer.parseInt(duration.substring(duration.indexOf("h") + 2, duration.indexOf("m")));
                duration = String.valueOf(h * 60 + min);
            } else { // om det bara står i minuter redan (tv-serier)
                duration = duration.substring(0, duration.indexOf("m"));
            }
            return duration;
        } catch (Exception ex) {
            return null;
        }
    }

    public String scrapeReleaseDate(String url){
        try {
            Document document = Jsoup.connect(url).get();
            String date = document.select("a[title='See more release dates']").get(0).html();

            //ta bort allt efter själva datumet
            date = date.substring(0, date.indexOf("(") - 1);
            
            return date;
        } catch (Exception ex) {
            return null;
        }
    }

    public String scrapeEpisodes(String url){
        try {
            Document document = Jsoup.connect(url).get();
            String episodes;
            if (!document.select("span.bp_sub_heading").isEmpty()) { //om den inte är tom
                if (document.select("span.bp_sub_heading").size() > 1) {
                    //om det är en pågående serie finns det en span innan med samma klass då tas den andra som innehåller avsnittsantal
                    episodes = document.select("span.bp_sub_heading").get(1).html();
                } else {
                    //om serien är avslutad så finns det bara en span med denna klassen då tas den första och enda
                    episodes = document.select("span.bp_sub_heading").get(0).html();
                }
            } else { //om den inte hittar någon span med klassen så är det en film och då returneras en tom sträng istället
                return "";
            }
            episodes = episodes.substring(0, episodes.indexOf("e") - 1); // ta bort "episodes" och ett mellanrum
            return episodes;
        } catch (Exception ex) {
            return null;
        }
    }

    public String scrapeDirector(String url){
        try {
            Document document = Jsoup.connect(url).get();
            String director = document.select("span[itemprop='name']").get(0).html();
            return director;
        } catch (Exception ex) {
            return null;
        }
    }
}
