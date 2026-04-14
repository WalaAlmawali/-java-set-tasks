import java.util.Set;
import java.util.HashSet;

public class ClearSetDemo {
    public static void main(String[] args){
        Set<String>  userNames = new HashSet<>();
        userNames.add("sara");
        userNames.add("wala");
        userNames.add("mohammed");
        userNames.add("wafa");
        userNames.add("waad");
        System.out.println(userNames);

        System.out.println("the number of usersbare: " + userNames.size()); // show size of set
        userNames.clear(); // clear the set - make it empty
        System.out.println(userNames);
        System.out.println("the number of usersbare after clearing : " + userNames.size());// show size of set after clearing
    }
}
