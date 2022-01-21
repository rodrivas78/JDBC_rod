import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCteste {

    public static void main(String[] args) {

        Connection conn = null;

        try {
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/mysql";
            String user      = "root";
            String password  = "1234";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
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
