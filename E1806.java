import java.util.*;

public class E1806 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input=input.toLowerCase(); //소문자로
		String one = input.split(" ")[0];
		String two = input.split(" ")[1];
		String ans ="No";
		int check=0;
		
		char[] tmp1 = one.toCharArray();
		char[] tmp2 = two.toCharArray();
		
		if(tmp1.length != tmp2.length) {
			ans="No";
		}
		else{
			for(int i=0; i<tmp1.length;i++ ) {
				for(int j=0; j<tmp2.length;j++) {
					if(tmp1[i]==tmp2[j]) {
						tmp2[j]=' '; 
						check++;
					}
				}
			}
			
		}
		
		if(check==tmp1.length) {
			ans="Yes";
		}
		
		System.out.println(ans);
		
	}

}
