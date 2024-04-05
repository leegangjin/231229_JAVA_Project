package day_06;

import java.util.Scanner;

public class 과제_선생님버전 {

	public static void main(String[] args) {

		//   /, % 연산자 이용
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		//System.out.println(num);
		int sum =0;
		
		//num / 10 = 몫  (int) 다시 나누는 값으로 사용
		//num % 10 = 나머지값을 저장 => 마지막 자리 (출력)
		
		while(num > 0) {
			int b = num % 10 ; //마지막 자리 추출
		System.out.print(b +" ");
		
		sum +=b;
		num= num / 10;  //정수 / 정수 => 정수 소수점 버림
		
		}
		System.out.println();
		System.out.println("합계 :" + sum);
		scan.close();
	}

}
