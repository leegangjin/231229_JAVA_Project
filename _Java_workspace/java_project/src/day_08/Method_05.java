package day_08;

public class Method_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("소수인가요 ? :"+ sosu(11));
		
		//2부터 100까지의 소수를 출력하고, 소수의 합계를 출력
	
//		int count =0;
//		for(int i=2; i<=100; i++) {
//			count=0;
//			for(int j=1; j<=i; j++) {
//				if(i % j==0) {
//					count++;
//			}
//		}
//		if(count==2) {
//			System.out.print(i+ " ");
//					
//		}
//		
//	}
		int sum =0;
	   for(int i =2; i <=100; i++) {
		if(sosu(i)) { //true
			System.out.print(i + " ");
			sum +=i;
			
		}
	  }System.out.println();
	   System.out.println("소수의 합계 :" + sum);

}
	/* 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별 (true / false)
	 * 리턴 타입 : boolean
	 * 매개변수 : int num
	 * 메서드 명 : sosu
	 */
	public static boolean sosu(int num1) {
		int cnt=0;
		for(int i =1; i <=num1; i++ ) {
			if(num1 % i==0) {
		         cnt++;
		    }
	    }	
		if(cnt==2) { 
		return true;
		}else {
			return false;
		}
			
	
		
	}
	
//

}
