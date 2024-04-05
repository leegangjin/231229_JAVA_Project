package day_09;

import java.util.Scanner;

public class 가위바위보_선생님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작>>");
		int comnum =(int)(Math.random()*3); // 0 1 2 를 선택
		System.out.println("컴퓨터 결정 완료");
		System.out.println("가위/바위/보 중 하나 선택>");
		String my =scan.next(); //가위/ 바위/ 보
		String comchoice =(comnum==0? "가위":comnum==1? "바위" : "보");
		System.out.println("comchoice > " +comchoice +"("+comnum+")");
				System.out.println("my >" +my);
		
		//비교
		if(comchoice.equals(my)) {
			System.out.println("무승부");
		}else {
			if(comchoice.equals("가위")){
					System.out.println(my.equals("바위")? "승":"패");
		}else if(comchoice.equals("바위")){
			System.out.println(my.equals("보")?"승":"패");
		}else {
			System.out.println(my.equals("가위")?"승" :"패");
		}
		scan.close();

 	     }   
	}
}
