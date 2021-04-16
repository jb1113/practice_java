import java.io.IOException;

public class ExceptionThrowsMethod {
    /**
     *  TODO: 예외를 처리하는 또 다른 방법
     *  TODO: 1. try-catch
     *  TODO: 2. method에 예외 선언하기
     *  TODO: method의 선언부에 throws 키워드를 사용하고 예외를 적어준다
     *  TODO: (예외를 발생시키는 throw 와 혼동하기 쉬움)
     *  TODO: method의 예외를 선언하는 방법은 예외를 처리하는것이 아니라 호출한 method로 전달해주는 것
     */

    public static void main(String[] args) throws Exception {

        // 같은 클래스 내의 static 멤버 이므로 객체 생성 없이 직접 호출 가능
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
