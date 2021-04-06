public class Circle implements Cloneable {
    // TODO: 인스턴스 변수가 참조형일 때는 인스턴스 변수의 값을 복사하는 것 만으로는 부족함
    // TODO: 주소값을 복사하는 경우에는 같은 인스턴스를 참조함 (얕은 복사)
    Point p;
    double r;

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    @Override
    public String toString() {
        return p.toString() + ", r=" + r;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) { }
        // TODO: 얕은 복사가 아닌 깊은 복사를 하기 위해서는 참조형 타입의 객체를 생성하는 코드를 추가해 주어야 한다
        // TODO: 새로운 인스턴스를 생성하여 참조하도록 해주어야 한다 (깊은 복사)
        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y);

        return obj;
    }
}
