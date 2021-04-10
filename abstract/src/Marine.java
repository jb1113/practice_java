public class Marine extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Marine move to x: " + x + ", " + "y: " + y);
    }

    void stimPack() { }
}
