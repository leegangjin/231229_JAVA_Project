package day_02;

public class Switch01 {

	public static void main(String[] args) {
		/* Switch문 : 값에 따라 케이스를 달리주는 형식
		 * 
		 * switch(변수 / 식) {
		 * case 값1 : 실행문; break;
		 * case 값2 : 실행문; break;
		 * case 값3 : 실행문; break;
		 * case 값4 : 실행문; break;
		 * default: 실행문;  break;
		 * break; : 실행문을 빠져나갈때 사용.
		 * }
		 * 
		 */
		
		int num= 5;
		switch(num % 2) {
		case 0 :
			System.out.println("짝수");
			break;
		case 1 :
			System.out.println("홀수");
			break;
			default:
				System.out.println("잘못 입력된 값입니다.");
				break;
				
			
		}
		
		int num2 =3; //1 , 2 , 3 중 하나
		//num2의 값에 따라서 1, 2 , 3인지 출력
		
		switch(num2) {
		case 1 :
			System.out.println("1입니다.");
		break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
			default :
				System.out.println("ERROR");
				break;
			
		}

	}

}
