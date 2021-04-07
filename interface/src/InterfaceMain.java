public class InterfaceMain {

    public static void main(String[] args) {

        // TODO: interface polymorphism
        Unit unit = new Marine();
        Marine marine = new Marine();

        unit.move(100, 200);
        unit.stop();

        marine.move(100, 200);
        marine.stop();
        marine.stimPack();
    }
}
