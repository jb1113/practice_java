public class ExceptionFlow {
    /**
     *  TODO: try - catch - finally
     *  TODO: 선택적으로 사용할 수 있으며 try-catch-finally의 순서로 구성된다
     *  TODO: 예외 발생시, try -> catch -> finally 순서로 실행되고
     *  TODO: 예외 미발생시, try -> finally 순서로 실행된다
     *  TODO: try 또는 catch 블럭에서 return 문을 만나도 finally 블럭은 실행된다
     */

    public static void main(String[] args) {

        try {
            // TODO: 예외가 발생할 가능성이 있는 코드를 넣는다
        } catch (Exception e) {
            // TODO: 예외 처리를 위한 코드를 적는
        } finally {
            // TODO: 예외의 발생여부와 상관없이 항상 수행되어야 하는 문장들을 넣는다
            // TODO: finally 블럭은 try-catch 블럭의 맨 마지막에 위치해야 한다
        }
    }
}
