import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
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


    //funcion para añadir departamento--> nombre y descripcion
    public void addDept(String name, String desc){
        Department dep = new Department(name, desc);
        deps.add(dep);
        numDeps++;

        }


    //funcion que printa por pantalla los departamentos (nombre y descripcion)
    public void deps() {

        for (int i = 0; i < numDeps; i++) {

            Department depu = deps.get(i);
            System.out.println(depu.Name + " " + depu.Description);


        }

    }

    //funcion para añadir empleado--> nombre, dni, salario y departamento
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
    @Override

    public void addSalesMan(String Name, String DNI, double Salary, String Department, double Sales) {

        String type = "SalesMan";
        SalesMan sal = new SalesMan();
        sal.SalesManSalary = Salary;
        sal.Sales = Sales;
        double salary = sal.salary();
        Worker work = new Worker(Name, DNI, salary, Department, type);
        works.add(work);
        numWorks++;
    }

    public double EmployeeByDepartment(String Department, int devolver){//Devuelve todos los trabajadores de un departamento
        int numWor = 0;
        List<Worker> wor = new ArrayList<Worker>();
        double salary = 0;
        for (int i = 0; i < numWorks; i++) {

            Worker worku = works.get(i);
            String dep = worku.Department;
            if (Department.equals(dep) == true) {
                wor.add(numWor, worku);
                numWor++;

            }
        }
        for (int i = 0; i < numWor; i++) {
            Worker worku = wor.get(i);
            if (devolver == 1) {
                System.out.println(worku.Name + " " + worku.DNI + " " + worku.Salary + " " + worku.Department + " " + worku.Type);
            }
            else if (devolver == 0){
                salary = worku.Salary + salary;

            }
        }
        if (devolver == 0){
            return salary;
        }
        else{
            return  0;
        }

    }

    @Override
    public void addDirector(String Name, String DNI, double Salary, String Department) {
        double TotalSalary = this.EmployeeByDepartment(Department, 0);
        String type = "Director";
        Director sal = new Director();
        sal.DirectorSalary = Salary;
        sal.WholeSalaries = TotalSalary;
        double salary = sal.salary();
        Worker work = new Worker(Name, DNI, salary, Department, type);
        works.add(work);
        numWorks++;

    }


}
