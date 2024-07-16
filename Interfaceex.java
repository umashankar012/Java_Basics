interface A{

    int age = 4; //Static and final
    String area = "Mumbai";

    void show(); //public and abstract
    void config();
}


class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}


public class Interfaceex {
    public static void main(String[] args) {
        
      A obj = new B();
      obj.show();
      obj.config();  

      System.out.println(A.age);
    }
}
