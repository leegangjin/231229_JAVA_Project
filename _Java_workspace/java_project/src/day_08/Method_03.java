package day_08;

import java.util.Scanner;

public class Method_03 {

	public static void main(String[] args) {
         /*
          * 
          */
		ab(2);
			
		
		
	}
	
	//정수(2~9 중 하나)에 해당하는 구구단이 출력 메서드
	//매개변수 : 2
	//출력 : 리턴이 없음
	public static void ab(int num) {
		for(int i =1; i <=9; i++  ) {
		
				System.out.println(num+"*"+i+"=" + (num*i));
			}
			
		
		    
			
	}
    
}
