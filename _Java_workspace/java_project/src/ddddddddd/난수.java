package ddddddddd;

import java.util.Scanner;

public class 난수 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("난수의 개수를 입력하세요. : " );
		int cnt = scan.nextInt();
		int sum=0;
		for(int i=0; i< cnt; i++) {
			int a= (int)(Math.random()*99)+1;
			System.out.println(a);
			sum+=a;
		}
		System.out.print("난수"+cnt+"개의 합은 : "+sum);
		
		
		
        scan.close();
	}

}
