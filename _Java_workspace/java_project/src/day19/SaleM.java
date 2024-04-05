package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleM {
	
	//제너릭 클래스 처리
	private ArrayList<Sale<String,Integer>> menu =new ArrayList<>();
	private ArrayList<Sale<String,Integer>>  order =new ArrayList<>();
	
	//private index;
	public void add(Scanner scan) {
		// 제품 추가
		System.out.println("제품 추가 ");
		System.out.println("제품");
		String item =scan.next();
		System.out.println("제품가격");
		int itemprice =scan.nextInt();
		
		Sale <String,Integer> s = new Sale<String,Integer>(item,itemprice);
		this.menu.add(s);		
		System.out.println("등록 완료");
		
		
		
	}
  //제네릭 클래스 처리

	public void menuPrint() {
		// 제품리스트보기
		System.out.println("---제품---- ");
		
		for(int i =0; i < menu.size(); i++) {
			System.out.println(menu.get(i).getMenu() + " : " + menu.get(i).getPrice() + "원" );
		}
		
		
		
		
	}

	public void orderPick(String name,int count) {
		// 입력받는 값은 제품명 , 수량
		//제품명 가격 *수량(지불금액)을 order에 추가
		//햄버거 5 => 햄바가 25000
		for(int i =0; i < menu.size(); i++) {
			String ProductMenu =menu.get(i).getMenu();
			int ProductPrice =menu.get(i).getPrice();
			if(ProductMenu.equals(name)) {
				int index =orderSearch(name);
				if(index != -1) { //order에 같은 제품이 있다면
					int price =order.get(index).getPrice();
					order.get(index).setPrice(price+(ProductPrice*count));
					return;
				}
				//주문한적 없는 메뉴일경우
				Sale p =new Sale(ProductMenu,(ProductPrice*count));
				order.add(p);
			}
		}
	}
	public int orderSearch(String name) {
		//name :주문매뉴
		int index=-1;
		for(int i=0; i <order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index =i;
				System.out.println(index);
				return index;
			}
		}
		return index;
	}
				
			
			
		
		
		
		
		

	public void orderPrint() {
		// 주문내역 출력
		// 총지불내역 출력
		System.out.println("---주문내역---");
		int sum=0;
		
		for(Sale<String,Integer>tmp :order) {
			System.out.println(tmp);
			sum+=(int)tmp.getPrice();
		}
		System.out.println("총지불금액:"+sum);
	}

	

	
	
}
