interface A {
    void show();
    void config();
}

interface B{
    void run();
}

interface X extends B{

}

class C implements A,B {
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running");
    }
}

public class InterfaceInherit {
    public static void main(String[] args) {
        
        A obj = new C();
        obj.config();
        X obj1 = new C();
        obj1.run();
        obj.show();
    }
}
