package day19;

import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		//Generics(제네릭) : 데이터의 타입을 나중에 확정하는 기법
		//클래스나 메서드를 선언할 때 어떤 데이터가 들어올지 확신이 없다면,
		//제네릭 타입으로 구현 => 나중에 객체를 생성 할 때 타입을 확정하여 구현
		
		// 객체의 타입을 컴파일 할 떄 체크할수 있어서 타입의 안정성을 해치지 않는
		//선에서 적당히 형변환이 가능한 기법
		//안정성 : 의도하지 않은 타입의 객체가 저장되는 것을 막는다.
		
		
	    //List<E> list =new ArrayList<E>();
		//HashMap<String,String> map =new HashMap<K,V>();
		
		/* Sale 클래스 생성 main
		 * 1.제품추가| 2.제품리스트 보기|3.제품주문|4.주문내역보기|5.종료
		 * 
		 * 
		 */
		Scanner scan =new Scanner(System.in);
		SaleM sm =new SaleM();
		int menu=-1;
		
		do {
			System.out.println("1.제품추가| 2.제품리스트 보기|3.제품주문|4.주문내역보기|5.종료");
			System.out.println("선택 > ");
			menu=scan.nextInt();
			switch(menu) {
			case 1:sm.add(scan); break;
			case 2:sm.menuPrint(); break;
			
			case 3:System.out.println("주문메뉴 >");
			String name =scan.next();
			System.out.println("수량 >");
			int count =scan.nextInt();
			sm.orderPick(name, count);
			
			
				
			case 4:sm.orderPrint(); break;
			case 5: break;
			default :
				System.out.println("잘못된 메뉴");
			}
		}while(menu!=5);
		
		scan.close();
		
		
		

	}

}