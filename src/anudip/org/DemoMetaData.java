package anudip.org;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DemoMetaData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","chaitanya@12");
	    PreparedStatement pst=con.prepareStatement("Select * from employee");
	    ResultSet rs=pst.executeQuery();
	    //Using ResulSetMetaData to get the details about table
	    ResultSetMetaData rsmd=rs.getMetaData();
	    System.out.println("Table name:"+rsmd.getTableName(2));
	    System.out.println("Column Name:"+rsmd.getColumnName(1));
	    System.out.println("Column Name:"+rsmd.getColumnName(2));
	    System.out.println("Column count:"+rsmd.getColumnCount());
	    System.out.println("Column 1 type:"+rsmd.getColumnTypeName(1));
	    System.out.println("Column 2 type:"+rsmd.getColumnTypeName(2));
	    
	    //Using DatabaseMetadata to get the details about database and 
	    DatabaseMetaData dbms=con.getMetaData();
	    System.out.println("Driver details:"+dbms.getDriverName());
	    System.out.println("Driver details:"+dbms.getDriverVersion());
	    System.out.println("User details:"+dbms.getUserName());
	    System.out.println("Data base details:"+dbms.getDatabaseProductName());
	    System.out.println("Data base version details:"+dbms.getDatabaseProductVersion());
	    System.out.println("Driver details:"+dbms.getUserName());
	    
	    
	    
	    
	    con.close();
	    
	    
	    rs.close();
	    

	}

}
