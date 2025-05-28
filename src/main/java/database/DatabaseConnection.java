package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private java.sql.Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void connect(String path){
        try {
            connection = DriverManager.getConnection(path);
            if (connection != null) {
                System.out.println("Połączono z bazą danych SQLite.");
            }
        } catch (SQLException e) {
            System.out.println("Błąd połączenia: " + e.getMessage());
        }
    }

    public void disconnect(){
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Rozłączono z bazą danych");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
