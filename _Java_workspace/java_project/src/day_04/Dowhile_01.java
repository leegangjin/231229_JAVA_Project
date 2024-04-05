package day_04;

import java.util.Scanner;

public class Dowhile_01 {

	public static void main(String[] args) {
		/* do{
		 * 실행문;
		 * }while(조건식);a
		 * 
		 * -실행문을 먼저 실행하고 조건식을 비교하여 반복을 결정하는 구조
		 * -for , while문은 조건식이 false면 한번도 실행되지않는 구조
		 * -do~while 문은 무조건 실행문을 1번 거치고 난 후 비교하는 구조.
		 */
		Scanner scan =new Scanner(System.in);
		char ch = 'a';
		
		do {
			System.out.println("한글자 입력 >");
			ch= scan.next().charAt(0);
			System.out.println(ch);
			
		}while(ch != 'y');
		System.out.println("종료");
		
		
	
	
		scan.close();
				
				
		
		
		
		
	}

	}


