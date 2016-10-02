/**
 * Created by Marc on 28/9/2016.
 */
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;

public class Main extends ComManIMpls{

    static ComManIMpls nueva= new ComManIMpls();
    public static void main(String[] args) throws IOException {

        ComHashMap DHashMap = new ComHashMap();

        nueva.addDept("Barnaclub", "La mejor empresa del mundo mundial.");
        nueva.addDept("Adria", "L'Adria mola, un xic.");
        nueva.addEmployee("Marc", "45637X", 1340.56, "Barnaclub");
        int op = 9;
        while (op != 0) {
            System.out.println("\n\n BIENVENIDO:");
            System.out.print("Seleccione la opción que desea:");
            System.out.println("1.- Añadir datos");
            System.out.println("2.- Consultar diferentes datos");


            System.out.println("0.- Salir");
            op = getInt();

            switch (op) {
                case 1: //Instertar Datos
                    System.out.println("1.- Crear departamento");
                    System.out.println("2.- Añadir empleado");
                    System.out.println("3.- Añadir sales man");
                    System.out.println("4.- Añadir venta");
                    System.out.println("5.- Añadir director");
                    System.out.println("0.- Salir");
                    op = getInt();
                    switch (op) {
                        case 1: //Crear departamento
                            System.out.println("Introduzca el nombre del departamento:");
                            String nombre = getString();
                            System.out.println("Escriba una breve descripcion de referencia:");
                            String descripcion = getString();
                            nueva.addDept(nombre, descripcion);
                            System.out.println("El siguiente departamento ha sido añadido correctamente: " + nombre);
                            break;

                        case 2: //Añadir empleado
                            System.out.println("Introduzca el nombre del empleado:");
                            String name = getString();
                            System.out.println("Introduzca el DNI:");
                            String dni = getString();
                            System.out.println("Introduzca el salario:"); //diria que no se tiene que añadir el salario aqui, sino
                            Double salary = getDouble();                  //que se tiene que calcular automaticamente
                            System.out.println("Introduzca el departamento:");
                            String departamento = getString();
                            nueva.addEmployee(name, dni, salary, departamento);
                            System.out.println("El siguiente empleado ha sido añadido correctamente: " + name);
                            break;


                        case 3: //Añadir SalesMan
                            System.out.println("Introduzca el nombre:");
                            String nameSalesMan = getString();
                            System.out.println("Introduzca el DNI:");
                            String dniSalesMan = getString();
                            System.out.println("Introduzca el Salario:");
                            double salarySalesMan = getDouble();
                            System.out.println("Introduzca el valor de sus ventas:");
                            double salesSalesMan = getDouble();
                            System.out.println("Introduzca el departamento:");
                            String departamentoSalesMan = getString();
                            nueva.addSalesMan(nameSalesMan, dniSalesMan, salarySalesMan, departamentoSalesMan, salesSalesMan); //falta crear funcion añadir_salesman
                            System.out.println("El siguiente salesman ha sido añadido correctamente: " + nameSalesMan);
                            break;
                        case 4: //Añadir venta
                            System.out.println("Introduzca el dni:");
                            String dniSM = getString();
                            System.out.println("Añade la venta:");
                            Double venta= getDouble();
                            //crear bien la funcion addSale-para añadir una venta
                            nueva.addSale(dniSM, venta);



                        case 5:  //Añadir director
                            System.out.println("Introduzca el nombre del director:");
                            String nameDirector = getString();
                            System.out.println("Introduzca el DNI:");
                            String dniDirector = getString();
                            System.out.println("Introduzca el Sueldo:");
                            double sueldoDirector = getDouble();
                            System.out.println("Introduzca el departamento:");
                            String departamentoDirector = getString();
                            nueva.addDirector(nameDirector, dniDirector,sueldoDirector, departamentoDirector); //falta crear funcion añadir_director
                            System.out.println("El siguiente director ha sido añadido correctamente: " + nameDirector);
                            break;
                    }
                    break;
                case 2: //Consultar Datos
                    System.out.print("¿Que datos desea consultar?");
                    System.out.println("1.- Lista de Departamentos");
                    System.out.println("2.- Lista de trabajadores y salario segun departamento");
                    System.out.println("3.- Numero de Empleados");
                    //se tienen que añadir los siguientes dos, dentro del case 2-consultar datos.
                    System.out.println("4.- Lista de empleados por nombre");
                    System.out.println("5.- Lista de empleados por salario");
                    System.out.println("0.- Salir");

                    op = getInt();
                    switch (op) {
                        case 1: //Lista de departamentos
                            nueva.deps();
                            break;
                        case 2: //Lista de departamentos
                            System.out.println("Introduzca el departamento:");
                            String dept = getString();
                            System.out.println("Introduzca 0 si desea obtener la lista de trabajadores");
                            System.out.println("Introduzca 1 si desea obtener su salario");
                            int numero = getInt();
                            nueva.EmployeeByDepartment(dept,numero);


                            break;
                        case 3: //Lista de empleados
                            nueva.Employees();
                            break;
                    }
            }






        }
    }

    // Funcion para capturar una cadena desde el teclado
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // Funcion para capturar un double desde el teclado
    public static double getDouble() throws IOException {
        String s = getString();
        return Double.parseDouble(s);
    }
    // Funcion para capturar un entero desde el teclado
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    }
