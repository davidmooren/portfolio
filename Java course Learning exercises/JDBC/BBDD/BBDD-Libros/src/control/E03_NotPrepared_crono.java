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
import utilidades.Cronometro;

public class E03_NotPrepared_crono {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;

        String cs = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(cs, user, password);
            
            System.out.println("-- Sentencias Statement.. a priori más lentas");
            //Abro crono
            Cronometro c = new Cronometro();
            c.arrancaCrono();
            
            st = con.createStatement();

            for (int i = 1; i <= 1000; i++) {
                String query = "INSERT INTO Testing(Id) VALUES(" + 2 * i + ")";
                st.executeUpdate(query);
            }
            c.paraCrono();

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(E03_NotPrepared_crono.class.getName());
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
                Logger lgr = Logger.getLogger(E03_NotPrepared_crono.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    }
}
