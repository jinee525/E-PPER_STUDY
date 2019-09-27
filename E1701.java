import java.util.*;

public class E1701 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		int ans =1;
		for(int i=1; i<Math.min(a, b);i++) {
			if(a!=0 &&b!=0 ) {
				if(a%i==0 && b%i==0) {
					if(ans<i) {
						ans=i;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
