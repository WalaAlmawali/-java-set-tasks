import java.util.Set;
import java.util.HashSet;

public class CountrySetDemo {
    public static void main(String[] args) {

        Set<String> countryNames = new HashSet<>();
        countryNames.add("Japan");
        countryNames.add("Brazil");
        countryNames.add("Canada");
        countryNames.add("Germany");
        countryNames.add("Kenya");

        System.out.println(countryNames); // Display all country names in the set
        countryNames.add("Oman"); // add one more country
        System.out.println(countryNames); // Display all country names in the set
        System.out.println(countryNames.add("Canada")); // add an exists value, which will not store because set allows only unique elements
        System.out.println(countryNames); // Display all country names in the set

        System.out.println(countryNames.contains("Brazil")); // check if Brazil exists in set or not add display the result
        System.out.println(countryNames.contains("Qatar")); // check if Qatar exists in set or not add display the result

        countryNames.remove("Kenya"); // remove Kenya from set
        System.out.println(countryNames); // Display all country names in the set after removing
        System.out.println("number of country names in the set are: "+countryNames.size()); // display size of set
        countryNames.add("Qatar"); // add one more country
        System.out.println("number of country names in the set after update: "+countryNames.size()); // display size of set

        countryNames.clear(); // make set empty
        System.out.println(countryNames); // Display all country names in the set
        System.out.println("number of country names in the set after update: "+countryNames.size()); // display size of set to confirm that the set is empty
        System.out.println(" set now contains zero elements");

    }
}
