import java.util.*;

public class E1801 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = Integer.parseInt(scanner.nextLine()); 
		//nextLine���� ������ ���� Ÿ���̱⶧����! int������ �ٲ��ش�.
		int[] input=new int[100];
		for(int i=0;i<nums;i++) {
			input[i]=scanner.nextInt();
		}
		int i,j;
		i=scanner.nextInt();
		j=scanner.nextInt();
		
		//int ������ int �޴� �Ŷ� ���๮�� ó�� �ʿ� ����!
		
		int sum=0; 
		for(int k=i-1 ; k<j ; k++) {
			sum=sum+input[k];
		}
		
		System.out.println(sum);
	}
}
