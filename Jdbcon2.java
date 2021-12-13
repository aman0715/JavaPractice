import java.sql.*;
class Jdbcon2
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
      String sql;
      sql="update book set price=2002 where title='Harsh'";
      stmt.executeUpdate(sql);
      sql= "select * from book";
      ResultSet rs=stmt.executeQuery(sql);
      while(rs.next())
      {
        int bookid=rs.getInt("accno");
        String bookName=rs.getString("title");
        double price=rs.getDouble("price");
        //Display values
        System.out.print("Accession No: "+bookid);
        System.out.print(",Book Title: "+bookName);
        System.out.println(",Price: "+price);
      }
      rs.close();
      stmt.close();
      conn.close();
    }
    catch(SQLException se)
    {
      se.printStackTrace();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        if(stmt!=null)
        stmt.close();
      }
      catch(SQLException se2)
      {
        //nothing we can do
      }
      try
      {
        if(conn!=null)
        conn.close();
      }
      catch(SQLException se3)
      {
        se3.printStackTrace();
      }
    }
    System.out.println("Goodbye!");
  }
}
