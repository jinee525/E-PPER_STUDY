import java.util.*;

public class E1608 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> vote = new LinkedList();
		int frame=scanner.nextInt();
		int attend=scanner.nextInt();
		int[] stn=new int[101];
		for (int i=1;i<=100;i++) {
			stn[i]=0; //초기값
		}
		
		int tmp;
		for(int i=0;i<attend;i++) {
			tmp=scanner.nextInt(); //학생 번호
			
			//frame full && present
			if(vote.size()==frame && vote.contains(tmp)==true) {
				stn[tmp]++;
			}
			//no && frame full  
			else if(vote.size()==frame && vote.contains(tmp)==false) {
		
				int min=Integer.MAX_VALUE; //표수
				int mins=0; //min student
				for(int j=0;j<vote.size();j++) {
					if(stn[vote.get(j)]<min) {
						min=stn[vote.get(j)];
						mins=vote.get(j);
					}//가장 오래된 사진!->최초min을 유지
				}
				 //최소추천학생찾음 min
				vote.remove(vote.indexOf(mins));   //size=0일떄는 outofbound
				stn[mins]=0; //초기화	
				vote.add(tmp); //넣어주기
				stn[tmp]++; // 추첨+1
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
