import java.util.Scanner;
public class S_26_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int x1,x2,y1,y2,cx,cy,r;
		int num, ts;//test number
		for(int i=0; i<T; i++) {
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			ts = scan.nextInt();
			num=0;
			
			for(int j=0; j<ts; j++) {
				cx = scan.nextInt();
				cy = scan.nextInt();
				r = scan.nextInt();
				if(Math.pow(x1-cx,2) + Math.pow(y1-cy,2)<Math.pow(r,2) && Math.pow(x2-cx,2)+Math.pow(y2-cy,2)<Math.pow(r,2))
					continue;
				else if(Math.pow(x1-cx,2) + Math.pow(y1-cy,2)<Math.pow(r,2) || Math.pow(x2-cx,2)+Math.pow(y2-cy,2)<Math.pow(r,2))
						num++;
		}
			System.out.println(num);
		}
		
	}
}


