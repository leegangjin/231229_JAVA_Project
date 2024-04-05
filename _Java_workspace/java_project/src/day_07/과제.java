package day_07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * ---ㅡmenu---
		 * 1.덧셈|2.뺄셈 |3.곱셈|4.나눗셈|5.나머지|6.종료
		 * >>메뉴선택 1
		 * >>숫자 1 5
		 * >>숫자2 10
		 * 결과 : 5 +10 =15
		 * (더하기) 메소드를 호출하여 연산결과를 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
		System.out.println(" ---ㅡmenu---");
		System.out.println("1.덧셈|2.뺄셈 |3.곱셈|4.나눗셈|5.나머지|6.종료");
		System.out.println(" >>메뉴선택 >>>");
		System.out.println("연산자를 선택해주세요.");
		menu = scan.nextInt();
		int a= 0; int b = 0;
		if(menu <= 5) {
		System.out.println("첫번째 숫자를 입력해주세요.");
		 a =scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		 b =scan.nextInt();
		}
		switch(menu) {
		case 1 :
			System.out.println(a+"+"+b+"= "+sum(a,b ));
		break;
		case 2 :
			System.out.println(a+"-"+b+"= "+sub(a, b));
			break;
		case 3 :
			System.out.println(a+"*"+b+"="+mul(a, b));
			break;
		case 4 :
			System.out.println(a+"/"+b+"="+div(a, b));
			break;
		case 5 : 
			System.out.println(a+"%"+b+"="+mod(a, b));
			break;
		case 6 : 
			System.out.println("프로그램 종료");
			 break;
			default : System.out.println("잘못 입력하셨습니다.");
		}
		}while(menu !=6);
		scan.close();

	}
//메서드 입력자리
	    //매서드 선언 위치
		
		//두 정수의 합을 알려주는 메서드 sum	
		public static int sum(int num1, int num2) {
			return  num1 + num2;
		}
		//두 정수의 차을 알려주는 메서드 sub	
		public static int sub(int num1, int num2) {
			if( num1 > num2) {
			return num1 - num2;
			}
			return num2 - num1;
		}
		//두 정수의 곱을 알려주는 메서드 mul	
		public static int mul(int num1, int num2) {
			return num1 * num2;
		}
		//두 정수의 나눗셈(몫)을 알려주는 메서드 div	
		public static double div(int num1, int num2) {
		
				return (double)num1 / (double)num2;
			}
		
		//두 정수의 나머지를 알려주는 메서드 mod
		public static int mod(int num1, int num2) {
			return num1 % num2;
		}	
}
