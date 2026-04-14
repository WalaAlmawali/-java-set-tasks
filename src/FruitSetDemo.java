import java.util.Set;
import java.util.HashSet;

public class FruitSetDemo {
    public static void main(String[] args) {

        Set<String>  fruitNames = new HashSet<>();
        fruitNames.add("Apple");
        fruitNames.add("Mango");
        fruitNames.add("Strawberry");
        fruitNames.add("Banana");
        fruitNames.add("Kiwi");

        System.out.println( fruitNames); // Display all fruits names in the set
        fruitNames.add("Grapes"); // add one more fruit name
        System.out.println( fruitNames); // Display all fruits names in the set
        System.out.println( fruitNames.add("Banana")); // add an exists value, which will not store because set allows only unique elements
        System.out.println( fruitNames); // Display all fruits names in the set

        System.out.println( fruitNames.contains("Apple")); // check if Apple exists in set or not add display the result
        System.out.println( fruitNames.contains("Peach")); // check if Peach exists in set or not add display the result

        fruitNames.remove("Kiwi"); // remove Kiwi from set
        System.out.println( fruitNames); // Display all fruits names in the set after removing
        System.out.println("number of fruits names in the set are: "+ fruitNames.size()); // display size of set
        fruitNames.add("Penguin"); // add one more animal
        System.out.println("number of fruits names in the set after update: "+ fruitNames.size()); // display size of set

        fruitNames.clear(); // make set empty
        System.out.println( fruitNames); // Display all fruits names in the set
        System.out.println("number of fruits names in the set after update: "+ fruitNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
