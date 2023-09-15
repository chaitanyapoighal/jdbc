package anudip.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demodelete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","chaitanya@12");
	    PreparedStatement pst=con.prepareStatement("delete from employee where e_id=?");
	    pst.setInt(1, 5);
	    int i=pst.executeUpdate();
	    System.out.println("No.of rows deleted:"+i);
	    con.close();
	    pst.close();
	}

}
