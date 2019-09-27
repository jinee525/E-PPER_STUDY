import java.util.*;

public class E1607 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] input=null; //최대길이 문제에 나와있음
		int l=0; //왼쪽 괄호 갯수
		int ans=1; //true default
		String tmp=scanner.nextLine();
		input = tmp.toCharArray();  //새로 array 생성하는 것이기에 null 배열에다가!
		
		for(int i=0;i<input.length;i++) {
			if(input[i]=='(') {
				l++;
			}
			else {
				l--;
			}
			if(l<0) { // (이 부족하면
				ans=0;
				break;
			}
		}
		
		if(l>0) { // ) 끝났는데도 (남아있으면
			ans=0;
		}
		if(ans==0) System.out.println("F");
		if(ans==1) System.out.println("T");
		
	}

}
