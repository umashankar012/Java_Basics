class Human {

    private int age;
    private String name;

    // Default Constructor : null parameter
    public Human() {
        this.age = 0;
        this.name = null;
    }

    // Constructor which takes two parameter
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    // method to return the Name
    public String getName () {
        return name;
    }

    // method to return the Age
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class ConstructorOverload {
    public static void main(String[] args) {
        
        Human obj = new Human();

        obj.setAge(15);
        obj.setName("Ayush");
       
        System.out.println(obj.getAge()+" "+obj.getName());
        
        Human obj1 = new Human(15,"Dev");
        System.out.println(obj1.getAge()+" "+obj1.getName());
    }
}
