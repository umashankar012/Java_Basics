// We cannot extends the class which is final keyword in beginning
// final class Calc {
//     public void show() {
//         System.out.println("Calculator by john");
//     }
// }

// class AdvCalc extends Calc{

// }


// We cannot override the method if it has a final keyword in it or recreate the method of the same name as present in the
// parent class.
class Calc {
    public final void show(){
        System.out.println("hello");
    }
}

// class AdvCalc extends Calc{
//     public void show() {
//         System.out.println("hello");
//     }
// }


public class finalPrac {
    public static void main(String[] args) {
        
        // We cannot change the value of a variable if the final keyword is assigned to a variable at beginning
        // final int num = 9;
        // num = 54; 


        Calc obj = new Calc();
        obj.show();
    }
}
