import java.util.*;

public class E1803 {

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] tmp = input.toCharArray(); //string->char[]
		String ans=""; //ºó string 
		ans=ans+tmp[0];
		for(int i = 1; i<input.length();i++) {
			if (tmp[i]=='-') {
				ans=ans+tmp[i+1];
			}
		}
		
		System.out.println(ans);
	}

}
