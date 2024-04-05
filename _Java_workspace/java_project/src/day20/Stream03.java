package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		// add로 5명추가
		
		
		//스트림을 이용하여 콘솔에 출력 ex) 홍길동  : 98
		
		ArrayList <Student> list =new ArrayList<>();
		list.add(new Student("김치치",86));
		list.add(new Student("김치",96));
		list.add(new Student("파김치",66));
		list.add(new Student("배추치",76));
		list.add(new Student("묵은치",16));
		
		list.stream().forEach(n-> System.out.println(n+" "));
		
		System.out.println();
		
		list.stream()
		.forEach(n->{
				String name = n.getName();
				int score = n.getScore();
				System.out.println(name+":"+score);
		});
		
		//list의 점수 합계 / 전체 인원수 출력
		System.out.println("점수");
		int sum = list.stream()
				.mapToInt(n->n.getScore())
		.sum();
		System.out.println("점수합: "+sum);
		
		long lo = list.stream().count();
		System.out.println("몇명? :"+ lo);
		
		
		

	}

}
