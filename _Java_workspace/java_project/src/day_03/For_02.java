package day_03;

public class For_02 {

	public static void main(String[] args) {
		/* 1~ 10까지 출력
		 * 
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
			System.out.println();
			//1부터 10까지 짝수만 출력
			
		for(int i=1; i<=10; i++) {
				
			if(i % 2==0) { 
				System.out.print(i +" ");
			}
				
		}
		System.out.println();	
		
		//1~10까지 합계를 구하기
	    int sum = 0; //지역변수는 반드시 초기화
		for(int i = 1; i<=10; i++) {
		sum  += i;
		}System.out.print("1부터 10까지의 합은" + sum+ " ");
		
		
		System.out.println();
		
		//1~10까지의 짝수합과, 홀수합을 출력
		int sum1 = 0;  int sum2 = 0;//sum1 = 짝수 
		for(int i=1; i<=10; i++) {
			
		 
			if(i % 2==0) {
				sum1 +=i; 
			}else { 
				sum2 +=i;
			}
			
		}
		System.out.print("1~10까지의 짝수의 합은"+sum1+" ");
		System.out.println("1~10까지의 홀수의 합은"+sum2+" ");
		}
		
		
		
		
		
	}


