package day_05;

public class array_03 {

	public static void main(String[] args) {
		int arr[] =new int[] { 56,10 ,78,89,48,62,93,50};
		/*arr배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 * if문
		 */
		int sum= 0;
		for(int i=0; i<arr.length; i++) {
			sum= sum+arr[i];
	    
	    
		}
		
		double avg = sum/(double)arr.length;
		System.out.println("합계 : " +sum);
		System.out.println("평균 : " + avg);
		
		int max =0;
		int min =100;
		
		for(int i=0; i < arr.length; i++) {
		if( max < arr[i]) { 
			max = arr[i];
//				System.out.println(Math.max(max, min));
		}			
		if(min > arr[i]) {
			min =arr[i];
		}
//				System.out.println(Math.max(max, min));
	}
				
		
			
		
		System.out.println("최대값 : " +max);
		System.out.println("최소값 : " +min);
		System.out.println(Math.max(max, min));
		System.out.println(Math.min(max,min));
		
		
				
	

	}

}
