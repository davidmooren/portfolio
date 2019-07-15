package control;

/**
 *
 * @author Antonio
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class E07_selectMultiple {


    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        String cs = "jdbc:mysql://localhost:3306/testdb?allowMultiQueries=true";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(cs, user, password);

            String query = "SELECT Id, Name FROM Authors WHERE Id=1;"
                    + "SELECT Id, Name FROM Authors WHERE Id=2;"
                    + "SELECT Id, Name FROM Authors WHERE Id=3";

            pst = con.prepareStatement(query);
            boolean isResult = pst.execute();

            do {
                rs = pst.getResultSet();

                while (rs.next()) {
                    System.out.print(rs.getInt(1));
                    System.out.print(": ");
                    System.out.println(rs.getString(2));
                }

                isResult = pst.getMoreResults();
            } while (isResult);


        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(E07_selectMultiple.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

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

                Logger lgr = Logger.getLogger(E07_selectMultiple.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
