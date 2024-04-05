package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager {
	private ArrayList<Sale<String,Integer>> menu =new ArrayList<>();
	private ArrayList<order>  order =new ArrayList<>();
	order o =new order();

	public void addMenu(Scanner scan) {
		System.out.println("제품 추가");
		System.out.println("제품");
		String item =scan.next();
		System.out.println("제품가격");
		int itemprice =scan.nextInt();
		
		Sale <String,Integer> s = new Sale<String,Integer>(item,itemprice);
		this.menu.add(s);		
		System.out.println("등록 완료");
		
	}

	public void delMenu(Scanner scan) {
		System.out.println("삭제할 메뉴 >");
		String name =scan.next();
		for(int  i=0; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				menu.remove(i);
				menu.remove(menu.get(i));
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("삭제할 메뉴가 없습니다.");
		
	}

	public void modifyMenu(Scanner scan) {
		System.out.println("수정할 메뉴 >");
		String name =scan.next();
		
		for(int i =0; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				System.out.println("수정(메뉴 / 가격)");
				String modname=scan.next();
				int modprice=scan.nextInt();
				Sale <String,Integer> ss = new Sale<String,Integer>(modname,modprice);
				this.menu.add(ss);
				System.out.println("수정완료");
				return;
			}
		}
		System.out.println("수정할 메뉴가 없습니다.");
		
	}

	public void printMenu(Scanner scan) {
     System.out.println("---제품---- ");
		
		for(int i =0; i < menu.size(); i++) {
			System.out.println(menu.get(i).getMenu() + " : " + menu.get(i).getPrice() + "원" );
		}
		
		
		
		
	
		
	}

	public void orderitem(String name,int count) {
		System.out.println("주문 메뉴 >");
		for(int i=0; i < menu.size(); i++) {
			String ordername = menu.get(i).getMenu();
			int orderprice = menu.get(i).getPrice();
			if(ordername.equals(name)) {
				int index =orderSearch(name);
				if(index != -1) { //order에 같은 제품이 있다면
					int price =order.get(index).getPrice();
					int cnt= order.get(index).getCount();
					order.get(index).setPrice(price);
					order.get(index).setCount(cnt+count);
					order.get(index).setTotal(price*(cnt+count));
					return;
				}
				//주문한적 없는 메뉴일경우
				order o = new order(name,orderprice,count,(orderprice*count));
				order.add(o);
				System.out.println("주문완료");
			}
		}
			
				
			
		
		
	}

	public void printOrder() {
		int sum =0;
		System.out.println("전체 주문내역");
		for(order o : order) {
			sum+=o.getTotal();
			o.orderPrint();
		}
		System.out.println("총 지불금액 :" +sum);
		
		
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
}


