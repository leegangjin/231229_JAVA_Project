package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello :안녕
		 * apple :사과
		 * orrange :오렌지
		 * map에 저장
		 */
		
		Scanner scan =new Scanner(System.in);
		
		HashMap<String, String> map =new HashMap<>();
		
		String a=null;
		String b=null;
		int menu=0;
		do { 
			System.out.println("-------단어장--------");
			System.out.println("1: 계속 | 2 : 종료");
		    menu=scan.nextInt();
			System.out.println("단어/뜻을 입력해주세요.");
			
			switch(menu) {
			case 1 : 
			
				a=scan.next();
				b=scan.next();
				map.put(a, b);
				
				
					
				
				
			case 2 :
				System.out.println("종료");
				default :
			}
					
		}while(menu==1);
		
		System.out.println(map);
			
		
		
		scan.close();
		
		
		

	}

}
