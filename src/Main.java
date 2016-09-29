/**
 * Created by Marc on 28/9/2016.
 */
public class Main {
    public static void main(String[] args){

        ComManIMpls cm = new ComManIMpls();
        cm.addDeps("Barnaclub","La mejor empresa del mundo mundial.");
        cm.addDeps("Adria","L'Adria mola, un xic.");
        cm.deps();
        cm.addEmployee("Marc", "45637X", 1340.56, "Barnaclub");
        cm.Employees();

    }
}
