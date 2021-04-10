public class Tank extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Tank move to x: " + x + ", " + "y: " + y);
    }

    void changeMode() { }
}
