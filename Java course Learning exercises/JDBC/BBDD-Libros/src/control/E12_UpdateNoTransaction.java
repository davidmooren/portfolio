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


public class E12_UpdateNoTransaction {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            st.executeUpdate("UPDATE Authors SET Name = 'Leo Tolstoy222' "
                    + "WHERE Id = 1");
            st.executeUpdate("UPDATE Books SET Title = 'War and Peace222' "
                    + "WHERE Id = 1");
            st.executeUpdate("UPDATE Books SET Titl = 'Anna Karenina222' "
                    + "WHERE Id = 2");

            con.close();
            
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(E12_UpdateNoTransaction.class.getName());
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

                Logger lgr = Logger.getLogger(E12_UpdateNoTransaction.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
