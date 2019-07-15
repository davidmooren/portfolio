package control;

/**
 *
 * @author Antonio
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class E10_ReadImage {


    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;
        FileOutputStream fos = null;

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(url, user, password);

            String query = "SELECT Data FROM Images LIMIT 1";
            pst = con.prepareStatement(query);
            
            ResultSet result = pst.executeQuery();
            result.next();

            fos = new FileOutputStream("homer42.jpg");

            Blob blob = result.getBlob("Data");
            int len = (int) blob.length();

            byte[] buf = blob.getBytes(1, len);

            fos.write(buf, 0, len);

        } catch (IOException ex) {
            Logger lgr = Logger.getLogger(E10_ReadImage.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);               

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(E10_ReadImage.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
                if (fos != null) {
                    fos.close();
                }

            } catch (IOException ex) {
                Logger lgr = Logger.getLogger(E10_ReadImage.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(E10_ReadImage.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}