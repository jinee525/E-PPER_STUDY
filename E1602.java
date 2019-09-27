import java.util.*;

public class E1602 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num=new int[10];
		for(int i=0;i<10;i++) {
			num[i]=scanner.nextInt();
		}
		int max=num[0];
		int min=num[0];
		
		for(int i=1;i<10;i++) {
			if(max<num[i]) max=num[i];
			else if(min>num[i]) min=num[i];
		}
		
		System.out.printf("%d %d", max, min);
	}

}
