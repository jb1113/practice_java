public class Buyer {
    int money = 1000;
    int point = 0;

    void buy (Product p) {
        this.money -= p.price;
        this.point += p.point;
    }
}
