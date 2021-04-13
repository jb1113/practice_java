public class FinallyFlow {

    static void startInstall() {
        System.out.println("start install");
    }

    static void copyFile() {
        System.out.println("copy file");
    }

    static void deleteTempFiles() {
        System.out.println("delete temp files");
    }

    public static void main(String[] args) {

        try {
            startInstall();         // 프로그램 설치에 필요한 준비를 한다
            copyFile();             // 파일들을 복사한다
            // TODO: try 블럭과 catch 블럭에서 모두 사용해야 되는 경우 finally 블럭에 넣어주는게 바람직함
//            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제한다
        } catch (Exception e) {
            e.printStackTrace();
//            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제한다
        } finally {
            // TODO: 예외가 발생하건 발생하지 않건 실행되어야 하는 코드는 finally 블럭에 넣어준다
            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제한다
        }
    }
}
