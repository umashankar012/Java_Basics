class Mobile {
    String brand;
    String name;
    int price;
    
}

public class StaticExample {
    public static void main(String[] args) {
    Mobile obj1 = new Mobile();
    obj1.brand = "Samsung";
    obj1.price = 1500;
    obj1.name = "SmartPhone";

    System.out.println(obj1.brand + " " + obj1.price +" " + obj1.name);

    Mobile obj2 = new Mobile();
    obj2.brand = "Apple";
    obj2.price = 1200;
    obj2.name = "SmartPhone";
    
    System.out.println(obj2.brand + " " + obj2.price +" " + obj2.name);

    
    }
}
