public class Marine implements Unit {
    @Override
    public void move(int x, int y) {
        System.out.println("Marine move to x: " + x + ", " + "y: " + y);
    }

    @Override
    public void stop() {
        System.out.println("Marine stop");
    }

    public void stimPack() {
        System.out.println("stim pack");
    }
}
