package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String t =today.toString(); //toString() 스트링으로 객체를 변환
		System.out.println(t);
		int a= t.indexOf("T");
		int b= t.indexOf(".");
		System.out.println(t.substring(0,a));
		//System.out.println(t.indexOf("T"));
		//날짜 2024-01-26 //시간 17:04:02
		System.out.println(t.substring(a+1,b));
		
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("현시각 : yyyy/MM/dd hh:mm");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate =LocalDateTime.of(2009, 9, 30 , 8, 30); //날짜 생성
		System.out.println(sDate.format(dtf));

	}

}
