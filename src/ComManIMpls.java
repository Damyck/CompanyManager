import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

/**
 * Created by Marc on 28/9/2016.
 */
public class ComManIMpls{

    int i;
    public int numDeps = 0;
    List<Department> deps = new ArrayList<Department>();


    public void addDeps(String name, String desc){
        Department dep = new Department(name, desc);
        deps.add(dep);
        numDeps++;

        }


    public void deps() {

        for (int i = 0; i < numDeps; i++) {

            Department depu = deps.get(i);
            System.out.println(depu.Name + " " + depu.Description);


        }

    }

}
