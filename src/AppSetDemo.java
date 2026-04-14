import java.util.HashSet;
import java.util.Set;
public class AppSetDemo {
    public static void main(String[] args) {

        Set<String>  mobileAppNames = new HashSet<>();
        mobileAppNames.add("WhatsApp");
        mobileAppNames.add("Instagram");
        mobileAppNames.add("TikTok");
        mobileAppNames.add("Google Maps");
        mobileAppNames.add("Spotify");

        System.out.println( mobileAppNames); // Display all mobile app names in the set
        System.out.println( mobileAppNames.add("Google Maps")); // add an exists value
        System.out.println( mobileAppNames); // Display all mobile app names in the set
        System.out.println( mobileAppNames.contains("TikTok")); // check if TikTok exists in set or not
        mobileAppNames.remove("Instagram"); // remove Instagram from set
        System.out.println( mobileAppNames); // Display all mobile app names in the set
        System.out.println("number of mobile app names in the set are: "+ mobileAppNames.size()); // display size of set
        mobileAppNames.clear(); // make set empty
        System.out.println( mobileAppNames); // Display all mobile app names in the set
        System.out.println("number of mobile app names in the set after update: "+ mobileAppNames.size()); // display size of set


    }
}
