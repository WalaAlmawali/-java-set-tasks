import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {
    public static void main(String[] args) {

        Set<String>    websiteNames  = new HashSet<>();
         websiteNames .add("Google");
         websiteNames .add("YouTube");
         websiteNames .add("Wikipedia");
         websiteNames .add("Amazon");
         websiteNames .add("Facebook");

        System.out.println(   websiteNames ); // Display all website names  in the set
        System.out.println(   websiteNames .add("Google")); // add an exists value
        System.out.println(   websiteNames ); // Display all website names  in the set
        System.out.println(   websiteNames .contains("Amazon")); // check if Amazon exists in set or not
        websiteNames .remove("YouTube"); // remove YouTube from set
        System.out.println(   websiteNames ); // Display all website names  in the set
        System.out.println("number of website names  in the set are: "+   websiteNames .size()); // display size of set
        websiteNames.clear(); // make set empty
        System.out.println(   websiteNames ); // Display all website names  in the set
        System.out.println("number of website names  in the set after update: "+ websiteNames .size()); // display size of set


    }
}
