public class Dropship extends Unit {
    @Override
    void move(int x, int y) {
        System.out.println("Dropship move to x: " + x + ", " + "y: " + y);
    }

    void load() { }
    void unload() { }
}
