import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args) {

        Set<String>  bookTitles = new HashSet<>();
         bookTitles.add("To Kill a Mockingbird");
         bookTitles.add("Pride and Prejudice");
         bookTitles.add("The Great Gatsby");
         bookTitles.add("Harry Potter and the Sorcerer’s Stone Science");
         bookTitles.add("The Hobbit");

        System.out.println( bookTitles); // Display all book titles in the set
        System.out.println( bookTitles.add("The Great Gatsby")); // add an exists value
        System.out.println( bookTitles); // Display all book titles in the set
        System.out.println( bookTitles.contains("The Hobbit")); // check if The Hobbit exists in set or not
         bookTitles.remove("Pride and Prejudice"); // remove Pride and Prejudice from set
        System.out.println( bookTitles); // Display all book titles in the set
        System.out.println("number of book titles in the set are: "+ bookTitles.size()); // display size of set
         bookTitles.clear(); // make set empty
        System.out.println( bookTitles); // Display all book titles in the set
        System.out.println("number of book titles in the set after update: "+ bookTitles.size()); // display size of set


    }
}
