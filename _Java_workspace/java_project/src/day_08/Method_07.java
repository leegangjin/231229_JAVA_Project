package day_08;

import java.util.Scanner;

public class Method_07 {

	public static void main(String[] args) {
		/* 로또 번호 생성
		 * 
		 */
		int lotto[] = new int[7]; //당첨번호
		int user[]=new int [6]; //사용자 로또 번호
       System.out.println("-----당첨번호------");
		printArray(lottoArray(lotto));	
		System.out.println();
		System.out.println("---사용자 로또 번호---");
        printArray(lottoArray(user));
        System.out.println();
        System.out.println("--정렬 후 번호---");
        printArray(sortArray1(user));
        System.out.println();
        System.out.println("---맞춘 개수---");
        int match =  count(lotto, user);
        System.out.println(match+"개");
        if(match==6) {
        	System.out.println("1등 당첨!");
        }else if(match==5) {
        	System.out.println("2등 당첨");
        }else if(match==4) {
        	System.out.println("3등 당첨");
        }else if(match==3) {
        	System.out.println("4등 당첨");
        }else if(match==2) {
        	System.out.println("5등 당첨");
        }else {
        	System.out.println("꽝");
        }
	}
	/* 배열을 매개변수로 받아서 1~45까지 랜덤수를 채워서 생성
	 * 리턴 할필요 없음.
	 * 중복방지
	 * 
	 */
	public static int[] lottoArray(int arr[]) {
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =(int)(Math.random()*45)+1;
			for(int j=0; j< i; j++) {
				if(arr[i]==arr[j]) {
					i--; //중복 수 제거
					break;
				}
			}
		}
		return arr;
	}
	
	
	//중복확인 메서드
	//매개변수 : 배열 , 값
	//있으면 true , 없으면 false
	
	
	
	// 배열을 매개변수로 받아 배열을 출력하는 메서드
      
    	   
	public static int[] sortArray1(int arr[]) {
		for(int i =0; i < arr.length-1; i++) {
		for(int j=i+1; j < arr.length; j++ ) {
			if(arr[i] >arr[j]){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j]=  tmp;

			}
		}		
	}
		return arr;	
}   
	public static void printArray(int arr[]){
		
		 
		for(int i=0; i < arr.length; i++) {
			if(i %7==0 && i != 0) {
				System.out.println();
				
			}
			System.out.print(arr[i]+" ");
		}
		
	}
	
		public static int count(int  lotto[],int user[]) {
			int count =0;
			for(int i =0; i <lotto.length-1; i++) {
				for(int j=0; j < user.length; j++) {
					if(lotto[i]==user[j]) {
						count++;
						break;
					}
				}
			}
			return count;
		}
	
	
}
