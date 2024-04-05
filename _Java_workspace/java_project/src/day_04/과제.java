package day_04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위를 랜덤으로 생성(1~6까지 생성)
		 * 주사위 : 3
		 * 3칸전진 => 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 20칸 남았습니다.
		 * ...
		 * 도착~! 총 이동횟수 : 10번 => 주사위를 던진 횟수
		 */
		Scanner scan = new Scanner(System.in);
		
		int count =0; //주사위를 굴린횟수
		int total =0; //주사위 합계

		while(total<=30){
			
			int dice= (int)(Math.random()*6)+1;
			System.out.println("주사위 게임~ 주사위를 던져주세요!");
			System.out.println("주사위 던지기 : " + "1을 누르세요");
			int a =1;
			 a =scan.nextInt();
			 
			 
			total=total+dice; 
			count++;
		if(total<=30) {
			System.out.println("주사위 : " + dice + "만큼 전진 " + "남은 거리" +(30-total));
		}else if(total<=30 ) {
			System.out.println("주사위 : " + dice + "만큼 전진 " + "남은 거리" +(30-total));
			
		
		}else if(total>30) {
			System.out.println("게임 종료!");
			break;
		}System.out.println("주사위를 총 굴린 횟수  "+count);
			
		}
	
		
			
		
		
		
		
		
		
		
	
			
			
			
			
			
		 
		 
		
		
		
		
	    
		
		scan.close();
		

	}

}
