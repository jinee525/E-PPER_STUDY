import java.util.*;

public class E1703 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String str=scanner.nextLine();
		char[] tmp=str.toCharArray();
		String ans="no";
		for(int i=0; i<tmp.length/2 ; i++) {
			if(tmp[i]==tmp[tmp.length-1-i]) {
				ans="yes";
			}
			else {
				ans="no";
			}
		}
		System.out.println(ans);
	}

}
