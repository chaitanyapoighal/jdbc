package anudip.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoUpdate {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","chaitanya@12");
	    PreparedStatement pst=con.prepareStatement("update employee set e_name=? where e_id=?");
	    pst.setString(1, "Ravi");
	    pst.setInt(2,2);
	    int i=pst.executeUpdate();
	    System.out.println("No.of rows updated"+i);
	    
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select e_name from employee where e_id=2");
	    while(rs.next())
	    	System.out.println(rs.getString("e_name"));
	    con.close();
	    pst.close();
	}

}
