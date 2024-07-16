enum Laptop {
    Macbook(2000), XPS(2200), ThinkPad(3322), Surface(1230);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    


}
public class enumPracTwo {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap);

        // System.out.println((lap.getPrice()));

        // lap.setPrice(3444);
        // System.out.println(lap.getPrice());


        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : "+ lap.getPrice());

        }
    }
}
