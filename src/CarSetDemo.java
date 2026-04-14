import java.util.Set;
import java.util.HashSet;

public class CarSetDemo {
    public static void main(String[] args) {

        Set<String>  carNames = new HashSet<>();
         carNames.add("Toyota");
         carNames.add("Honda");
         carNames.add("BMW");
         carNames.add("Audi");
         carNames.add("Nissan");

        System.out.println( carNames); // Display all car names in the set
         carNames.add("Mercedes"); // add one more car name
        System.out.println( carNames); // Display all subject names in the set
        System.out.println( carNames.add("Honda")); // add an exists value, which will not store because set allows only unique elements
        System.out.println( carNames); // Display all car names in the set

        System.out.println( carNames.contains("Nissan")); // check if Nissan exists in set or not add display the result
        System.out.println( carNames.contains("Lexus")); // check if Lexus exists in set or not add display the result

         carNames.remove("Toyota"); // remove Toyota from set
        System.out.println( carNames); // Display all car names in the set after removing
        System.out.println("number of car names in the set are: "+ carNames.size()); // display size of set
         carNames.add("Kia"); // add one more car
        System.out.println("number of car names in the set after update: "+ carNames.size()); // display size of set

         carNames.clear(); // make set empty
        System.out.println( carNames); // Display all car names in the set
        System.out.println("number of car names in the set after update: "+ carNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
