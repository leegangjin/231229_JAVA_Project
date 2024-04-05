//package day18;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class MapEx01 {
//
//	public static void main(String[] args) {
//		/*  map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
//		 * 상품을 map에 추가하는 작업은 메서드를 활용
//		 * 1. map을 main에 생성해놓고, 매개변수로 받아 map의 데이터를 채우는 메서드
//		 * 2. map을 메서드 내부에서 생성하여, main으로 리턴하는 메서드
//		 * 
//		 * 가위 2500
//		 * 크레파스 4000
//		 * 물감 5000
//		 * 합계 ?
//		 */
//		int sum=0;
//		HashMap<String, Integer> map =new HashMap<>();
//		System.out.println("--map을 매개변수로 받은--");
//		MapEx01 m =new MapEx01();
//		m.moo(map);
//		
//		HashMap<String,Integer>map1 =m.moo2();
//		System.out.println("---map을 리턴으로 받은 메서드 실행---");
//		for(String s : map.keySet()) {
//			sum+=map.get(s);
//			System.out.println(s+":"+ map.get(s));
//			
//		
//		
//		
//		}
//		System.out.println("총합:"+sum);
//		
//		m.printmap();
//	
//
//	}
//	
//	//map을 매개변수로 받는 케이스
//	
//	//map을 내부에서 생성하여 리턴하는 케이스
//	
//	public  void    moo (HashMap<String,Integer>map ) {
//		
//		map.put("가위", 2500);
//		map.put("크레파스", 4000);
//		map.put("물감", 5000);
//		
//		
//			
//			
//			
//		
//		
//		
//		
//	
//		
//	}
//	
//	//map을 내부에서 생성하여 리턴하는 케이스
//	public HashMap<String, Integer>moo2(){
//		HashMap<String,Integer>map =new HashMap<>();
//		map.put("가위", 3000);
//		map.put("크레파스", 5000);
//		map.put("물감", 3000);
//		return map;
//	}
//	
//	//map을 받아서 출렫하는 메서드
//	
//	public   void  printmap  HashMap<String,Integer>map (){
//		HashMap<String,Integer>map =new HashMap<>();
//		
//		map.put("가위", 3000);
//		map.put("크레파스", 5000);
//		map.put("물감", 3000);
//		
//		
//		System.out.println(map);
//		
//		return map;
//		
//		
//	}
//	
//	
//	
//}
