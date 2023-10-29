import java.io.*;
import java.util.*;
public class S_25 {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	int []arr = new int[26];
	
	for(int i=0; i<arr.length; i++) {
		arr[i]=-1;
	}
	
	String S = bf.readLine();
	
	for(int i=0; i<S.length(); i++) {
		char ch = S.charAt(i);
		
		if(arr[ch - 'a'] == -1) {
			arr[ch - 'a'] = i;
		}
	}
	for(int val : arr) {
		System.out.print(val + " ");
	}
}
}
