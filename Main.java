import java.util.*;

class Calculator{
  
    public int add(int num1, int num2) {
      
      int r = num1 + num2;
      return r;
    }
  
}

public class Main {
    public static void main(String[] args) {    
      
      int num1 = 2;
      int num2 = 3;
      
      Calculator calc = new Calculator();
      
      int result = calc.add(num1, num2);
      
      // Print the result
      System.out.println(result);
      
      
      
      
      
  }
  
}