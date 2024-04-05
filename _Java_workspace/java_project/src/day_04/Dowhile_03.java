package day_04;

import java.util.Scanner;

public class Dowhile_03 {

	public static void main(String[] args) {
		/*  숫자 2개를 입력받고,
		 * num1 = 5 / num2 = 3
		 * menu
		 * 1. + | 2. - | 3. *| 4. / | 5. %  | 6.종료
		 * menu에 따라서 두수의 연산결과를 출력
		 * 1 => 5+3 =8
		 * 2=> 5-3 =2
		 * ...
		 * 6=> 종료
		 * 다른 번호는 잘못된 메뉴로 출력
		 */
		System.out.println("두 숫자를 작성해주세요.");
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		int num1 =scan.nextInt();
		int num2 =scan.nextInt();
				
		do {
			System.out.println("--menu--");
			System.out.println("1. + | 2. - | 3. *| 4. / | 5. %  | 6.종료");
			System.out.println(">>menu>>");
			menu = scan.nextInt();
					
			switch(menu) {
			case 1: System.out.println(num1 + "+" + num2 + "="+ (num1+num2));
				break;
			
			case 2: System.out.println(num1 + "-" + num2 + "="+ (num1-num2));
				break;
			case 3: System.out.println(num1 + "*" + num2 + "="+ (num1*num2));
				break;
			case 4: 
				if(num2 ==0) {
					System.out.println("연산할수 없습니다.");
		            System.out.println("두번째 숫자를 다시 입력해주세요.");
					num2=scan.nextInt();
							
					
				}
					System.out.println(num1 + "/" + num2 + "="+ (num1/num2));
					
					
				
			
			   break;
			case 5:
				if(num2==0) {
					System.out.println("연산할수 없습니다.");
					System.out.println("두번쨰 숫자를 다시 입력해주십시오.");
					num2=scan.nextInt();
				} 
				System.out.println(num1 + "%" + num2 + "="+ (num1%num2));
				break;
				case 6 :System.out.println("종료되었습니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
				
				
				
			
			}
			
		
			
		}while( menu !=6);
		
	
	
		
		
		
		
		

		scan.close();
	}

}
