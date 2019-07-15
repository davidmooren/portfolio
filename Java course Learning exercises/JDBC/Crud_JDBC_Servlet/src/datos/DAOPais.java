package datos;

import beans.Pais;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class DAOPais implements I_DAOPais {

    @Override
    public ArrayList<Pais> Listado() {
        ArrayList<Pais> lista = new ArrayList<Pais>();
        Statement st = null;
        ResultSet rs = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from paises");

            while (rs.next()) {

                Pais p = new Pais();
                p.setCode(rs.getString("code"));
                p.setNombre(rs.getString("nombre"));
                p.setContinente(rs.getString("continente"));
                p.setRegion(rs.getString("region"));
                lista.add(p);
            }
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOPais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public void Baja(String cod) {
        Statement st = null;
        try {
            System.out.println("--- Dando de baja el codigo " + cod);
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            String q = "delete from paises where code ='" + cod + "'";

            int i = st.executeUpdate(q);
            System.out.println(q + i);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOPais.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Pais Detalle(String cod) {
        Pais p = new Pais();
        Statement st = null;
        ResultSet rs = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            rs = st.executeQuery("select * from paises where code ='" + cod + "'");

            while (rs.next()) {
                p.setCode(rs.getString("code"));
                p.setNombre(rs.getString("nombre"));
                p.setContinente(rs.getString("continente"));
                p.setRegion(rs.getString("region"));
                p.setPoblacion(rs.getInt("poblacion"));
                p.setCapital(rs.getInt("capital"));
            }
            System.out.println(p);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOPais.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    @Override
    public void Alta(Pais p) {
        Statement st = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            String q = "INSERT INTO `paises` VALUES ('" + p.getCode() + "','" + p.getNombre() + "','" + p.getContinente() + "','" + p.getRegion() + "','" + p.getPoblacion() + "','" + p.getCapital() + "')";
            System.out.println(q);
            int i = st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOPais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update(Pais p) {
        Statement st = null;
        try {
            ConexionDB con = new ConexionDB();
            st = con.getConnection().createStatement();
            String q = "UPDATE `paises` SET Nombre ='" + p.getNombre() + "',Continente ='" + p.getContinente() + "',Region ='" + p.getRegion() + "',Poblacion ='" + p.getPoblacion() + "',Capital ='" + p.getCapital() + "' WHERE code='" + p.getCode() + "'";
            System.out.println(q);
            int i = st.executeUpdate(q);
            con.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DAOPais.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
