package lotteryl;

import java.util.HashSet;
import java.util.Iterator;

public class lotttery { //45����
	public static void main(String[] args) {		
		HashSet<Integer> lottery = new HashSet<Integer>(6);
		//System.out.println(lottery.size()); //0
		
		//1. for������
//		for (int i = 0;lot1.size()<=5; i++) {		
//			int a = (int) (Math.random()*100);
//			//System.out.println(a);
//			if (a<= 45) {
//				lottery.add(a); //�� �߰�
//			} //end of if
//		} //end of for
	
		// 2. while������
		int i=1; // �ʱⰪ ����
		while (lottery.size()<=5) { // ���ǽ� 
			int a = (int) (Math.random()*100);
			//System.out.println(a);
			if (a<= 45) {
				lottery.add(a); //�� �߰�
			} //end of if
			i++; // ������
		} //end of while
	
		System.out.println(lottery); //��ü��� [1,2,3]
		Iterator iter = lottery.iterator();	// Iterator ���
		
		while(iter.hasNext()) {//���� ������ true ������ false
		    System.out.println(iter.next());
		}
		System.out.println("lotteryũ�� : " + lottery.size());
	}

}
