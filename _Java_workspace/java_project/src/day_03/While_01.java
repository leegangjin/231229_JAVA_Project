package day_03;

public class While_01 {

	public static void main(String[] args) {
		/* While문
		 * while문은  횟수가 일정치 않을 경우 사용
		 * while(조건식){ // 조건식이 true일때 반복합니다.
		 * 실행문;
		 * }
		 * while문은 실행문안에 조건식이 바뀔수 있는 증감식이 있어야 가능. 
		 */
		
		//for문으로 1~10까지 출력
		for(int i=1; i<=10; i++ ) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//while로 1부터 10까지 출력
		int i =0;
		while(i<10){
			i++;
			System.out.print(i+" ");
		}
System.out.println();
           //while문을 이용해서 1~10까지 짝수 출력
           int j =0;
           while(j<10){
        	   j++;
           if(j %2==0) 
        	   System.out.println(j+" ");
           }


	}

}
