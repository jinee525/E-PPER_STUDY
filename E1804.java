import java.util.*;

public class E1804 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int odd=scanner.nextInt();
		
		for(int i=0 ; i< odd/2+1 ; i++) {
			for(int j=odd/2-i ; j>=0 ; j--) {
				System.out.print(' ');
			}
			for(int j=0; j<=2*i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=odd/2-1 ; i>=0 ; i--) {
			for(int j=odd/2-i ; j>=0 ; j--) {
				System.out.print(' ');
			}
			for(int j=0; j<=2*i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
