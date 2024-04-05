package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.jar.Attributes.Name;

import day17.override;

public class 과제 {

	public static void main(String[] args) {
		/*    스트림으로 출력
		 *  여행사 상품이 있습니다.
		 *  여행 비용은 15세 이상은 100만원, 그 미만은 50만원으로 계산
		 *  고객 3명이 패키지 여행을 떠난다고 했을 경우
		 *  1.비용계산 => 출력, 2. 고객명단 검색 => 출력
		 *  고객 클래스를 생성하고 , ArrayList로 고객관리
		 *  
		 *  예시) 고객정보 => 고객명단
		 *  이름: 이순신 , 나이: 40 , 비용 : 100
		 *  이름: 신사임당, 나이: 35, 비용: 100
		 *  이름:홍길동 나이 :10  비용 50
		 *  총 여행 경비 : 250
		 *  
		 *  20대 이상 고객명단  => 이름순으로 정렬
		 *  이름 : 신사임당, 나이 :35 비용 :100
		 *  이름 : 이순신,나이 :40. 비용: 100
		 *  
		 */
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("김치치",23));
		list.add(new Customer("마라탕",12));
		list.add(new Customer("닭고기",24));
		list.add(new Customer("볶음탕",35));
		list.add(new Customer("곱창",43));
		
		
		
	//    int sum =  list.stream().mapToInt(n-> n.getAge()).
		 list.stream()
		 .filter(n->n.getAge()<15)
		 .forEach(n->n.setPrice(50));
		 
		 list.stream()
		.filter(n->n.getAge()>=15)
		.forEach(n->n.setPrice(100));
		 
		 list.stream()
			.forEach(n->{
					String name = n.getName();
					int age = n.getAge();
					int price = n.getPrice();
					System.out.println(name+":"+age+"세 "+price+"만원");
			});
		
		//.sorted() 구현되어있으면 가능
		 int sum = list.stream()
					.mapToInt(n->n.getPrice())
			.sum();
		 System.out.println("총 여행 경비: "+ sum+"만원");
		 
		 
//		 list.stream()
//		 .filter(n-> n.getAge() >=20)
//		 .sorted(Comparator.reverseOrder())
//		 .forEach(n->{
//			 String name = n.getName();
//				int age = n.getAge();
//				int price = n.getPrice();
//				System.out.println(name+":"+age+"세 "+price+"만원");
//			 
//		 });
		 list.stream()
		 .filter(n-> n.getAge()>=20)
		 .sorted(new Comparator<Customer>() {
			 @override
				public int compare(Customer o1, Customer o2) {
					return o1.getName().compareTo(o2.getName());
					
				}
			 
		})
		 .forEach(n->{
				String name = n.getName();
				int age = n.getAge();
				int price = n.getPrice();
				System.out.println(name+":"+age+"세 "+price+"만원");
		});

 //익명 클랫
		 

	}

}
