package control;

/**
 *
 * @author Antonio
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.Cronometro;

public class E04_Prepared_crono {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pst = null;

        String cs = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(cs, user, password);

            System.out.println("-- Sentencias PreparedStatement.. a priori más rápidas");
            //Abro crono
            Cronometro c = new Cronometro();
            c.arrancaCrono();

            pst = con.prepareStatement("INSERT INTO Testing(Id) VALUES(?)");

            for (int i = 1; i <= 1000; i++) {
                pst.setInt(1, i * 2);
                pst.executeUpdate();
            }
            c.paraCrono();

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(E04_Prepared_crono.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(E04_Prepared_crono.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}
