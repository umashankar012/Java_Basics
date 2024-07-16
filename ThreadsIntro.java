//To achieve thread concept we have to extend our classes with "Thread Class" and make our methods in the class as run and objects call these method
//with the start keyword 


class A extends Thread{
    public void run() {
        for(int i=0; i<100; i++) {

            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i=0 ;i<100; i++) {
            System.out.println("hello");
        }
    }
}

public class ThreadsIntro {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }   
}
