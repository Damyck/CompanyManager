import java.util.Vector;

/**
 * Created by Marc on 26/9/2016.
 */
//interficie companymanager
public interface CompanyManager{

    void addDept(String name, String description);
    void addEmployee(String DNI, String name, double Salary, String dept);
    void addSalesMan(String DNI, String name, double Salary, String dept, double Sales);
    void addDirector(String DNI, String name, double Salary, String dept);
    void deps();
    void addSale(String DNI,double amount);




}
