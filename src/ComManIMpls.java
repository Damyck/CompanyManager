import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.net.Proxy;
import java.util.*;

/**
 * Created by Marc on 28/9/2016.
 */
public class ComManIMpls implements CompanyManager{

    public int numDeps = 0;
    int i;
    List<Department> deps = new ArrayList<Department>();
    List<Worker> works = new ArrayList<Worker>();
    public int numWorks = 0;


    public void addDept(String name, String desc){
        Department dep = new Department(name, desc);
        deps.add(dep);
        numDeps++;

        }






    public void addSalesMan(String DNI, String name, String dept) {

    }

    @Override
    public void addDirector(String DNI, String name, String dept) {

    }

    public void deps() {

        for (int i = 0; i < numDeps; i++) {

            Department depu = deps.get(i);
            System.out.println(depu.Name + " " + depu.Description);


        }

    }

    public void addEmployee(String Name, String DNI, double Salary, String Department){

        String type = "Employee";
        Employee sal = new Employee();
        sal.EmployeeSalary = Salary;
        Worker work = new Worker(Name, DNI, sal.EmployeeSalary, Department, type);
        works.add(work);
        numWorks++;

    }

    public void Employees() {

        for (int i = 0; i < numWorks; i++) {

            Worker worku = works.get(i);
            System.out.println(worku.Name + " " + worku.DNI + " " + worku.Salary + " " + worku.Department + " " + worku.Type);

        }
    }


}
