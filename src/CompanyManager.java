import java.util.Vector;

/**
 * Created by Marc on 26/9/2016.
 */
public interface CompanyManager{

    public void addDept(String name, String description);
    public void addEmployee(String DNI, String name, double salary, String dept);
    public void addSalesMan(String DNI, String name, double salary, String dept);
    public void addDirector(String DNI, String name, double salary, String dept);
    public void deps();


}
