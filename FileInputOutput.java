import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInputOutput {

	public static void main(String[] args) throws Exception {
		// InputStream in = System.in;
		// InputStreamReader reader = new InputStreamReader(in);
		// BufferedReader br = new BufferedReader(reader);
		// String input = br.readLine();

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// FileOutputStream output = new FileOutputStream("/Users/a201903165/Java/beginning_java/input_output.txt");
		// output.write(input.getBytes());
		// output.close();
		
		// FileWriter fw = new FileWriter("/Users/a201903165/Java/beginning_java/input_output.txt");
		// fw.write(input);
		// fw.close();

		PrintWriter pw = new PrintWriter("/Users/a201903165/Java/beginning_java/input_output.txt");
		pw.println(input);
		pw.close();
	}
}
