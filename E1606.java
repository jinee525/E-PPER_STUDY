import java.util.*;

public class E1606 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		
		int ans=1; //���� �� ���� ����
		int i=0;
		while(true) {
			if(n%2==0) {//¦��
				n=n/2;
			}
			else {//Ȧ��
				n=n*3+1;
			}
			ans++;
			if(n==1) break; //Ż��
		}
		System.out.println(ans);
	
	}

}
