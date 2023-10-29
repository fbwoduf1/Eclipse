import java.util.*;
public class O_2_1 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String arr[]= new String[num];

		for(int i=0; i<num; i++) {
			arr[i] = scan.next();
			int cnt=0;
			int sum=0;
			
			for(int k=0; k<arr[i].length(); k++) {
				if(arr[i].charAt(k)== 'O'){
					cnt++;
					}
				else {
					cnt=0;
					}
				sum += cnt;
				}
					
		System.out.println(sum);
		
	}
	}
}