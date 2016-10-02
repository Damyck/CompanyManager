import java.util.HashMap;
import java.util.Set;

/**
 * Created by pauli on 02/10/2016.
 */

public class ComHashMap {

    HashMap<String, String> deptHash = new HashMap<String, String>();

    public ComHashMap() {
        Set<String> set1 = deptHash.keySet();

    }
    public void AñadirDeptHashMap(String name, Department dep){
        deptHash.put(name, String.valueOf(dep));
    }

}

