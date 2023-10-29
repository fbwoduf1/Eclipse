import java.io.*;
import java.util.*;
public class S_26_4 {

	public static void main(String[] args) throws IOException {
		int num = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		StringTokenizer st = new StringTokenizer(sentence, " ");
		num = st.countTokens();
		System.out.println(num);
	}

}
