package day_03;

public class For_06 {

	public static void main(String[] args) {
		/* 배수 : 값을 일정하게 곱해서 나오는 값.
		 * 10, 15의 공배수 : 공통된 배수
		 * 10 : 10 20 30 40....
		 * 15: 15 30 45 60...
		 * 공배수 : 30 60 ....
		 * 최소 공배수 :30
		 */
		//1부터 100까지의 공배수 출력
		// (i % 2==0) && i % 15 ==0) {}
		int num1  =10;
		int num2 = 15;
 		
		for(int i =num1; i<=100; i=i+num1) {
			if( i %num1 ==0 && i %num2==0) {
				System.out.print(i +" ");
				break;
			}
		}
		
	

	}

}
