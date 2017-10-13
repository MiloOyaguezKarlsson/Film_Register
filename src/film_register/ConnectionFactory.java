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
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author milooyaguez karlsson
 */
public class ConnectionFactory {
    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost/moviedatabase"; //ändra
        String user = "root";
        String password = "";
        Connection connection = (com.mysql.jdbc.Connection)DriverManager.getConnection(url, user, password);
        return connection;
    }
}

