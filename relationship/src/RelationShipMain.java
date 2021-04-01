public class RelationShipMain {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(new Point(150, 150), 50);

        Point[] p = {
                    new Point(100, 100),
                    new Point(150, 50),
                    new Point(50, 150)
                    };

        Triangle triangle1 = new Triangle(p);
        Triangle triangle2 = new Triangle(new Point(100, 100), new Point(200, 200), new Point(300, 300));

        System.out.println(circle1.color);
        System.out.println(triangle1.color);

        circle1.draw();
        triangle1.draw();
    }
}
