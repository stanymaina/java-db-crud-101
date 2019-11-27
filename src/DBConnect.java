// Import Java.sql
import java.sql.*;
        
public class DBConnect {
   // Create a connection variable and set it to null
   Connection conn = null;
    public static Connection DBConnect(){
        
         // Provide a try and catch exception
        try {
            // Connect to mysql library
            Class.forName("com.mysql.jdbc.Driver");
            // jdbc:mysql://hostname:port/databasename, server username, server password
            // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_list","root","");
            Connection conn = DriverManager.getConnection("jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2313560","sql2313560","uW8*xU2!");
            return conn;
            
        }catch(Exception ex) {
            // If connection fail
            System.out.println("Erro: " + ex);
            return null;
        }

    }
    
}
