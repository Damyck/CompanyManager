import java.util.Vector;

/**
 * Created by Marc on 26/9/2016.
 */
public interface CompanyManager{

    void addDept(String name, String description);
    void addEmployee(String DNI, String name, double Salary, String dept);
    void addSalesMan(String DNI, String name, double Salary, String dept, double Sales);
    void addDirector(String DNI, String name, double Salary, String dept);
    void deps();
    void addSale(String DNI,double amount);
    void salariesDept(Department deps);
    String Department(); //lista de departamentos
    String employeeByName(); //lista de empleados x nombre
    String employeeBySalary(); //lista de epleados x salario
    String employeeByDept(); //lista de empleados x departamentos


}
