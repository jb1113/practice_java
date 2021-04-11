public class ExceptionFlow {

    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            // TODO: 예외가 발생하여 예외가 발생한 부분부터 try 블럭의 끝까지 실행되지 않는다
            // TODO: 첫번째 catch 블럭부터 차례대로 찾아 내려간다
            // TODO: 예외를 처리할 catch 블럭을 찾을 때 instanceof 연산자를 사용한
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
                System.out.println("ArithmeticException");
            }
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println(5);
        } catch (Exception e) {
            // TODO: ArithmeticException을 제외한 모든 예외가 처리된다
            System.out.println("Exception");
            System.out.println(6);
        }
        // TODO: 일치하는 catch 블럭이 없으면 예외는 처리되지 않는다
        System.out.println(7);
    }
}
