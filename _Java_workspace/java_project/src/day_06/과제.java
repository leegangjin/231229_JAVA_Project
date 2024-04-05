package day_06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 받은 숫자를 거꾸로 출력. 각자리의 합계 출력
		 *  ex) 11456 => 출력 65411 => 6+5+4+1+1 => 결과값 출력
		 *  ex) 19874 => 출력 47891 => 4+7+8+9+1 => 결과값 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int arr1[] = new int[5];
		int sum = 0;
		
		for(int i =0; i < arr1.length; i++) {
		 arr1[i] = scan.nextInt();
		 sum = sum + arr1[i];
		 
//		 System.out.print(arr1[i]+" ");
			
		}
		for(int i =arr1.length-1; i >= 0; i--) {
			System.out.print(arr1[i]+" ");
		}	System.out.println();
		System.out.println("-------------");
		System.out.println("합계 :"+sum);
		scan.close();

	}

}
