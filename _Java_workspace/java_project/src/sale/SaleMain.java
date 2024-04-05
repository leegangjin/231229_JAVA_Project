package sale;

import java.util.Scanner;

import day19.SaleM;

public class SaleMain extends SaleM {

	public static void main(String[] args) {
		/* menu
		 * 1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)
		 * 4.메뉴보기(전체메뉴출력)|5.주문|6.주문내역출력(영수증)|7.종료
	*/
	
		Scanner scan =new Scanner(System.in);
		SaleManager sm =new SaleManager();
		int menu=-1;
		
		do {
			System.out.println("1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)");
			System.out.println("4.메뉴보기(전체메뉴출력)|5.주문|6.주문내역출력(영수증)|7.종료");			        
			System.out.println("선택 > ");
			menu=scan.nextInt();
			switch(menu) {
			case 1: sm.addMenu(scan);    break;
			case 2: sm.delMenu(scan);    break;
			
			case 3: sm.modifyMenu(scan); break;
			
				
			case 4: sm.printMenu(scan); break;
			case 5: System.out.println("주문메뉴 >");
			String name =scan.next();
			System.out.println("수량 >");
			int count =scan.nextInt();
			sm.orderitem(name, count); break;
			
			case 6: sm.printOrder();break;
			case 7: break;
			default :
				System.out.println("잘못된 메뉴");
			}
		}while(menu!=7);
		
		
		scan.close();
		
		   
	   
	
	}

	
	

}
