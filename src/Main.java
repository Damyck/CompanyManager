/**
 * Created by Marc on 28/9/2016.
 */
public class Main {
    public static void main(String[] args){
        //pruebagit
        ComManIMpls cm = new ComManIMpls();
        cm.addDept("Barnaclub","La mejor empresa del mundo mundial.");
        cm.addDept("Adria","L'Adria mola, un xic.");
        cm.deps();
        cm.addEmployee("Marc", "45637X", 1340.56, "Barnaclub");
        cm.Employees();
        //añadiré un menú para pedir datos por teclado y recogerlos, o exponer la situacion de la empresa.
    }
}
