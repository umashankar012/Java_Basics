/*
 * In java every constructor has a super method which is be default present in it and 
 * this super method will used to call the constructor of a super class which is non parametrized 
 * if we want to call parametrized then we will have to explicitly done this thing.
 * In java, every class extends the Object class.
 * 
 */

class A{
    
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }

}

class B extends A{
    public B() {
        super();
        System.out.println("In B");
    } 

    public B(int n) {
       // super(n); //explicitly calling the parametrized constructor of A class
       this();
        System.out.println("in B int");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
