import java.util.*;
public class E1603 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans=1;
		
		String tmp=scanner.nextLine();
		char[] tmpc=tmp.toCharArray();
		 
		 for(int i=0;i<tmpc.length;i++) {
			 if(tmpc[i]!=tmpc[tmpc.length-1-i]) {ans=0; break;}
		 }
		 
		 if (ans==1) System.out.println("T");
		 else System.out.println("F");
		 
	}

}
