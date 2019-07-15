package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Connection con = null;
	        PreparedStatement pst = null;
	        ResultSet rs = null;

	        String url = "jdbc:mysql://localhost:3306/sakila";
	        String user = "root";
	        String password = "root";

	        try {
	            
	            con = DriverManager.getConnection(url, user, password);
	            pst = con.prepareStatement("SELECT * FROM city");
	            //select Id,Name
	            rs = pst.executeQuery();

	            
	            while (rs.next()) {
	                System.out.print(rs.getInt("city_id"));
	                System.out.print(": ");
	                System.out.println(rs.getString("city"));
	            }
	            


	        } catch (SQLException ex) {
	                //Logger lgr = Logger.getLogger(E05_select.class.getName());
	                //lgr.log(Level.INFO, "------- Epic Fail");
	                //lgr.log(Level.SEVERE, ex.getMessage(), ex);

	        } finally {

	            try {
	                if (rs != null) {
	                    rs.close();
	                }
	                if (pst != null) {
	                    pst.close();
	                }
	                if (con != null) {
	                    con.close();
	                }

	            } catch (SQLException ex) {
	                //Logger lgr = Logger.getLogger(E05_select.class.getName());
	               // lgr.log(Level.WARNING, ex.getMessage(), ex);
	            }
		
	        }
	}
}
	


