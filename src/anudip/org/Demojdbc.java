
package anudip.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demojdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","chaitanya@12");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt("e_Id")+" "+rs.getString("e_name"));
		    //rs.next();
		} 
		con.close();
		st.close();
		rs.close();
	}

}
