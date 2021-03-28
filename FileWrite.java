// import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
//		FileOutputStream output = new FileOutputStream("/Users/a201903165/Java/beginning_java/out.txt");
//		FileWriter fw = new FileWriter("/Users/a201903165/Java/beginning_java/out.txt");
		PrintWriter pw = new PrintWriter("/Users/a201903165/Java/beginning_java/out.txt");

		for (int i=1; i<11; i++) {
			String data = i + " 번째 줄입니다.";

//			output.write(data.getBytes());
//			fw.write(data);
			pw.println(data);
		}
//		output.close();
//		fw.close();
		pw.close();

		// FileWriter fw2 = new FileWriter("/Users/a201903165/Java/beginning_java/out.txt", true);
		PrintWriter pw2 = new PrintWriter(new FileWriter("/Users/a201903165/Java/beginning_java/out.txt", true));

		for (int i=11; i<21; i++) {
//			String data = i + " 번째 줄입니다.\r\n";
			String data = i + " 번째 줄입니다.";

//			fw2.write(data);
			pw2.println(data);
		}
//		fw2.close();
		pw2.close();
	}
}
