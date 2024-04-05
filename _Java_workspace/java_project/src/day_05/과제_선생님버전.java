package day_05;

public class 과제_선생님버전 {

	public static void main(String[] args) {
		int arr[] = new int[] {10,56,78,89,48,62,93,50};
		int sum = 0;
		double avg =0;
		//성적 데이터 (0~100)
		int max = 0; //가장 큰 값을 넣기 위한변수
		int min =100000;  //가장 작은 값을 넣기 위한 변수
		
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr [i]) {
//				min = arr[i];
//			}
			max = Math.max(max, arr[i]);
			min = Math.max(min, arr[i]);
		}
		avg = sum / (double) arr.length;
		System.out.println("합계 :" + sum );
		System.out.println("평균 :" + avg );
		System.out.println("최대 :" + max );
		System.out.println("최소 :" + min );
		
		
	}

}
