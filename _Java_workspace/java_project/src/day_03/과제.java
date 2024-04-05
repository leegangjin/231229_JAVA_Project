package day_03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 1~50 사이의 랜덤수를 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 입력>10
		 * 입력한수보다 랜덤수가 더크면 up~!!
		 * 입력> 20 
		 * up~!
		 * 입력> 30
		 * down
		 * 입력 > 23
		 * 정답!! 종료.  while문
		 */
		//랜덤수 생성우 반복문
		
		Scanner scan = new Scanner(System.in);
	    int num1=(int)(Math.random()*50)+1;
	    System.out.println("컴퓨터가 랜덤수를 생성하였습니다.");
	    System.out.println("숫자를 하나 입력하세요~!");
		int num2 = scan.nextInt();
		int i=0;
		while(i<50){
			//System.out.println(i);
			i++; //게임횟수 증가
			if ( i>=5) {
				System.out.println("게임이 종료 되었습니다." );
				break;
			}
		    if(num1>num2) {
		    	System.out.println("upup~ " + i+"회"); 
		    	num2= scan.nextInt();
		    }
		    else if(num1<num2) {
		    		System.out.println("down~ " + i+"회");
		        num2 = scan.nextInt();
		    	}
		    
		    else if (num1==num2) {
		    			System.out.println("정답입니다.");
		    			System.out.println(i + "회");
		    			break;
		    		}
		    		
		    	}
		    	
		    	
		
			
			
			scan.close();
		
			
		
			
		
		
		
	
		
		
	}

}
