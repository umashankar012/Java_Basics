/*In java Thread class is implementing the Runnable Interface through which the run method can executes so we can use "implements Runnable
 instead of extends Thread ".
 */


// class A implements Runnable{
//     public void run(){
//         for(int i=0; i<= 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0; i<=5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class RunnableThread {
    public static void main(String[] args) {
        Runnable obj1 = ()-> {
            
                for(int i=0; i<=5; i++) {
                    System.out.println("hi");
                }
                try {
                    Thread.sleep(10);
                } 
                 catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
            
        };

        Runnable obj2 = ()-> {
            
            for(int i=0; i<=5; i++) {
                System.out.println("hello");
            }
            try {
                Thread.sleep(10);
            } 
             catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        
    };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        t2.start();
    }
}
