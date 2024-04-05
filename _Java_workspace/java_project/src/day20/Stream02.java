package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 * 
		 */
		
		int[] arr = {1,8,6,4,23,51,5,4,1,23,3,4,5,23,3,45};
		
		
//		for(int i =0; i < arr.length; i++) {
//			if(arr[i] % 2==0) {
//			System.out.print(arr[i]+" ");
//			}
//		}
		
	    Arrays.stream(arr)
	    .filter(n-> n %2 ==0)
	    .distinct()
	    .sorted()
	    .forEach(n->System.out.print(n+" "));
	    
	    System.out.println();
	    //배열로 리턴
	    
	    int[] result = Arrays.stream(arr)
	    		
	    		.filter(n -> n%2==1)
	    		.sorted()
	    		.distinct()
	    		.toArray();
	    
	    for(int tmp : result) {
	    	System.out.print(tmp+" ");
	    }
	  

		
	}

}
