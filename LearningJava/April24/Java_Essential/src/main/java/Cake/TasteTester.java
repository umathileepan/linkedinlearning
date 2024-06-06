package Cake;

public class TasteTester {
    public static void main(String[] args){
        Cake cake = new Cake();
        cake.setPrice(38.99);
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price: " + cake.getPrice());

        BirthdayCake bc = new BirthdayCake();
        System.out.println("BirthdayCake Flavor: " + bc.getFlavor());
        System.out.println("BirthdayCake Price: " + bc.getPrice());

        WeddingCake wc = new WeddingCake();
        wc.setFlavor("Pina colada");
        wc.setPrice(350.00);
        System.out.println("WeddingCake Flavor: "  + wc.getFlavor());
        System.out.println("WeddingCake Price: " + wc.getPrice());
    }
}
