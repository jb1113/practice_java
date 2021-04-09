public class interfaceMain {

    public static void main(String[] args) {

        A a = new A();
        a.methodA(new B());

        C c = new C();
        c.methodC(new D());
        c.methodC(new E());
    }
}
