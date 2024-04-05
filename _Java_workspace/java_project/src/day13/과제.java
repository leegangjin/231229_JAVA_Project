package day13;

import java.util.Scanner;

/* product 클래스 생성 : 상품을 등록하는 클래스
 * 상품명 , 가격 멤버변수
 * 상품 추가 메서드
 * 상품 출력 메서드(toString 생성가능)
 */
class Product {
	//멤버변수 선언
	private String name;
	private String price;
	
	public Product() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Product(String name,String price) {
		this.name=name;
		this.price=price;
	}
	public String add(String name,String price) {
		return "상품명: "+name+ "  상품가격: "+price;
	}
	
	public String toString() {
		return   "상품이름:"+ name + " 상품가격: "+price;
	}

}	



public class 과제 {

	public static void main(String[] args) {
		//상품을 10개 등록가능한 배열 생성
		//스케너를 이용하여 상품을 등록받기
		//등록한 상품 출력
		
		Scanner scan =new Scanner(System.in);
		Product pr =new Product();
		String  item[] =new String[10];
		
		int cnt =0;
		
		 
		if(cnt >10) {
			System.out.println("추가 등록 불가");
		}for(int i=0; i < item.length; i++) {
			System.out.println("상품과 가격을 등록해주세요.");
			item[i]=pr.add(scan.next(), scan.next());
		    cnt++;
		}for(String s : item) {
			System.out.println(s.toString());
			
			
		}
		
		
		
		
		scan.close();
		
		

	}

}
