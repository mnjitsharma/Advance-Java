import java_package;
import java.sql.*;

class JavaSqlConnection{
  public static void main(String[] args) throws SQLException{
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","MySQL@143");
    System.out.println("Connection Successful.\nWelcome to Manjit's SQL database.\n"+con);
    con.close();
  }
}
