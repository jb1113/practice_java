public class MethodMain {

    public static void main(String[] args) {

        System.out.println(Method.add(100, 200));

        Method method = new Method();
        method.a = 100;
        method.b = 200;

        System.out.println(method.add());

    }
}
