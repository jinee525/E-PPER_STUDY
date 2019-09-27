import java.util.*;

public class E1605 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int date;
		int num;
		int car; //초기화
		int ans=0;
		
		date=scanner.nextInt();
		num=scanner.nextInt();
		date=date%10; //일의자리 추출
		
		for(int i=0;i<num;i++) { //입력즉시바로 계산
			car=scanner.nextInt();
			if(car%10 == date) ans++;
		}
		System.out.println(ans);
		
	}

}
