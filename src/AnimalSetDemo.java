import java.util.Set;
import java.util.HashSet;

public class AnimalSetDemo {
    public static void main(String[] args) {

        Set<String>  carNames = new HashSet<>();
        carNames.add("Lion");
        carNames.add("Elephant");
        carNames.add("Dolphin");
        carNames.add("Eagle");
        carNames.add("Panda");

        System.out.println( carNames); // Display all animals names in the set
        carNames.add("Kangaroo"); // add one more animal name
        System.out.println( carNames); // Display all animals names in the set
        System.out.println( carNames.add("Elephant")); // add an exists value, which will not store because set allows only unique elements
        System.out.println( carNames); // Display all animals names in the set

        System.out.println( carNames.contains("Lion")); // check if Lion exists in set or not add display the result
        System.out.println( carNames.contains("Cheetah")); // check if Cheetah exists in set or not add display the result

        carNames.remove("Panda"); // remove Panda from set
        System.out.println( carNames); // Display all animals names in the set after removing
        System.out.println("number of animals names in the set are: "+ carNames.size()); // display size of set
        carNames.add("Penguin"); // add one more animal
        System.out.println("number of animals names in the set after update: "+ carNames.size()); // display size of set

        carNames.clear(); // make set empty
        System.out.println( carNames); // Display all animals names in the set
        System.out.println("number of animals names in the set after update: "+ carNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
