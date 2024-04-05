package day_06;

public class Array_04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성한후
		 * 1~50랜덤수를 배열에 저장 한 후 출력
		 * 합계, 평균 최대 , 최소 출력
		 */
		
		int arr1[] = new int[10]; //배열의 초기값은 전부 0
	     
	   
	   
	     int sum = 0;
	    
		 
	    for(int i = 0; i <arr1.length; i++) {
	    	arr1[i]=(int)(Math.random()*50)+1;
	    	sum= sum+arr1[i];
	    	System.out.print(arr1[i]+ " ");	 
	    }
	    System.out.println();
	    double avg = sum / (double)arr1.length;
	    System.out.println("합계: " + sum);
	    System.out.println("평균: " + avg);
	    
	    int max =0; //최대값
	    int min =10000; //최소값
	   //배열에서 탐색 
	    for(int i =0; i<arr1.length; i++) {
	    	if(max < arr1[i]) {
	    		max = arr1[i];
	    	}
	    	if(min > arr1[i]) {
	    		min = arr1[i];
	    	}
	    }
	    System.out.println("최대값: "+ max);
	    System.out.println("최소값: "+ min);
	    
	    

	}

}
