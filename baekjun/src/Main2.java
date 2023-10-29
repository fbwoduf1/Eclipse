import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int ln = (a*a + b*b + c*c + d*d + e*e) % 10;
		System.out.print(ln);
	}

}
