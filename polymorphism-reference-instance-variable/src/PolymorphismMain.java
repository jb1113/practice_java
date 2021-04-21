public class PolymorphismMain {

    public static void main(String[] args) {

        // TODO: 멤버 변수가 중복 정의된 경우 참조변수의 타입에 따라 연결되는 멤버변수가 달라진다 (참조변수 타입에 영향을 받음)
        // TODO: 메서드가 중복 정의된 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스 타입에 정의된 메서드가 호출된다 (참조변수 타입에 영향을 받지 않음)
        Parent parent1 = new Parent();
        System.out.println("Parent x :" + parent1.x);
        parent1.method();

        Child child1 = new Child();
        System.out.println("Child x :" + child1.x);
        child1.method();

        // TODO: 부모 참조변수가 자식 인스턴스 참조
        // TODO: 참조변수의 타입의 멤버변수가 호출된다
        // TODO: 메서드의 경우 실제 인스턴스에 정의된 메서드가 호출된다
        Parent parent2 = new Child();
        System.out.println("parent2 x :" + parent2.x);
        parent2.method();
    }
}
