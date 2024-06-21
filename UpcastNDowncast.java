class A{

    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class UpcastNDowncast {
    public static void main(String[] args) {
        
        // Upcasting in Java in a Class
        A obj = new B();
        obj.show1();

        // Downcasting 
        B obj1 =(B) obj;
        obj1.show2();
    }
}
