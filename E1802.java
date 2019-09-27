import java.util.*;

public class E1802 {

	public static void main(String[] args) {
		final int room=15;
		int num;
		int rnum;
		int pnum;
		
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		if (num%room == 0) {
			rnum=num/room;
		}
		else {rnum=num/room + 1;} //방 번호
		
		pnum=num%room; //내부 번호
		if(pnum == 0) {
			pnum=room;
		}
		
		System.out.println(rnum+" "+pnum);
	}

}
