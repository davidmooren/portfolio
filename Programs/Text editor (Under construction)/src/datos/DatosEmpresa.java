package datos;

import java.util.ArrayList;
import java.util.List;

import beans.Director;
import  beans.Empleado;
import beans.Gerente;
import utilidades.LecturaDatos;

public class DatosEmpresa implements IDatosEmpresa {
	
    private List<Empleado> personal = new ArrayList<>();


    public List<Empleado> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Empleado> personal) {
        this.personal = personal;
    }

    public void addEmpleado(Empleado e) {
        //42 lineas muy complicadas
        personal.add(e);
    }

    public void addEmpleado() {
    	//Solucion cutre pero efectiva
        Empleado e = new Empleado();
        e.crearEmpleado();
        addEmpleado(e);
    }
    
    public void addDirector(Empleado a) {
        //42 lineas muy complicadas
        personal.add(a);
    }
    
    
    public void addDirector() {
    	
    	Director a=new Director();
    	a.DirectorIncentivo();
    	a.incentivar();
    	
        /*for (Empleado e : personal) {
            if (e instanceof Director) {
                ((Director) e).incentivar();*/
            }
    
    
    public void addGerente(Empleado a) {
        //42 lineas muy complicadas
        personal.add(a);
    }
    
    
    public void addGerente() {
    	
    	Gerente a=new Gerente();
    	a.GerenteIncentivo();
    	a.incentivaar();
    	
        /*for (Empleado e : personal) {
            if (e instanceof Director) {
                ((Director) e).incentivar();*/
            }
    
    
    
    
       
    
    

    //Devuelve la posicion
    public int encontrarEmpleado(Empleado e) {
        int encontrado = -1;
        for (int i = 0; i < personal.size(); i++) {
            Empleado aux = personal.get(i);
            System.out.println("-- " + aux.getnombre());
            if (aux.equals(e)) {
                System.out.println("+++ encontrado!!");
                encontrado = i;
            }
        }

        return encontrado;
    }

    public void eliminarEmpleado() {
        System.out.println("-- Pido datos del objeto a eliminar");
        String nombre = LecturaDatos.leerString("Introduzca el nombre:");
        Empleado aux = new Empleado(nombre);
        this.eliminarEmpleado(aux);
    }

    public void eliminarEmpleado(Empleado e) {
        int pos = encontrarEmpleado(e);
        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado y eliminado");
            personal.remove(pos);
        }
    }

    public void listado(Empleado e) {
    	personal.add(e);
        }
    
    
    public void listado() {
    	//Solucion cutre pero efectiva
        Empleado e = new Empleado();
        e.Listarempleado();
        listado(e);
        
 
       	
        
       /*for (int i = 0 ; i < personal.size(); i++) {
            Empleado aux = personal.get(i);
            System.out.println("Nombre: " + aux.getnombre());
            System.out.println(" ");
            System.out.println("Salario:"+aux.getsalario());
            System.out.println(" ");
             }     */
        
        //Código probable pero que no funciona
        
        /*   Empleado aux = personal.get(personal.size());
           System.out.println("Nombre: " + aux.getnombre());
           System.out.println(" ");
           System.out.println("Salario:"+aux.getsalario());
           System.out.println(" "); */
            }
    
    
    

    public boolean existeEmpleado() {

        System.out.println("-- Pido datos del objeto a localizar");
        String nombre = LecturaDatos.leerString("Introduzca el nombre:");
        Empleado aux = new Empleado(nombre);
        return this.existeEmpleado(aux);

    }

    public boolean existeEmpleado(Empleado e) {
        boolean encontrado = false;
        int pos = encontrarEmpleado(e);

        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado");
            encontrado = true;
        }
        return encontrado;
    }

    public void modificarEmpleado() {

        System.out.println("-- Pido datos del objeto a modificar");
        String nombre = LecturaDatos.leerString("Introduzca el nombre:");
        Empleado aux = new Empleado(nombre);
        
                int pos = encontrarEmpleado(aux);
        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado");
             this.modificarEmpleado(personal.get(pos));
        }
    }

    public void modificarEmpleado(Empleado e) {
        System.out.println("-- Modificacion de datos");
        int seleccion = LecturaDatos.leerInt("¿Que dato desea modificar (1)Nombre, (2)Salario?:");
        if (seleccion == 1) {
            e.setnombre(LecturaDatos.leerString("Introduzca el nuevo nombre:"));
        } else if (seleccion == 2) {
            e.setsalario(LecturaDatos.leerFloat("Indique el nuevo salario:"));
        }
    }

   

	@Override
	public void CasosDePrueba() {
		// TODO Auto-generated method stub
		
	}

}
