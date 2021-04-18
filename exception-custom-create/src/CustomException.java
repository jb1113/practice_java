public class CustomException extends Exception {

    CustomException() { }

    // TODO: 문자열을 매개변수로 받는 생성자
    CustomException(String msg) {
        super(msg);
    }
    /**
     * TODO: 조상인 Exception class의 생성자 호출
     * TODO: Exception의 조상인 Throwable의 생성자
     * TODO: public Throwable(String message) {
     *         fillInStackTrace();
     *         detailMessage = message;
     *       }
     * TODO: 를 호출한다 (멤버변수 detailMessage를 초기화)
     */
}
