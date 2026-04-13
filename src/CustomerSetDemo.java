import java.util.Set;
import java.util.HashSet;

public class CustomerSetDemo {
    public static void main(String[] args) {
        Set<String> productCodes = new HashSet<>();
        productCodes.add("11");
        productCodes.add("12");
        productCodes.add("13");
        productCodes.add("14");
        productCodes.add("15");

        System.out.println(productCodes);
        productCodes.add("13"); // try to add an exists value
        System.out.println(productCodes);

    }
}
