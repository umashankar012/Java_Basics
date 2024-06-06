// In Java Strings are immutable and we can't change the existing String and
//  it creates a new string by deleting the previous string to utilixe the memory


// To make the Strings mutable we use two things ->  String Buffer and String Builder
public class Strings {
    public static void main(String[] args) {
        String str = new String("rahul");
        System.out.println(str);

        // printing integer value associated with each object
        // System.out.println(str.hashCode());

        System.out.println("hello " + str);

        String str = "jay";

        // Both name and name1 references to same string without creating a new string
        // i.e, Jay

        String name = "Jay";
        String name1 = "Jay";

    }
}
