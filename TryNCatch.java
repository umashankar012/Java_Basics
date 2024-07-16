public class TryNCatch {
    public static void main(String[] args) {
        

        // int i = 0;
        int i  = 2;
        int j  = 18;
        String str = null;
        int []arr  =  new int[5];
         //trying to divide the number by i 
        try {
            j = j / i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }

        //if i =  0 then show this: 
        catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        }
        
        //if index goes out of bound
       /* catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in limit");
        }*/ 
        
        //any other exception arise
        catch(Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

        System.out.println("bye");

    }
}
