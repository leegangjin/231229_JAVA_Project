package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성
		 * 출력 for / 향상된 for  / iterator 출력
		 * 
		 * 새롭게 리스트
		 * import 단축키 cltl +shift+o
		 */
		ArrayList<String>list =new ArrayList<String>();
		/* 
		 * 
		 */
		list.add("아침먹구 땡");
		list.add("점심먹고 땡");
		list.add("저녁먹고 땡");
		list.add("잠자기~~");
		
		System.out.println(list);
		
		for(int i=0; i< list.size(); i++) {
			System.out.print(list.get(i)+" / ");
		}
		System.out.println();
		System.out.println("--향상된 for문---");
		for(int i=0; i < list.size(); i++) {
			
		}
		for(String a : list) {
			System.out.print(a+" / ");
		}
		System.out.println();
		System.out.println("-----Iterator--");
		Iterator<String> it =list.iterator();
		while(it.hasNext()) { //hasNext() 다음 요소가 있는지 체크 true /false
			String tmp = it.next(); //next() 다음요소 가져오기
			System.out.print(tmp+" / ");
			
		}
		System.out.println();
		//정렬
		Collections.sort(list);
		System.out.println(list);
		
		list.sort((Comparator<? super String>) new Comparator<String>() {
			@override
			public int compare(String o1, String o2) {
				//숫자는 (크다 /작다를 이용) -/+의 값이 ㅊ력
				//문자는 cmpareTo 메서드를 활용하여 정렬
				//o1.compareTo(o2) : 오름차순
				return o2.compareTo(o1); //내림차순
			}
		});
		System.out.println(list);
		

	}

}
