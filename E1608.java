import java.util.*;

public class E1608 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> vote = new LinkedList();
		int frame=scanner.nextInt();
		int attend=scanner.nextInt();
		int[] stn=new int[101];
		for (int i=1;i<=100;i++) {
			stn[i]=0; //�ʱⰪ
		}
		
		int tmp;
		for(int i=0;i<attend;i++) {
			tmp=scanner.nextInt(); //�л� ��ȣ
			
			//frame full && present
			if(vote.size()==frame && vote.contains(tmp)==true) {
				stn[tmp]++;
			}
			//no && frame full  
			else if(vote.size()==frame && vote.contains(tmp)==false) {
		
				int min=Integer.MAX_VALUE; //ǥ��
				int mins=0; //min student
				for(int j=0;j<vote.size();j++) {
					if(stn[vote.get(j)]<min) {
						min=stn[vote.get(j)];
						mins=vote.get(j);
					}//���� ������ ����!->����min�� ����
				}
				 //�ּ���õ�л�ã�� min
				vote.remove(vote.indexOf(mins));   //size=0�ϋ��� outofbound
				stn[mins]=0; //�ʱ�ȭ	
				vote.add(tmp); //�־��ֱ�
				stn[tmp]++; // ��÷+1
			}
			
			//no && frame not full
			else if(vote.size()!=frame && vote.contains(tmp)==false) {
				vote.add(tmp);
				stn[tmp]++;
			}
			
		}
		
		vote.sort(null); //order 
		
		for(int i=0;i<vote.size();i++) {System.out.print(vote.get(i)+" ");}
	}
}
