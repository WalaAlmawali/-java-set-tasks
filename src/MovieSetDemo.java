import java.util.HashSet;
import java.util.Set;
public class MovieSetDemo {
    public static void main(String[] args) {

        Set<String>   movieNames = new HashSet<>();
         movieNames.add("Titanic");
         movieNames.add("Avatar");
         movieNames.add("The Avengers");
         movieNames.add("Jurassic Park");
         movieNames.add("The Lion King");

        System.out.println(  movieNames); // Display all  movie names in the set
        System.out.println(  movieNames.add("The Avengers")); // add an exists value
        System.out.println(  movieNames); // Display all movie names in the set
        System.out.println(  movieNames.contains("Avatar")); // check if Avatar exists in set or not
         movieNames.remove("Titanic"); // remove Titanic from set
        System.out.println(  movieNames); // Display all movie names  in the set
        System.out.println("number of movie names in the set are: "+  movieNames.size()); // display size of set
         movieNames.clear(); // make set empty
        System.out.println(  movieNames); // Display all movie names in the set
        System.out.println("number of movie names in the set after update: "+  movieNames.size()); // display size of set


    }
}
