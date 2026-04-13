import java.util.Set;
import java.util.HashSet;

public class ProductSetDemo {
    public static void main(String[] args) {
        Set<String> productCodes = new HashSet<>();
        productCodes.add("100");
        productCodes.add("102");
        productCodes.add("103");
        productCodes.add("104");
        productCodes.add("105");

        System.out.println(productCodes);

        productCodes.add("106");
        System.out.println(productCodes);
    }
}
