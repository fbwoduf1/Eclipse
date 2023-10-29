import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int floor = 0;
		int RoomN;
		for(int i=0; i<T; i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			if(1<=H && H<=99 && 1<=W && W <=99 && 1<=N && N<=H*W) {
				if(N % H != 0)
					floor = N % H;
				else if(N % H ==0)
					floor = 1;
				
				if(N / H == 0)
					RoomN = 1;
				else
					RoomN = N / H + 1;
				
				if(RoomN < 10)
					System.out.print(floor + "0" + RoomN);
				else {
					System.out.print(floor);
					System.out.print(RoomN);
				}
			}
			}
			
		
		
		
		}
		
	}
	


