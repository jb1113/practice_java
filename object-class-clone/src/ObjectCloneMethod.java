public class ObjectCloneMethod {

    public static void main(String[] args) {

        Point original = new Point(10, 20);
        Point copy = (Point) original.clone();

        System.out.println(original);
        System.out.println(copy);

        Circle circle1 = new Circle(new Point(10, 20), 2.0);
        Circle circle2 = (Circle) circle1.clone(); // 단순히 값만 복사되므로 같은 인스턴스를 참조함

        System.out.println(circle1);
        System.out.println(circle2);

        // TODO: 인스턴스 변수가 참조형일 때 값만 복사하는 경우에는 같은 인스턴스를 참조하고 있으므로 인스턴스의 값이 변경되면 동일하게 변경됨 (얕은 복사)
        circle1.p.x = 20;
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
