package day_02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 카페에 제출
'		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + => 2+3 => 5
		 * ex) 5 1 - => 5-1 => 4
		 * 연산자는 + - * / % 가능
		 * 다른종류의 연산자가 들어오면 잘못된 연산자로 출력
		 * scanner 필요 
		 * 연산자 =char(기본자료형) ==비교가능 / String (객체) ==비교불가능
		   
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개와 연산자 1개를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("내가 입력한 첫번쨰 정수 "+ a );
		int b = scan.nextInt();
		System.out.println("내가 입력한 두번쨰 정수 "+ b);
		char ch =scan.next().charAt(0);
		System.out.println("내가 입력한 연산자 "+ ch);
		
		int num2 = (a/b);
		int num3 = (a%b);
		
		if((ch=='/' || ch=='%') && num2 == 0){
			System.out.println("잘못된 입력된 값입니다.");
		}
		if((ch=='/' || ch=='%') &&num3 ==0) {
			System.out.println("잘못입력된 값입니다.");
		}
		// / , % 일경우 b가 0이되면 안내문자 띄우기
		//switch
		switch(ch) {
		case '+' :
			System.out.println(a+b);
			break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
			break;
		case '/' :
			System.out.println(a / b);
			break;
		case '%' :
			System.out.println(a % b);
			break;
			default : System.out.println("잘못된 연산자 입니다.");
			
			
			//if문
			if(ch=='+') {
				System.out.println(a+b);
			}else if (ch=='-') {
				System.out.println(a-b);
			}else if (ch=='*') {
				System.out.println(a*b);
			}else if (ch=='/') {
				System.out.println(a/b);
			}else if (ch=='%') {
				System.out.println(a%b);
			}else {
					System.out.println("잘못된 연산자 입니다.");
					
					scan.close();
				}
			
			}
			
		}
		
}	
		
		
		
	
		
		
		
		
	


