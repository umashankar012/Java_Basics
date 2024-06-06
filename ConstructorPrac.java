// Constructors are looking like methods and they have no return type
// Every time when an object creates the Constructor will be called
// Constructors are always have two components while declaration : Modifier and method name which should be always same as class name
// Constructors are mainly used for assign values 




class Human {
    int age;
    String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Default constructor
    public Human() {
        this.age = 0;
        this.name = "";
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    

}
public class ConstructorPrac {
    public static void main(String[] args) {
        
        Human obj = new Human(10,"Raj");
        System.out.println(obj.getAge() + ": "+obj.getName());


    }
}
