import java.util.*;

public class E1606 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		
		int ans=1; //¹ŞÀº ¼ö ºÎÅÍ ½ÃÀÛ
		int i=0;
		while(true) {
			if(n%2==0) {//Â¦¼ö
				n=n/2;
			}
			else {//È¦¼ö
				n=n*3+1;
			}
			ans++;
			if(n==1) break; //Å»Ãâ
		}
		System.out.println(ans);
	
	}

}
