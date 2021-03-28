import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Stream {
	
	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);

		String input = br.readLine();
//		char[] input = new char[3];

//		in.read(input);
//		reader.read(input);

		System.out.println(input);
	}
}
