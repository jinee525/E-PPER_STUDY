import java.util.*;

public class E1605 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int date;
		int num;
		int car; //�ʱ�ȭ
		int ans=0;
		
		date=scanner.nextInt();
		num=scanner.nextInt();
		date=date%10; //�����ڸ� ����
		
		for(int i=0;i<num;i++) { //�Է���ùٷ� ���
			car=scanner.nextInt();
			if(car%10 == date) ans++;
		}
		System.out.println(ans);
		
	}

}
