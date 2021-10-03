package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqldatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 String url = "jdbc:mysql://localhost:3306/";
		  //String driver = "com.mysql.jdbc.Driver";
         String dbName = "gyanvriksh";
		 String username="root";
		 String password="";
		 Connection conn = DriverManager.getConnection(url+dbName, username, password);
	     System.out.println(conn.isClosed());
	     Statement st = conn.createStatement();
	     ResultSet rs = st.executeQuery("select * from employee");
	     while(rs.next()) {
	     System.out.println(rs.getString(1) + rs.getString(2));
	     
	     
	}

}
}