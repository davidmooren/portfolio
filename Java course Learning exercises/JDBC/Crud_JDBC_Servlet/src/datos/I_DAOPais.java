package datos;

/**
 *
 * @author Antonio Santos
 */

import beans.Pais;
import java.util.ArrayList;

public interface I_DAOPais {
    
    public void Alta(Pais p);
    public void Baja(String cod);
    public Pais Detalle(String cod);
    public void Update(Pais p);
    public ArrayList<Pais> Listado();
    
    
    
}
