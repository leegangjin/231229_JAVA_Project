package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력 받아 (Scanner) map에 저장후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때까지 반복(1=계속, 0=종료)
		 * 과목과 점수를 입력해주세요>
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력
		 * 종료후 합계 평균 찍겠다
		 * 
		 */
		Scanner scan =new Scanner(System.in);
		
		HashMap<String, Integer> map =new HashMap<>();
		
		int sum=0;
		int avg =0;
		int cnt =0;
		int menu=0;
	do { 
		System.out.println("1: 계속 | 2 : 종료");
	    menu=scan.nextInt();
		System.out.println("과목과 점수를 입력해주세여.");
		switch(menu) {
		case 1 : 
		
			String a =scan.next();
			int b= scan.nextInt();
			map.put(a, b);
			sum=sum+map.get(a);
			cnt++;
			
				
			
			
		case 0 :
			System.out.println("종료");
			default :
		}
				
	}while(menu==1);
		
			
	
	System.out.println(map);
	System.out.println("합계: "+sum);
	System.out.println("평균:"+sum /(double)cnt);
	
			
		
		
		scan.close();

	}

}
