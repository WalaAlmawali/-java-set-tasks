import java.util.Set;
import java.util.HashSet;

public class CitySetDemo {
    public static void main(String[] args) {

        Set<String> cityNames = new HashSet<>();
        cityNames.add("New York");
        cityNames.add("London");
        cityNames.add("Tokyo");
        cityNames.add("Paris");
        cityNames.add("Sydney");

        System.out.println(cityNames); // display set values
        System.out.println(cityNames.add("Paris")); // add an exists value
        System.out.println(cityNames); // display set values
        System.out.println(cityNames.contains("London"));
        cityNames.remove("Sydney"); // remove Sydney from set
        System.out.println(cityNames); // display set values
        System.out.println("number of city names in the set are: "+cityNames.size()); // display size of set
        cityNames.clear();
        System.out.println(cityNames); // display set values
        System.out.println("number of city names in the set after update : "+cityNames.size()); // display size of set


    }
}
