package day_04;

import java.util.Scanner;

public class 과제_선생님버전 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = 0; //주사위 값( 랜덤수)를 저장할 변수
		int sum = 0; //거리 누적 값
		int count=0; //주사위 던진 횟수 누적
		int last = 30; //최종 목표 이동 수
		
		System.out.println("게임시작 주사위를 던져주세요. (Enter)");
		
		while(sum<30) { //거리 누적값이 최종 목적지보다 작다
			scan.nextLine(); //enter값을 받는 역할
			random = (int)(Math.random()*6)+1; //1부터 6까지 랜덤수 생성
			sum += random;
			count++;
			System.out.println("주사위:"+random);
			System.out.println(random + "칸 전진=>"+(last -sum)+"칸 남았습니다.");
		}
		System.out.println("도착!!, 총 이동 횟수" + count );
	scan.close();
	}

}
