import java.util.Scanner;
public class S_25_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1,y1,r1,x2,y2,r2;
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			r1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			r2 = scan.nextInt();
			
			if(x1>=-10000 && x1<=10000 && y1>=-10000 && y1<=10000 && x2>=-10000 && x2<=10000 && y2>=-10000 && y2<=10000 && r1 >=1 && r1<=10000 && r2 >=1 && r2<=10000) {
				
				int d = (int) (Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
				
			    if (x1 == x2 && y1 == y2 && r1 == r2)
					System.out.println("-1");
			    else {
			    if(d > Math.pow(r1 + r2, 2))
					System.out.println("0");
				else if(d == Math.pow(r1 + r2, 2))
					System.out.println("1");
				else if(d < Math.pow(r1 + r2, 2) && d > Math.pow(r1 - r2, 2))
					System.out.println("2");
				else if(d == Math.pow(r1 - r2, 2))
					System.out.println("1");
				else if (d < Math.pow(r1 - r2, 2))
					System.out.println("0");
			    }
				
				
		
	}

}
}
	}
