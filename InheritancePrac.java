class Calc{

    public int add(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }
    
    
}

class AdvCalc extends Calc{
    public int mul(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        return a/b;
    }
    
}

class VeryAdvCalc extends AdvCalc{
    public int power(int a, int b){
        return (int)Math.pow(a, b);
    }
}
public class InheritancePrac {
   public static void main(String[] args) {
    

    Calc obj = new Calc();
    int r1 = obj.add(4,5);
    int r2 = obj.sub(45,8);
    System.out.println("Calc");
    System.out.println(r1 + " " + r2);

    AdvCalc obj1 = new AdvCalc();
    int r3 = obj1.add(4,8);
    int r4 = obj1.sub(45,8);
    System.out.println("Advance Calc");
    System.out.println(r3 + " " + r4);


    VeryAdvCalc obj2 = new VeryAdvCalc();
    int r5 = obj2.add(4,5);
    int r6 = obj2.mul(4, 5);
    int r7 = obj2.power(2, 4);

    System.out.println("VeryAdvCalc");
    System.out.println(r5+ " "+ r6+ " "+" "+r7);
   } 
}
