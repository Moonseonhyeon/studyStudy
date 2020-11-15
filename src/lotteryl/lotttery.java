package lotteryl;

import java.util.HashSet;
import java.util.Iterator;

public class lotttery { //45까지
	public static void main(String[] args) {		
		HashSet<Integer> lottery = new HashSet<Integer>(6);
		//System.out.println(lottery.size()); //0
		
		//1. for문으로
//		for (int i = 0;lot1.size()<=5; i++) {		
//			int a = (int) (Math.random()*100);
//			//System.out.println(a);
//			if (a<= 45) {
//				lottery.add(a); //값 추가
//			} //end of if
//		} //end of for
	
		// 2. while문으로
		int i=1; // 초기값 설정
		while (lottery.size()<=5) { // 조건식 
			int a = (int) (Math.random()*100);
			//System.out.println(a);
			if (a<= 45) {
				lottery.add(a); //값 추가
			} //end of if
			i++; // 증감식
		} //end of while
	
		System.out.println(lottery); //전체출력 [1,2,3]
		Iterator iter = lottery.iterator();	// Iterator 사용
		
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.println(iter.next());
		}
		System.out.println("lottery크기 : " + lottery.size());
	}

}
