package control;

/**
 *
 * @author Antonio
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class E09_WriteImage {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;
        FileInputStream fin = null;

        String cs = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";                 

        try {

            File img = new File("homer.jpg");
            fin = new FileInputStream(img);

            con = DriverManager.getConnection(cs, user, password);

            pst = con.prepareStatement("INSERT INTO Images(Data) VALUES(?)");
            pst.setBinaryStream(1, fin, (int) img.length());
            pst.executeUpdate();

        } catch (FileNotFoundException ex) {
            Logger lgr = Logger.getLogger(E09_WriteImage.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(E09_WriteImage.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
                if (fin != null) {
                    fin.close();
                }

            } catch (IOException ex) {
                Logger lgr = Logger.getLogger(E09_WriteImage.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(E09_WriteImage.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
    }
}
