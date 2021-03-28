import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/Users/a201903165/Java/beginning_java/out2.txt");

		for(int i=1; i<11; i++) {
			String data = i + " 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
	}
}
