package day_08;

public class Method_04 {

	public static void main(String[] args) {
		/* 최대공약수 , 최소공배수 리턴
		 * 리턴을 받은 값을 메인에서 출력
		 * 
		 */
		int gcd=gcd(6,12);
		System.out.println(" 최대 공약수 :"+gcd);
		
		int lcm =lcm(10, 15);
		System.out.println("최소 공배수 : " +lcm);
		
		System.out.println(lcm2(10, 15));
	}
	
	/*두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드
	 * 매개변수 : 두 정수 (int num1 , int num2)
	 * 리턴타입 : 최대공약수 (int)
	 * 메서드명 : gcd
	 */ 
	public static int gcd(int num1, int num2) {
		int result =0; //공약수가 들어올 변수
			for(int i=1; i <=num1; i++) {
				if(num1 % i==0 && num2 % i==0) {
					result=i;
				}
			}
		return result;
	}

		

	
	/*두 정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
	 *  매개변수 : 두정수 (int num1, int num2)
	 *  리턴타입 : 최소공배수(int)
	 *  메서드명 : lcm 
	 */
	
	public static int lcm(int num1, int num2) {
		for(int i=num1; ; i=i+num1) {
			if(i % num1==0 && i%num2==0) {
				return i; //메서드에서 return을 만나면 값을 반환하고 종료~!!
			}
		}
	}
	//최소 공배수 규칙 : 두 수를 곱한 후 최대공약수로 나누면 최소공배수
	//10 15 =150 /5 =30
	//메서드 안에서 메서드를 호출 리턴값을 사용.
	public static int lcm2(int num1,int num2) {
		return num1 * num2 /gcd(num1, num2);
	}
	

}
