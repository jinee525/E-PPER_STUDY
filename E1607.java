import java.util.*;

public class E1607 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] input=null; //�ִ���� ������ ��������
		int l=0; //���� ��ȣ ����
		int ans=1; //true default
		String tmp=scanner.nextLine();
		input = tmp.toCharArray();  //���� array �����ϴ� ���̱⿡ null �迭���ٰ�!
		
		for(int i=0;i<input.length;i++) {
			if(input[i]=='(') {
				l++;
			}
			else {
				l--;
			}
			if(l<0) { // (�� �����ϸ�
				ans=0;
				break;
			}
		}
		
		if(l>0) { // ) �����µ��� (����������
			ans=0;
		}
		if(ans==0) System.out.println("F");
		if(ans==1) System.out.println("T");
		
	}

}
