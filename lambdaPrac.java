// lambdaExpressions

@FunctionalInterface
interface A {
    // public void show(int i); 

     int add(int i, int j);
} 

// class B implements  A {
//     public void show() {
//         System.out.println("in show");
//     }
// }
public class lambdaPrac {
    public static void main(String[] args) {
        
        // A obj = new A() {
        //     public void show() {
        //         System.out.println("in new show");
        //     }
        // };
                
        
        //lambda expression
        // A obj = (i) -> System.out.println("new " + i);

        // obj.show(5);


        A obj = (i,j) -> i + j;

        int result  = obj.add(4, 5);
        System.out.println(result);
    }
}
