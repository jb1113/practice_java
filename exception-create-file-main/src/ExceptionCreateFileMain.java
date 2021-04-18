import java.io.File;

public class ExceptionCreateFileMain {

    public static void main(String[] args) {
        // TODO: exception을 method가 아닌 main에서 처리
        try {
            File file = createFile(args[0]);
            // TODO: createFile method에서 exception이 발생할 경우 이 아래 코드는 실행되지 않고 catch 블럭으로 이동함
            System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다");
        }
        // TODO: "" 빈 문자열을 매개변수로 넘겨줄 경우 exception이 발생하므로 이 아래 코드들은 수행되지 않음
        File file = new File(fileName);     // File class 객체 생성
        file.createNewFile();               // File 객체의 createNewFile method를 이용해서 실제 파일 생성
        return file;                        // 생성된 객체의 참조를 반환
    }
}
