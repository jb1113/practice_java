public class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(30);
        hitPoint = MAX_HP;
    }

    void repair(Repairable repairable) {
        if (repairable instanceof Unit) {
            Unit unit = (Unit) repairable;

            while(unit.hitPoint != unit.MAX_HP) {
                unit.hitPoint++;
            }
        }
    }
}
