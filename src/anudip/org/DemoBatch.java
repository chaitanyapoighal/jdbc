package anudip.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoBatch {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","chaitanya@12");
		Statement st=con.createStatement();
		st.addBatch("insert into employee values(8,'sam')");
		st.addBatch("insert into employee values(9,'Priya')");
		st.addBatch("insert into employee values(10,'Amith')");
		int[] i=st.executeBatch();
		
			System.out.println(i.length);
		
		con.close();
		st.close();

	}

}
