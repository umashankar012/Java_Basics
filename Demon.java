import tools.Calc;
import tools.AdvCalc;
import java.lang.System;
public class Demon {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int a = obj.add(1,5);
        System.out.println(a);

        AdvCalc obj1 = new AdvCalc();
        int b = obj1.mul(2,2);
        System.out.println(b);
    }
}
