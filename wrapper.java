public class wrapper {
    public static void main(String[] args) {
        int num = 8;
        // Integer num1 = new Integer(8);   Boxing
        Integer num1 = num; //auto-boxing -> it automatically stores the primitive value in reference variable 

        // Integer num1 = new Integer(num) =-> boxing
        
        System.out.println(num1);

        int num2 = num1; //auto-unboxing  -> it automatically stores the reference value in a integer variable
        // int num2 = num1.intValue();  //unboxing
        
        System.out.println(num2);


        //example :::___:::::

        String str = "13";

        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);


        


        
    }
}
