import java.util.Set;
import java.util.HashSet;

public class EmployeesSetDemo {
    public static void main(String[] args){
        Set<String>  employeeNames = new HashSet<>();
        employeeNames.add("Ali");
        employeeNames.add("Sara");
        employeeNames.add("Omar");
        employeeNames.add("Noor");
        employeeNames.add("Maha");

        System.out.println(employeeNames); //print set elements

        employeeNames.add("Wala"); // add  new element to the set
        employeeNames.add("Omar"); // try to add an exist name
        System.out.println(employeeNames); //print set elements again, Omar will not add becaue set allows only unique elements

        System.out.println(employeeNames.contains("Noor")); // check if  Noor is exist in the set or not
        System.out.println(employeeNames.contains("Mohammed")); // check if  Mohammed is exist in the set or not

        employeeNames.remove("Maha"); // remove Maha from the set
        System.out.println(employeeNames); //print set elements after removing Maha
        System.out.println("the number of employee names in the set : " +employeeNames.size()); // show size of set
        employeeNames.add("Asma");
        System.out.println("the number of employee names in the set after update : " +employeeNames.size()); // show size of set

        employeeNames.clear(); // make set empty, remove all elements
        System.out.println(employeeNames);  //print set elements after clearing
        System.out.println("the number of employee names in the set after clearing it : " +employeeNames.size()); // show size of set after clearing to confirm that the set is empty

        System.out.println("set now contains zero elements  ");
    }
}
