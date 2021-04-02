class Data {
    int x;
}

public class CallByValue {

    public static void main(String[] args) {

        Data data = new Data();
        data.x = 10;
        System.out.println("main x: " + data.x);

        change(data.x);
        System.out.println("after change method");
        System.out.println("main x: " + data.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change x: " + x);
    }
}
