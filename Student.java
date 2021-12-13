//package app1;
import java.sql.*;
public class Student
{
  static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
  static final String DB_URL="jdbc:mysql://localhost/APP1";
  static final String USER="root";
  static final String PASS="amanmisra591";
  public static void insert(String sid,String sname,String spass,String cid,String cname)
  {
    Connection conn=null;
    Statement stmt=null;
		if(spass.charAt(0)>=97 && spass.chatAt(0)<=122 && spass.charAt(3)>=48 && spass.charAt(3)<=57)
		{
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn=DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("Creating Statement...");
      stmt=conn.createStatement();
      String sql;
      sql= "insert into student_details(s_id,s_name,s_pass,c_id) values('"sid+"','"+sname+"','"+spass+"','"+cid+"','"+cname+"')";
      stmt.executeUpdate(sql);
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
	}
	else
		{
			System.out.println("Type a valid password");
		}
  }
}
