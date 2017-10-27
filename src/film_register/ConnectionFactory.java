
package film_register;

/**
 *  Klass för att skapa en uppkoppling till databasen
 * @author milooyaguez karlsson
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost/moviedatabase";
        String user = "root";
        String password = "";
        Connection connection = (com.mysql.jdbc.Connection)DriverManager.getConnection(url, user, password);
        return connection;
    }
}

