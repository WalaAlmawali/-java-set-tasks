import java.util.Set;
import java.util.HashSet;

public class CustomerSetDemo {
    public static void main(String[] args) {
        Set<String> customerIDs = new HashSet<>();
        customerIDs.add("11");
        customerIDs.add("12");
        customerIDs.add("13");
        customerIDs.add("14");
        customerIDs.add("15");

        System.out.println(customerIDs);
        customerIDs.add("13"); // try to add an exists value
        System.out.println(customerIDs);

    }
}
