import java.sql.*;
class JdbcInsertInTwoTables
{
  static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
  static final String DB_URL="jdbc:mysql://localhost/books";
  static final String USER="root";
  static final String PASS="amanmisra591";
  static Connection conn=null;
  static Statement stmt=null;
  public static void main(String[] args)
  {
    insertBook("12","6");
    insertAuthor("6","Author5");
  }
  static public void insertBook(String ano,String aid)
  {
    try
    {
      int an=Integer.parseInt(ano);
      int ai=Integer.parseInt(aid);
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      String sql;
      sql="insert into book(accno,aid) values ("+an+","+ai+")";
      stmt.executeUpdate(sql);
      conn.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  static public void insertAuthor(String aid,String auth)
  {
    try
    {
      //int an=Integer.parsedInt(ano);
      int ai=Integer.parseInt(aid);
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      String sql;
      sql="insert into author(aid,fname) values ("+ai+",'"+auth+"')";
      stmt.executeUpdate(sql);
      conn.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
