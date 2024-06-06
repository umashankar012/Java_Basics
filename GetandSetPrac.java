// Implement getter and setter in java and this keyword


class Human {
    private int age;
    private String name;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // age = a;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class GetandSetPrac {
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("NJ");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}
