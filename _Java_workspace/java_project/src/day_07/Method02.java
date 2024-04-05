package day_07;

public class Method02 {

	public static void main(String[] args) {
		// + - * / %메서드를 생성 
		// main에서 호출 해서 확인
	   System.out.println(sum(10,20));	
	   System.out.println(sub(10,20));	
	   System.out.println(div(10,20));	
	   System.out.println(mod(10,20));	
	   System.out.println(mul(10,20));	

	}

    //매서드 선언 위치
	
	//두 정수의 합을 알려주는 메서드 sum	
	public static int sum(int num1, int num2) {
		return  num1 + num2;
	}
	//두 정수의 차을 알려주는 메서드 sub	
	public static int sub(int num1, int num2) {
		if( num1 > num2) {
		return num1 - num2;
		}
		return num2 - num1;
	}
	//두 정수의 곱을 알려주는 메서드 mul	
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	//두 정수의 나눗셈(몫)을 알려주는 메서드 div	
	public static double div(int num1, int num2) {
		return (double)num1 / (double)num2;
	}
	//두 정수의 나머지를 알려주는 메서드 mod
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
}
