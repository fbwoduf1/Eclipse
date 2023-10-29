import java.util.Scanner;
public class O161 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a = scan.nextInt();
		int count = 0;
		for(int i=0; i<a; i++) {
			int check = 1;
			
			int b = scan.nextInt();
			if(b == 1)check = 0;
			for(int j=2; j<b; j++) {
				if(b % j == 0) {
					check = 0;
					break;
				}
			}
			if(check == 1)
				count++;
		}
		System.out.print(count);
		scan.close();
		
	}
}