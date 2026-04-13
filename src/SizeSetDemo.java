import java.util.Set;
import java.util.HashSet;


public class SizeSetDemo {
    public static void main(String[] args) {
        Set<String> departmentNames = new HashSet<>();
        departmentNames.add("Human Resources");
        departmentNames.add("Finance");
        departmentNames.add("Marketing");
        departmentNames.add("IT");
        departmentNames.add("Sales");

        System.out.println(departmentNames);
        System.out.println("the number of department are: " + departmentNames.size()); // show the size of set
        departmentNames.add("purchasing"); // add one more department
        System.out.println("the number of department after update are: " + departmentNames.size()); // again show the size of set after ad new one item
    }
}
