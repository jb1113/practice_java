import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite3 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("/Users/a201903165/Java/beginning_java/out3.txt");
		
		for(int i=1; i<11; i++) {
			String data = i + " 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
	}
}
