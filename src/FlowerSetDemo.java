import java.util.Set;
import java.util.HashSet;

public class FlowerSetDemo {
    public static void main(String[] args) {

        Set<String>  flowerNames = new HashSet<>();
        flowerNames.add("Rose");
        flowerNames.add("Tulip");
        flowerNames.add("Sunflower");
        flowerNames.add("Lily");
        flowerNames.add("Orchid");

        System.out.println( flowerNames); // Display all flowers names in the set
        flowerNames.add("Jasmine"); // add one more flowers name
        System.out.println( flowerNames); // Display all flowers names in the set
        System.out.println( flowerNames.add("Lily")); // add an exists value, which will not store because set allows only unique elements
        System.out.println( flowerNames); // Display all flowers names in the set

        System.out.println( flowerNames.contains("Tulip")); // check if Tulip exists in set or not add display the result
        System.out.println( flowerNames.contains("Daisy")); // check if Daisy exists in set or not add display the result

        flowerNames.remove("Orchid"); // remove Orchid from set
        System.out.println( flowerNames); // Display all flowers names in the set after removing
        System.out.println("number of flowers names in the set are: "+ flowerNames.size()); // display size of set
        flowerNames.add("Daisy"); // add one more flower
        System.out.println("number of flowers names in the set after update: "+ flowerNames.size()); // display size of set

        flowerNames.clear(); // make set empty
        System.out.println( flowerNames); // Display all fruits names in the set
        System.out.println("number of flowers names in the set after update: "+ flowerNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
