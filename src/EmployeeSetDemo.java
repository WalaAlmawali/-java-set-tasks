import java.util.Set;
import java.util.HashSet;

public class EmployeeSetDemo {
    public static void main(String[] args){
        Set<String>  employeeIDs = new HashSet<>();
        employeeIDs.add("300");
        employeeIDs.add("400");
        employeeIDs.add("500");
        employeeIDs.add("600");
        employeeIDs.add("700");

        System.out.println(employeeIDs); //print set items
        employeeIDs.add("400"); // add an exist ID
        System.out.println(employeeIDs); //print set items after add one new employee ID
        System.out.println(employeeIDs.contains("600")); // check if  600 is exist in the set or not
        employeeIDs.remove("700"); // remove 700 from the set
        System.out.println(employeeIDs); //print set items again
        System.out.println(employeeIDs.size()); // show size of set
        employeeIDs.clear(); // make set empty
        System.out.println(employeeIDs);  //print set items
        System.out.println(employeeIDs.size()); //to confirm that the set is empty
    }
}
