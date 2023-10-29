import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		int [] alpha = new int [26];
		int max =0;
		char ch ='?';

		for(int i=0; i<word.length(); i++) {
			if('A' <=word.charAt(i) && word.charAt(i) <= 'Z')
					alpha[word.charAt(i) - 'A']++;
			else
				alpha[word.charAt(i) - 'a']++;
		}
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = (char)(i+65);
			}
			else if(alpha[i] == max)
				ch = '?';
		}
		
		System.out.print(ch);
	}

}
