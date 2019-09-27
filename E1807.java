import java.util.*;

public class E1807 {

	public static void main(String[] args) {
		int ans=0; //false
		int sum=0;
		int a,b=0;
		Scanner scanner = new Scanner(System.in);
		int[] num=new int[9];
		for(int i=0; i<9 ; i++) {
			num[i]=scanner.nextInt();
			sum+=num[i];
		}
		
		for(a=0; a<9 ;a++) {
			for(b=a+1;b<9;b++) {
				if(sum-num[a]-num[b]==100) {
					ans=1;
					break;
				}
			}
			if(ans==1) break;
		}
		
		for(int i=0;i<9;i++) {
			if(i==a || i==b) {
				continue;
			}
			else {
				System.out.print(num[i]+" ");
			}
		}
	}
			
}
