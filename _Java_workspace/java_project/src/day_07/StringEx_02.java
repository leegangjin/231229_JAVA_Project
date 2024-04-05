package day_07;

import java.util.Scanner;

public class StringEx_02 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때,
		 * 검색어를 입력하면 해ㅏㅇ 단어를 포함하는 파일을 출력.
		 * 
		 */
		
		
        // ex : java => 이것이자바다.java java의정석. java 출력
		// String =. String.jpg  String 메서드.txt
		//txt => String 메서드.txt array.txt
		//스트링 => 검색결과가 없습니다.
		
		Scanner scan =new Scanner(System.in);
		System.out.println("검색어를 입력하세요.");
		String[] fileName = {"이것이자바다.java","java의정석.java","String.jpg","String 메서드.txt","array.txt"};

		int count =0;
		String ab =scan.next();
		
		for(String a : fileName) {
			if(a.contains(ab)) {
				System.out.println(a+" ");
				count++;
		}
		}
					
		
		if(count==0) {
			System.out.println("검색 결과가 없습니다");
		}
				
			
		
		
		 
			
		
		
				scan.close();
	}

}
