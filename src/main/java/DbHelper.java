
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbHelper {
    private String userName="root";
     private String password="984843";
     private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";

    void showErrorMessage(SQLException e) {
        System.out.println("Error");
     
    }

    Connection getConnection() throws SQLException {
       return DriverManager.getConnection(dbUrl,userName,password);
    }
    
}
