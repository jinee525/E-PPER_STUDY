import java.util.*;
public class E1704 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c=scanner.nextInt();
		int m=scanner.nextInt();
		int r=c-m;
		int ans=0;
		
		while(r>0){
			if(r>=500) {
				ans+=r/500;
				r=r%500;
			}
			else if(r>=100) {
				ans+=r/100;
				r=r%100;
			}
			else if(r>=50) {
				ans+=r/50;
				r=r%50;
			}
			else if(r>=10) {
				ans+=r/10;
				r=r%10;
			}
			else if(r>=5) {
				ans+=r/5;
				r=r%5;
			}
			else if(r>=1) {
				ans+=r/1;
				r=r%1;
			}
		}
		System.out.println(ans);
		
	}

}
