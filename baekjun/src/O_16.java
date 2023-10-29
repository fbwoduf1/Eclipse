import java.util.Scanner;
public class O_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			int B = scan.nextInt();
			
			if(N>0 && M >0 && B>0) {
				if(N*N + M*M == B*B) {
					System.out.print("right");
				}
				else
					System.out.print("wrong");
			}
			else if(N == 0 && M == 0 && B==0)
				break;
		}
scan.close();
}
}