/**
 * Created by Marc on 29/9/2016.
 */
public class Worker{

    public String Name;
    public String DNI;
    public String Department;
    public double Salary;
    public String Type;

    public Worker(String Name, String DNI, double Salary, String Department, String type){

        this.Name = Name;
        this.DNI = DNI;
        this.Department = Department;
        this.Salary = Salary;
        this.Type = type;
    }

}
class Employee { //clase donde se define el salario de cada trabajador

    public double EmployeeSalary;

}
class SalesMan{ //clase donde se define el numero de ventas de cada trabajador
    public double NumOfSales;
     //sales + 5% sales

}
class Director{ //clase donde se define el numero de ventas de cada trabajador
    public double DirectorSalary;
    //sales + 5% sales

}
