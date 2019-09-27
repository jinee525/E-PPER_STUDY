import java.util.*; 
public class E1601 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int in=sc.nextInt();
		 float sum=0;
		 for(float i=1 ; i<=in ; i++) {
			 sum+=1/i;
		 }
		 System.out.printf("%.2f",sum);
		 
	 }
}
