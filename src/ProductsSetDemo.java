import java.util.Set;
import java.util.HashSet;

public class ProductsSetDemo {
    public static void main(String[] args) {

        Set<String>  productNames = new HashSet<>();
         productNames.add("Cola");
         productNames.add("Apple");
         productNames.add("Orang");
         productNames.add("Chocolate");
         productNames.add("Banana");

        System.out.println( productNames); // Display  set value
        System.out.println(productNames.add("Cola")); // try to add an exist product names
        System.out.println( productNames.contains("Banana")); // chek Banana  exists in the set or not and display result
         productNames.remove("Orang"); // remove Orang from set
        System.out.println( productNames); //Display  set value
        System.out.println("number of product names in the set are : "+ productNames.size()); // check set size
         productNames.clear(); // make set empty
        System.out.println( productNames); //Display  set value
        System.out.println("number of product names in the set after update : "+ productNames.size());// check set size again

    }
}
