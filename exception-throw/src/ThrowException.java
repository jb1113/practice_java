public class ThrowException {

    public static void main(String[] args) {

        try {
            // TODO: 예외를 생성해서 throw를 이용하여 예외를 던짐
            Exception e = new Exception("예외 던짐");
            throw e;
//            throw new Exception("throw exception");
        } catch (Exception e) {
            // TODO: 해당하는 예외의 catch 블럭에서 던진 에외를 받아서 처리
            // TODO: catch 블럭의 선언된 참조변수 e에 던진 객체의 주소가 저장됨
            System.out.println("에러 메세지: " + e.getMessage());
            System.out.println();
            e.printStackTrace();
        }
        System.out.println("program termination");
    }
}
