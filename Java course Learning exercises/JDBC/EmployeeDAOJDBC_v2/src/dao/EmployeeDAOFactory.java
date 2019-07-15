package dao;

public class EmployeeDAOFactory {

    public I_EmployeeDAO createEmployeeDAO() {
        //Fijate como empleo el polimorfismo
        //Devuelvo una interface implementada con una clase
        return new EmployeeDAOJDBCImpl();
    }
}