import java.util.Set;
import java.util.HashSet;

public class SubjectSetDemo {
    public static void main(String[] args) {

        Set<String> subjectNames = new HashSet<>();
        subjectNames.add("Mathematics");
        subjectNames.add("Physics");
        subjectNames.add("Chemistry");
        subjectNames.add("Computer Science");
        subjectNames.add("Biology");

        System.out.println(subjectNames); // Display all subject names in the set
        subjectNames.add("English"); // add one more subject
        System.out.println(subjectNames); // Display all subject names in the set
        System.out.println(subjectNames.add("Mathematics")); // add an exists value, which will not store because set allows only unique elements
        System.out.println(subjectNames); // Display all subject names in the set

        System.out.println(subjectNames.contains("Biology")); // check if Biology exists in set or not add display the result
        System.out.println(subjectNames.contains("Web Design")); // check if Web Design exists in set or not add display the result

        subjectNames.remove("Physics"); // remove Physics from set
        System.out.println(subjectNames); // Display all subject names in the set after removing
        System.out.println("number of subject names in the set are: "+subjectNames.size()); // display size of set
        subjectNames.add("Python"); // add one more subject
        System.out.println("number of subject names in the set after update: "+subjectNames.size()); // display size of set

        subjectNames.clear(); // make set empty
        System.out.println(subjectNames); // Display all subject names in the set
        System.out.println("number of subject names in the set after update: "+subjectNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
