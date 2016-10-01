/**
 * Created by Marc on 28/9/2016.
 */
import java.io.*;

public class Main extends ComManIMpls{
    static ComManIMpls nueva= new ComManIMpls();
    public static void main(String[] args) throws IOException {

        int op = 5;
        while (op != 0) {
            System.out.println("\n\n BIENVENIDO:");
            System.out.print("Seleccione la opción que desea:");
            System.out.println("1.- Crear departamento");
            System.out.println("2.- Añadir empleado");
            System.out.println("3.- Faltan añadir cosas");
            System.out.println("0.- Salir");

            op = getInt();
            switch (op) {
                case 1:
                    System.out.println("Introduzca el nombre del departamento:");
                    String nombre= getString();
                    System.out.println("Escriba una breve descripcion de referencia:");
                    String descripcion=getString();
                    nueva.addDept(nombre, descripcion);
                    System.out.println("El siguiente departamento ha sido añadido correctamente: "+nombre);
                    break;

                case 2:
                    System.out.println("Introduzca el nombre del empleado:");
                    String name= getString();
                    System.out.println("Introduzca el DNI:");
                    String dni=getString();
                    System.out.println("Introduzca el salario:"); //diria que no se tiene que añadir el salario aqui, sino
                    Double salary= getDouble();                  //que se tiene que calcular automaticamente
                    System.out.println("Introduzca el departamento:");
                    String departamento = getString();
                    nueva.addEmployee(name, dni, salary, departamento);
                    System.out.println("El siguiente empleado ha sido añadido correctamente: "+name);
                    break;


                case 3:
                    ;
                    break;
            }
        }
            ComManIMpls cm = new ComManIMpls();
            cm.addDept("Barnaclub", "La mejor empresa del mundo mundial.");
            cm.addDept("Adria", "L'Adria mola, un xic.");
            cm.deps();
            cm.addEmployee("Marc", "45637X", 1340.56, "Barnaclub");
            cm.Employees();
            //añadiré un menú para pedir datos por teclado y recogerlos, o exponer la situacion de la empresa.

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
