class A {
    int a;
    
    public void show() {
        System.out.println("In A show");
    }

    class B {
        public void config() {
            System.out.println("in B config");
        }
    }
}


public class InnerClassPrac {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        
        A.B obj2 = obj.new B();
        obj2.config();
    

    }
}
