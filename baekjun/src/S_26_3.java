import java.io.*;
import java.util.*;
public class S_26_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			int num = scan.nextInt();
			String alpha = scan.next();
			
			for(int j=0; j<alpha.length(); j++) {
				for(int k=0; k<num; k++) {
					System.out.print(alpha.charAt(j));
				}
			}
			System.out.println("");
		}
	}

}
