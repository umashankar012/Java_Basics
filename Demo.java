class Computer {

    public void playMusic() {
        System.out.println("Playing music..");
    }

    public String getPen(int cost) {
        if(cost >= 10){
            return "Pen";
        }

        else{
            return "Nothing";
        }

    }
}

public class Demo {
    public static void main(String[] args) {
        
        Computer com = new Computer();
        com.playMusic();
        String res = com.getPen(10);
        System.out.println(res);

    }
}
