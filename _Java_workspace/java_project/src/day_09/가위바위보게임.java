package day_09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위 , 바위 =1, 보=2)
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승/패/무 결과를 출력
		 * ex)
		 * com =0(가위)
		 * user =가위 => 무승부입니다.
		 * 
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("가위,바위,보, 중 입력해주세요.");
		
		while(true) {
			String user =scan.next(); //내가 입력한 값
			int com=(int)(Math.random()*2)+0; //컴퓨터가 뽑은 값
			System.out.println("user :" +user);
			System.out.println("com :" +com);
			if(com==0) {
				System.out.println("가위");
			}else if(com==1) {
				System.out.println("바위");
			}else {
				System.out.println("보");
			}
			
			if(user.equals("가위")) {
				if(com==0) {
					System.out.println("비겼습니다.");
				}else if(com==1) {
					System.out.println("user가 졌습니다.");
				}else {
					System.out.println("user가 이겼습니다.");
					break;
				}
					
			}
			if(user.equals("바위")) {
				if(com==0) {
					System.out.println("user가 이겼습니다.");
					break;
				}else if(com==1) {
					System.out.println("비겼습니다.");
				}else {
					System.out.println("user가 졌습니다.");
				}
			}
			if(user.equals("보")) {
				if(com==0) {
					System.out.println("user가 졌습니다.");
				}else if(com==1) {
					System.out.println("user가 이겼습니다.");
					break;
				}else {
					System.out.println("비겼습니다.");
				}
			}
		}
		
		scan.close();
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		 
		
		
		
		
		
		
		
		

	
	}	

}
