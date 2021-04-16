public class ExceptionReThrowing {

    public static void main(String[] args) {

        try {
            subMethod();
        } catch (Exception e) {
            System.out.println("main method에서 예외가 처리 됨");
        }
    }

    static void subMethod() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("sub method에서 예외가 처리 됨");
            throw e;
        }
    }
}
