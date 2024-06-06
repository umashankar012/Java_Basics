/*
 * In a method overriding the same name methods are defined in two different classes with having same parameters 
 * and which class object has created in main function and it will access its method . 
 */

class Calc{ 
    
    public int add(int n1 , int n2) {
    
        return n1 + n2;
    }

}

class AdvCalc extends Calc {

    //ye wala chalega agar Adv ka object banaya hoga 
    public int add(int n1, int n2){
        return n1 +n2+ 1;
    }

}
class veryAdvCalc extends AdvCalc { 

    //ye wala chalega agar veryAdv ka object banaya hoga 
    public int add(int n1, int n2){
        return n1 +n2+ 2;
    }

}


public class MethodOverriding {
    public static void main(String[] args) {
       AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}
