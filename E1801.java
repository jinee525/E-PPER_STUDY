import java.util.*;

public class E1801 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = Integer.parseInt(scanner.nextLine()); 
		//nextLine으로 받으면 문자 타입이기때문에! int형으로 바꿔준다.
		int[] input=new int[100];
		for(int i=0;i<nums;i++) {
			input[i]=scanner.nextInt();
		}
		int i,j;
		i=scanner.nextInt();
		j=scanner.nextInt();
		
		//int 다음에 int 받는 거라서 개행문자 처리 필요 없다!
		
		int sum=0; 
		for(int k=i-1 ; k<j ; k++) {
			sum=sum+input[k];
		}
		
		System.out.println(sum);
	}
}
