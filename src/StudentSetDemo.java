import java.util.Set;
import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {

        Set<String> studentNames = new HashSet<>();
        studentNames.add("wala");
        studentNames.add("waad");
        studentNames.add("wafa");
        studentNames.add("wedad");
        studentNames.add("wejdan");

        System.out.println(studentNames); // Display  set value
        studentNames.add("wedad"); // try to add an exist name
        System.out.println(studentNames.contains("waad")); // chek waad  exists in the set or not and display result
        studentNames.remove("wala"); // remove wala from set
        System.out.println(studentNames); //Display  set value
        System.out.println("number of student in the set are : "+studentNames.size()); // check set size
        studentNames.clear(); // make set empty
        System.out.println(studentNames); //Display  set value
        System.out.println("number of student in the set after update : "+studentNames.size());// check set size again

    }
}
