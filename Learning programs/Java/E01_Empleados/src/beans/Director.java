package beans;

import java.util.Date;

import utilidades.LecturaDatos;

public class Director extends Empleado {
	
	private float incentivo = 10.0f;
    private float incremento = 100.0f;
    private boolean coche = true;
    

    public Director() {
    }

    public Director(String nombre, float salario, Date fecha_nac, double incentivo, boolean coche) {
        super(nombre, salario, fecha_nac);
        this.incentivo = (float) incentivo;
        this.coche = coche;
    }

    public boolean isCoche() {
        return coche;
    }

    public void setCoche(boolean coche) {
        this.coche = coche;
    }

    public float getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(float incentivo) {
        this.incentivo = incentivo;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(float incremento) {
        this.incremento = incremento;
    }
    public void incentivar() {
        float cantidad = (int) salarioo[3] * (1 + incentivo / 100);
        this.setsalario(cantidad);
        System.out.println("Soy director y estoy incentivadisimo: " + getsalario());
        System.out.println("Tu matricula del coche se ha guardado: 7140JPX");
    }    
    
    
    public void DirectorIncentivo() {
    	Empleado newClassObj = new Empleado();
    int[] secondArray = newClassObj.getsalarioo();
    
  for(int counter =0; counter < 1; counter++){
  System.out.println("Nombre: " + name[3]);
  System.out.println("Salario: " + salarioo[3]);
  }  
	}

    @Override
    public String toString() {
        String datos_emp = super.toString();
        return "Director{" + datos_emp + "incentivo=" + incentivo + ", incremento=" + incremento + ", coche=" + coche + '}';
    }
    
    
   

    
    
}
