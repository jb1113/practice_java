import java.io.File;

public class ExceptionCreateFileMethod {

    public static void main(String[] args) {

        File file = createFile(args[0]);
        System.out.println(file.getName() + " 파일이 성공적으로 생성되었습니다");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) { }
    }
}
