class Data {
    int x;
}

public class CallByReference {

    public static void main(String[] args) {

        Data data = new Data();
        data.x = 10;
        System.out.println("main x: " + data.x);

        change(data);
        System.out.println("after change method");
        System.out.println("main x: " + data.x);
    }

    static void change(Data data) {
        data.x = 1000;
        System.out.println("chagne data.x: " + data.x);
    }
}
