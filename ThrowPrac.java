class MyException extends Exception{
    public MyException(String str) {
        super(str);
    }
}
public class ThrowPrac {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18 / i;
            // if(j == 0) 
            //     throw new ArithmeticException("i don't want to print ");


            //custom exception
            if(j == 0) {
                throw new MyException("I dont want this");
            }
            
        }
        catch(MyException e){
            j = 18 / 1;
            System.out.println("that is the default value" +e);
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("bye");
        
    }
}
