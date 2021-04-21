public class PolymorphismMain {

    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        Tv tv = new Tv();
        Computer computer = new Computer();
        Audio audio = new Audio();

        System.out.println(buyer.money);
        System.out.println(buyer.point);
        buyer.buy(tv);
        System.out.println(buyer.money);
        System.out.println(buyer.point);
        buyer.buy(computer);
        System.out.println(buyer.money);
        System.out.println(buyer.point);
        buyer.buy(audio);
        System.out.println(buyer.money);
        System.out.println(buyer.point);
    }
}
