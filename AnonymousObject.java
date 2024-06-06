 /*AnonymousObject are those objects which does not have a reference variable and 
 it will be use for single time and after that again call it will create new one
*/
class Human {

    public Human() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in a class");
    }

}

public class AnonymousObject {
    public static void main(String[] args) {

        new Human();
        new Human().show();
        new Human();

    }
}
