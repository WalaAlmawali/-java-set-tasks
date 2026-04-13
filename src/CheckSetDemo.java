import java.util.Set;
import java.util.HashSet;


public class CheckSetDemo {
    public static void main(String[] args){
        Set<String> employeeIDs = new HashSet<>();
        employeeIDs.add("1000");
        employeeIDs.add("1002");
        employeeIDs.add("1003");
        employeeIDs.add("1004");
        employeeIDs.add("1005");

        System.out.println(employeeIDs);
        System.out.println(employeeIDs.contains("1003")); // check if 1003 id  exists on the set or not
        System.out.println(employeeIDs.contains("1006")); // check if 1003 id  exists on the set or not
    }
}
