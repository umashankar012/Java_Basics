interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile and Run ");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, compile run::faster");
    }
}


class Developer {
    public void devApp(Computer com){
        com.code();
    }
}


public class InterfacePrac {
   public static void main(String[] args) {
    
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer sam = new Developer();
    sam.devApp(desk);
    sam.devApp(lap);

   } 
}
