package ddddddddd;

import java.util.Arrays;

public class 변수합 {

	public static void main(String[] args) {
		
		int[][] a = {{10,20,50},{20,30,15},{100,110,120}};	
		int sum=0;
		

		for(int[] temp : a) {
            for(int i : temp) {
                sum +=i;
            }
        }
        System.out.println(" 배열의 총 합 : " + sum);
	}
}
