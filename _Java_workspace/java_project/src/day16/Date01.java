package day16;

import java.util.Calendar;
import java.util.Date;

public class Date01 {
	
	public static void main(String[] args) {
      /* 날짜 / 시간 클래스
       * Date 클래스 => Deprecated(비권장) / Calender 클래스
       * Calendar : 추상클래스 // 추상클래스는 객체를 생성할 수 없음
       * 추상클래스를 구현한 객체를 이용하여 사용
       * new로 객체 생성 불가능
       * getstance() 메서드를 이용하여 객체를 얻어옴
       * static 메서드 . 클래스명.메서드명()
       * 
       */
//	Date d =new Date();
		Calendar c = Calendar.getInstance(); //오늘 날짜 리턴
		int year =c.get(Calendar.YEAR);
		System.out.println(year);
		//월 0~11까지 +1 표현
		int month =c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day =c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK); //일~토
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		//금=6 목 =5 수=4 화 =3 월=2 일 =1 토=0
		//hour, minute , second , am_pm
		//2024-1-26 (금) 
		//오후 4:13
		int hour =c.get(Calendar.HOUR);
		System.out.println(hour);
		int minute=c.get(Calendar.MINUTE);
		System.out.println(minute);
		int second=c.get(Calendar.SECOND);
		System.out.println(second);
		int apm =c.get(Calendar.AM_PM); //0일시 am 1 :pm
		System.out.println(apm);
		
		String weekstr=null;
			switch(week) {
			case 1 : weekstr="일"; break;
			case 2 : weekstr="월";break;
			case 3 : weekstr="화"; break;
			case 4 : weekstr="수"; break;
			case 5 : weekstr="목"; break;
			case 6 : weekstr="금"; break;
			case 7 : weekstr="토"; break;
				default : break;
			}
				System.out.println(year+"-"+month+"-"+day+"("+weekstr+")"+((apm==1)? "오후" : "오전")
						+hour+":"+minute+"-"+second+"초");
		
			
			}		
		}
	
	

