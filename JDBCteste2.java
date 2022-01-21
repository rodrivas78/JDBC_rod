
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCteste2 {

    public static void main(String[] args) {

        String sql = "SELECT id, name FROM client";

        Connection conn = null;

        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/mysql";
            String user      = "root";
            String password  = "1234";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            while(rs.next()) {

                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("id"));

            }

            // more processing here
            // ...
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(conn != null)
                conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
