package jdbc;
import java.sql.*;
public class SimpleJdbc {
    public static void main(String[] args)
        //using exception to check if a class exists
        throws SQLException, ClassNotFoundException {
        //load the jdbc driver
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        System.out.println("Driver loaded");
        
        //connect to a database
        String url = "jdbc:sqlserver://DESKTOP-7TQPOHE\\SA; databaseName=AdventureWorks;user = sa; password = 123456";
        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("Database connceted");
            //create a statement
            Statement statement = connection.createStatement();
            //Execute statment
            ResultSet resultset = statement.executeQuery("select * from person.Address");
            
            
            while (resultset.next())
 System.out.println(resultset.getString(1) + "\t" +
 resultset.getString(2) + "\t" + resultset.getString(3));            
            //close connection
            connection.close();
        }
        
    }
}
