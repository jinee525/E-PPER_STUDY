import java.util.*;
public class E1805 {

	public static void main(String[] args) {
		int[] des = new int[] {8,7,6,5,4,3,2,1};
		int[] asc = new int[] {1,2,3,4,5,6,7,8};
		int[] input = new int[8];
		String ans = "";
		Scanner scanner = new Scanner(System.in);
		for(int i =0 ; i<8 ; i++) {
			input[i]=scanner.nextInt();
		}

		for(int j=0;j<8;j++) {
			
		}
		if (input[0]== 8) {
			for(int j=1;j<8;j++) {
				if( input[j] != des[j]) {
					ans="mixed";
					break;
				};
				if(j==7) {
					ans="descending";
					break;
				}
			}
		}
		
		if(input[0]==1) {
			for(int j=1;j<8;j++) {
				if( input[j] != asc[j]) {
					ans="mixed";
					break;
				};
				if(j==7) {
					ans="ascending";
					break;
				}
			}
		}
	
		System.out.println(ans);
	}

}
