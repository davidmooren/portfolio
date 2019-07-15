package utilidades;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Antonio
 */
public class Cronometro {

    private LocalTime inicio;
    private LocalTime fin;
    
    public Cronometro(){
    }

    public void arrancaCrono() {
        inicio = LocalTime.now();
    }

    public void paraCrono() {
        fin = LocalTime.now();
        long difSegundos = ChronoUnit.SECONDS.between(inicio, fin);
        System.out.println("-- Han transcurrido "+difSegundos+ " segundos");
    }

    public void tiempo() {
        long difSegundos = ChronoUnit.SECONDS.between(inicio, fin);
        
    }

}
