import java.util.*;


public class E1808 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] game = new int[][] {{25,24,23,22,21},{10,11,12,13,20},{9,8,7,14,19},{2,3,6,15,18},{1,4,5,16,17}};
		
		int input= scanner.nextInt();
		int[] nums=new int[input]; //빈 int array 생성
		for(int i=0; i<input ; i++) {
			nums[i]=scanner.nextInt();
		}
		
		int[] me=new int[] {4,0}; //시작위치
		int[][] move=new int[input][2];
		
		for(int k=0;k<input;k++) {
			for(int i=0; i<5; i++) {
				for(int j=0;j<5;j++) {
					if(game[i][j]==nums[k]) {
						move[k][0]= Math.abs(j-me[1])+1;
						move[k][1]= Math.abs(i-me[0])+1;
					}
				}
			}
			System.out.println(move[k][0]+" "+move[k][1]);
		}

	}

}
