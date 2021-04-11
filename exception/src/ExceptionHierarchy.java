public class ExceptionHierarchy {
    /* TODO: Exception class 계층 구조
     * TODO:                           Object
     * TODO:                             |
     * TODO:                ---------Throwable----------
     * TODO:                |                          |
     * TODO:       ----Exception----               ----Error----
     * TODO:       |       |       |               |           |
     * TODO: IOException  ...  RuntimeException   ...   OutOfMemoryError
     *
     * TODO: 예외처리 *** 필수 ***
     * TODO: 사용자 실수와 같은 외적인 요인에 의해 발생하는 예외
     * TODO: (CheckedException)
     * TODO: Exception        : IOException, ClassNotFoundException, ...
     *
     * TODO: 에외처리 *** 선택 ***
     * TODO: 프로그래머 실수로 발생하는 예외
     * TODO: (UnCheckedException)
     * TODO: RuntimeException : NullPointerException, IndexOutOfBoundsException, ClassCastException, ArithmeticException, ...
     */

    public static void main(String[] args) {

//        예외처리 필수
//        컴파일 에러 발생
//        throw new Exception();

//        예외처리 선택
//        컴파일 에러 발생하지 않음
        throw new RuntimeException();
    }
}
