package day11;

public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이욯하여 작업
		 * 두 정수의 값이 주어졌을 때 
		 * 두 정수사이의 모든 정수의 합을 리턴하는 메서드
		 *  ex)a=3 , b=5 => 3+4+5
		 *  ex)a=5 , b=1 => 1+2+3+4+5
		 *  ex)a=3 , b=3 => 3
		 */
		과제 ab10 = new 과제();
		System.out.println("a 와 b 사이 정수들의 합은 :");
		System.out.println(ab10.sum(3, 3));
	}
	
	public int sum(int a,int b) {
		int total =0;
		if(a > b) {
			for(int i =b ; i <= a ; i++ ) {
				total=total+i;
			}
		}
		if(a ==b) {
			for(int i = a; i <=b;i++) {
				total=i;
			}
		}
		if(a<b) {
			for(int i = a; i <=b; i++) {
				total =total+i;
			}
		}
			return total;
		}
		
		
	

	
}
