import java.util.*;

public class E1702 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		char[] tmp=input.toCharArray();
		
		int sub=0;
		int ans=0;
		
		for(int i=0;i<tmp.length;i++) {
			if(tmp[i]=='O') {
				if(sub==0) {
					sub=1;
				}
				else {
					sub++;
				}
			}
			else {
				sub=0;
			}
			ans+=sub; //그때그떄 더해주기
		}
		
		System.out.println(ans);
		
	}

}
