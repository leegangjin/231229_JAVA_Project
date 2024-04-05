package day_09;

import java.util.Scanner;

import day_08.Method_06;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (각 자리수는 1~9까지의 수)=>배열로 랜덤 저장(중복 불가능)
		 * 유저는 3자의 숫자를 맞추는 겡미 => 직접 입력(중복 x)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안맞으면 out
		 * ex)컴퓨터 생성 번호 : 1 2 3
		 * 사용자 번호 : 1 7 8 => 1s 
		 * 사용자 번호 : 1 3 2 => 1s 2b 
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3s정답
		 *  배열로
		 */
		Scanner scan =new Scanner(System.in);
		Method_06.printArray(null);
		System.out.println("야구 게임");
		System.out.println(">게임 시작>");
		System.out.println("-컴퓨터 생성번호-");
		int com[]=new int[3];
		int count =0;
		int user[]=new int[3];
		int strike =0;
		int ball =0;
		for(int i=0; i <com.length; i++) { //중복값 제거 ,컴퓨터 랜덤값 생성
			com[i] =(int)(Math.random()*9)+1;
			for(int j=0; j < i; j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
//		for(int i : com) {
//			System.out.print(i+" ");
		//}
		System.out.println();
		System.out.println(">사용자번호를 입력하세요>");
		
		while(true) { //중복값 제거
			for(int i=0; i <user.length; i++) {
				user[i] =scan.nextInt();
				for(int j=0; j < i; j++) {
					if(user[i]==user[j]) {
						i--;
						break;
					}
					
				}
			}
			for(int i=0; i < com.length; i++) { //사용자값 컴퓨터 값 비교 
				for(int j=0; j < user.length; j++) {
					if(com[i]==user[j]&& i==j) {
						strike++;
					}else if(com[i]==com[j]&&i!=j) {
						ball++;
					}
				}
			}
			if(strike==3) {
				System.out.println(strike +"S"+"정답입니다.");
						break;
			}else if(strike==0 && ball==0) {
				System.out.println("Out");
			}else {
				System.out.println(strike +"s"+"/"+ball+"b");
			}
		}
		strike =0;
		ball=0;
		
		scan.close();

	}
	//중복 메서드
	
	public static boolean isContain(int arr[],int random) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
			
		}
		return false;
	}
}
