import java.util.*;

public class E1705 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int ans=0; 
		for(int i=1; i<n;i++) {
			for(int j=i; j<n; j++) {
				for(int k=j;k<n;k++) {
					if(i+j+k == n && (i+j)>k) { //������ ������ �Ἥ �������� ���!
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}
