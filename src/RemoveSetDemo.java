import java.util.Set;
import java.util.HashSet;

public class RemoveSetDemo {
    public static void main(String[] args){
        Set<String> productNames = new HashSet<>();
        productNames.add("apple");
        productNames.add("orang");
        productNames.add("chocolate");
        productNames.add("cola");
        productNames.add("banana");

        System.out.println(productNames);
        productNames.remove("cola"); // remove cola from the set
        System.out.println(productNames);
    }
}
