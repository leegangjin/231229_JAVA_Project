package day_09;

import java.util.Scanner;



public class 과제선생님 {

	public static void main(String[] args) {
		// 
		// 야구게임
				/* 컴퓨터가 세 자리의 숫자를 생성(각 자리수는 1~9까지의 수) => 배열로 랜덤저장 (중복 불가능)
				 * 유저는 세 자리의 숫자를 맞추는 게임 => 직접 입력(중복되지 않게)
				 * 자리와 숫자가 일치하면 Strike
				 * 숫자만 맞으면 ball
				 * 아무것도 안 맞으면 out
				 * ex ) 컴퓨터 생성 번호 1 2 3
				 * 사용자 번호 : 1 7 8 => 1 Strike
				 * 사용자 번호 : 1 3 2 => 1 Strike 2 ball
				 * 사용자 번호 : 7 8 9 => out
				 * 사용자 번호 : 1 2 3 => 3Strike 정답.!
				 * 
				 * 
				 * */
		
		Scanner scan = new Scanner(System.in);
		
		int comNum [] = new int [3];
		int myNum [] = new int [3];
		
//		// 메서드는 다른 클래스에서도 불러올 수 있음.
//		//static 으로 생성했기 때문에 클래스명, 메서드명으로 호출가능
//		
//		Method07.usu(comNum);
//		Method07.sum(comNum);
//		
//		// static 이 아닌 경우 객체를 생성하여 객체명으로 메서드명 호출
//		
//		Method07 me = new Method07();
//		me.usu(myNum);
//		me.sum(myNum);
//		
		
		//컴퓨터 배열을 생성
		//중복되지 않게 랜덤수추출 저장
		for (int i = 0 ;  i < comNum.length ; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for (int j = 0 ; j < i; j++) {
				if(comNum[i] == comNum [j]) {
					i--;
					break;
				}
			}
		}
		
		// 결과 체크
//		for (int a : comNum) {
//			System.out.print(a + " ");
//		}
		System.out.println();
		
		while (true) {
			int stk = 0;
			int ball = 0;
			System.out.println("숫자 입력>>");
			String mystr = scan.next(); //숫자를 문자로 받음
			String [] myNumstr = mystr.split(""); // 한글자씩 나누어 배열에 저장
			for (int i = 0; i < myNumstr.length ; i++) {
				// 문자를 숫자로 변환하여 myNum 에 저장
				myNum[i] = Integer.parseInt(myNumstr[i]);
				
			}
			// 결과 체크
//			for (int a : myNum) {
//				System.out.print( a+ " ");
//			}
			
			// 숫자비교
			for (int i = 0; i <comNum.length ; i++) {
				for(int j = 0; j < myNum.length; j++) {
					if (comNum[i] == myNum[j] && i ==j) {
						// 값도 같고 자릿수도 같다면
						stk++;
					}else if (comNum[i] == myNum[j] && i!= j) {
						// 값만 같을 경우
						ball++;
					}
				}
			}
			// 결과 출력란
			if (stk == 0 && ball == 0) {
				System.out.println("out!");
			}else {
				System.out.println("> " + stk + "s " + ball + "b");
			}
			
			// 종료 조건
			if (stk == 3) {
				// 스트라이크가 3이면 종료
				System.out.println("성공! 게임 종료");
				break;
			}
		}
		
		
		scan.close();

	}

}