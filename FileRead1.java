import java.io.FileInputStream;
import java.io.IOException;

public class FileRead1 {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
		FileInputStream input = new FileInputStream("/Users/a201903165/Java/beginning_java/out.txt");
		input.read(b);
		
		System.out.println(new String(b));
		input.close();
	}
}
