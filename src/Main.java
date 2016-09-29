/**
 * Created by Marc on 28/9/2016.
 */
public class Main {
    public static void main(String[] args){

        ComManIMpls th = new ComManIMpls();
        th.addDeps("Barnaclub","La mejor empresa del mundo mundial.");
        th.addDeps("Adria","L'Adria mola, un xic.");
        th.deps();
    }
}
