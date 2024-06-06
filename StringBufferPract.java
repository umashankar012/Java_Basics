// class Test {
//     private int count;

//     public Test(int init) {
//         this.count = init;
//         this();
//     }

//     public Test() {
//         this.count += 1;
//     }

// }

// Test test1 = new Test(1);

public class StringBufferPract {

    public static void main(String[] args) {
            
        StringBuffer str = new StringBuffer("Rahul");
        str.append("Reddu");
        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.deleteCharAt(2));
        str.insert(0, "JAva ");
        System.out.println(str);





    }

}