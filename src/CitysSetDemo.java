import java.util.HashSet;
import java.util.Set;

import java.util.Set;
import java.util.HashSet;

public class CitysSetDemo {
    public static void main(String[] args) {

        Set<String> cityNames = new HashSet<>();
        cityNames.add("Muscat");
        cityNames.add("Salalah");
        cityNames.add("Sohar");
        cityNames.add("Nizwa");
        cityNames.add("Sur");

        System.out.println(cityNames); // display set values
        cityNames.add("Barka"); // add new element to the set
        System.out.println(cityNames.add("Sohar")); // try to add an exists value, which will not store because  Setallows only unique elements
        System.out.println(cityNames); // display set values

        System.out.println(cityNames.contains("Salalah")); // check if Salalah exists in the set or not
        System.out.println(cityNames.contains("Nakhal")); // check if Nakhal exists in the set or not

        cityNames.remove("Muscat"); // remove Muscat from set
        System.out.println(cityNames); // display set values after removing
        System.out.println("number of city names in the set are: "+cityNames.size()); // display size of set
        cityNames.add("Ibri");
        System.out.println("number of city names in the set after update : "+cityNames.size()); // display size of set

        cityNames.clear(); // remove all items from the set
        System.out.println(cityNames); // display set after clearing it
        System.out.println("number of city names in the set after update : "+cityNames.size()); // display size of set
        System.out.println("set now contains zero elements");


    }
}
