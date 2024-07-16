// Priority ranges from - >1 to 10
//1 -> least priority
//10 -> highest priority
// default priority is 5 which is normal for every object

class A extends Thread{
    public void run(){
        for(int i=0; i<=100; i++) {
            System.out.println("hi");
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}

class B extends Thread{
    public void run() {
       for(int i=0; i<=100; i++) {
        System.out.println("hello");
        try{
            Thread.sleep(10);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
       }
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // getting the priority of obj1
        //System.out.println(obj1.getPriority());


        //setting of priority
        // obj2.setPriority(Thread.MAX_PRIORITY);



        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();
    }
}
