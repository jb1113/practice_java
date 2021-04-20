public class PolymorphismMain {

    public static void main(String[] args) {

        Car car = null;
        FireEngine fireEngine1 = new FireEngine();

        // Parent <= Child (Up-Casting)
        car = fireEngine1;
        car.drive();
        car.stop();

        // Child <= Parent (Down-Casting)
        FireEngine fireEngine2 = (FireEngine) new Car();
        fireEngine2.water(); // ClassCastException occurrence

        FireEngine fireEngine3 = new FireEngine();
        Ambulance ambulance1 = new Ambulance();

        // TODO: 서로 Car class를 상속받지만 둘 사이에는 아무 관계가 없으므로 형변환 불가
//        fireEngine3 = (FireEngine) ambulance1;
//        ambulance1 = (Ambulance) fireEngine13;

    }
}
