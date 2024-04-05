package day13;

import java.util.Scanner;

class Product2{
	private String name;
	private int price;
	
	//생성자
	public Product2() {}
	public Product2(String name, int price) {
		this.name =name;
		this.price=price;
	}
	
	//메서드
	public void insertProduct2(String name,int price) {
		this.name =name;
		this.price=price;
	}

public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return name + ":"  + price;
	}
}
public class 과제선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		//product 클래스를 담을 수 있는 배열 10칸을 준비 
		Product2[] menu = new Product2[10];
		char c ='y'; //반복 키워드
		int cnt =0; //index 역할을 하는 변수
		
		while( c!='n') { //(!c.equals("n"))=> String 일경우
		System.out.println("상품을 등록 하시겠습니까 (y/n)");
				c=scan.next().charAt(0);
				if(c=='y') {
					System.out.println("상품명");
					String name =scan.next();
					System.out.println("가격");
					int price = scan.nextInt();
					
					//객체생성
					Product2 p =new Product2(); //while 이끝나면 사라짐  while안에서
					menu[cnt]=p;
					menu[cnt].insertProduct2(name,price);
					cnt++;
				}else {
					if(c=='n') {
						System.out.println("상품등록 종료");
					}else {
						System.out.println("y/n만 가능합니다.");
					}
				}
				System.out.println("--등록된 상품리스트--");
				for(int i=0; i <cnt; i++) { //toString 사용경우
					System.out.println((i+1)+" "+menu[i]);
				}
				//출력 메서드가 있는 경우
				//menu[i].print();
				
			
		}		
		scan.close();
		
//		Product p = new Product("pizza",15000);
//		menu[cnt]=p;
//		cnt++;
//		menu[cnt].insertProduct("음료", 2000);
//				cnt++;
//				
//				for(int i =0; i < cnt; i++){
//					
//					System.out.println(menu[i]);
//				}
		//상품을 등록하시겠습니까(y/n) y=> 등록 n => 그만
		///n을 누르면 등록한 상품 출력
	
	}

}
