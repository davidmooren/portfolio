package control;

/**
 *
 * @author Antonio
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class E11_UpdateTransaction {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            // ***********************************
            con.setAutoCommit(false);
            // ***********************************
            
            // The third SQL statement has an error. 
            // There is no Titl column in the table.

            st.executeUpdate("UPDATE Authors SET Name = 'Leo Tolstoy111' "
                    + "WHERE Id = 1");
            st.executeUpdate("UPDATE Books SET Title = 'War and Peace111' "
                    + "WHERE Id = 1");
            st.executeUpdate("UPDATE Books SET Titl = 'Anna Karenina111' "
                    + "WHERE Id = 2");

            // **********
            con.commit();
            // **********

        } catch (SQLException ex) {

            if (con != null) {
                try {
                    // **********
                    con.rollback();
                    // **********
                } catch (SQLException ex1) {
                    Logger lgr = Logger.getLogger(E11_UpdateTransaction.class.getName());
                    lgr.log(Level.WARNING, ex1.getMessage(), ex1);
                }
            }

            Logger lgr = Logger.getLogger(E11_UpdateTransaction.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
            
        } finally {

            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(E11_UpdateTransaction.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
