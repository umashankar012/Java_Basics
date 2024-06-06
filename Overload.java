class Calculator{

    //two argument passed 
    public int add(int n1, int n2){
        return n1+n2;
    }


    //three argument passed 
public int add(int n1, int n2, int n3){
    return n1+n2+n3;
    }

public double add(double n1, int n2){
    return n1+n2;
}

}


public class Overload {
    public static void main(String[] args) {
     
        Calculator obj = new Calculator();
        double r1 = obj.add(4.23,3);
        System.out.println(r1);
        

    }
}
