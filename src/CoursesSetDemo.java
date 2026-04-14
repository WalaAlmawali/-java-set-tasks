import java.util.HashSet;
import java.util.Set;

public class CoursesSetDemo {
    public static void main(String[] args) {

        Set<String> courseNames = new HashSet<>();
        courseNames.add("Mathematics");
        courseNames.add("Physics");
        courseNames.add("Chemistry");
        courseNames.add("Computer Science");
        courseNames.add("Biology");

        System.out.println(courseNames); // Display all course names in the set
        courseNames.add("Networking"); // add one more course
        System.out.println(courseNames); // Display all course names in the set
        System.out.println(courseNames.add("Mathematics")); // add an exists value, which will not store because set allows only unique elements
        System.out.println(courseNames.contains("Biology")); // check if Biology exists in set or not add display the result
        System.out.println(courseNames.contains("Web Design")); // check if Web Design exists in set or not add display the result

        courseNames.remove("Physics"); // remove Physics from set
        System.out.println(courseNames); // Display all course names in the set after removing
        System.out.println("number of course names in the set are: "+courseNames.size()); // display size of set
        courseNames.add("Python"); // add one more course
        System.out.println("number of course names in the set after update: "+courseNames.size()); // display size of set

        courseNames.clear(); // make set empty
        System.out.println(courseNames); // Display all course names in the set
        System.out.println("number of course names in the set after update: "+courseNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
