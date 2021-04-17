public class SingletonMain {

    public static void main(String[] args) {

//        Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
