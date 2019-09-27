import java.util.*;
public class E1706 {
	
	public static boolean check(int[] num) {
		for(int i=0; i<num.length;i++) {
			if(num[i]!=1) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] num=new int[] {0,0,0,0,0,0,0,0,0,0}; 
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int tmpint;
		int mul=0;
		while(true) {
			if(check(num)==false) {
				mul++; 
				tmpint=input*mul; //문제 잘읽어! 기존 인풋에다가 곱하는거임, 즉 계속 더해나가는 거임
				String tmps=Integer.toString(tmpint);
				char[] tmpc=tmps.toCharArray();
				
				for(int i=0; i<tmpc.length;i++) {
					num[Character.getNumericValue(tmpc[i])]=1; //나온거 표시
				}
				continue;
			}
			else break;
		}
		
		System.out.println(mul);

	}

}
