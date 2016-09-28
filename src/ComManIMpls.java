import java.util.Vector;

/**
 * Created by Marc on 28/9/2016.
 */
public class ComManIMpls {

    int i;
    public int numDeps = 0;
    public Department deps[];

    public void addDeps(String name, String desc){
        Department dep = new Department(name, desc);
        this.deps[numDeps] = dep;
        numDeps++;

        }


    public void deps() {

        for (int i = 0; i <= numDeps; i++) {

            System.out.println(deps[i]);
        }

    }

}
