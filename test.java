import java.sql.*;

public class test {
    public static void main(String[] arg)
    {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/testdb?";
            String username = "root";
            String password = "Rekha@3089";
            Connection con = DriverManager.getConnection(url, username, password);

            if(con.isClosed())
            {
                System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connection Created...");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    } // function ends
} // class ends