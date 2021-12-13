import java.sql.*;
class Jdbcon3
{
  static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
  static final String DB_URL="jdbc:mysql://localhost/books";
  static final String USER="root";
  static final String PASS="amanmisra591";
  public static void main(String[] args)
  {
    Connection conn=null;
    Statement stmt=null;
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      stmt.executeUpdate("insert into book (accno,title,author,price,category) values ("+8+",'Data structures in C','Larry Page',"+900.5+",'procedural')");
    }
    catch(Exception e)
    {
      System.out.println("Error occured");
    }
    System.out.println("Updated!");
  }
}
