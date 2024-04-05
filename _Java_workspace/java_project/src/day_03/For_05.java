package day_03;

public class For_05 {

	public static void main(String[] args) {
		/* 약수 : 나누어서 떨어지는 수의 집합
		 * 6의 약수 : 6/1=0, 6/2=0 6/3=0 6/4=2 6/5=1 6/6=0
		 * 6의 약수 : 1,2,3,6
		 * 12의 약수 : 1,2 ,3,4,6,12
		 * 두 수의 공약수 : 1 2 3 6 (두수의 공통된 약수)
		 * 
		 * 그 공약수 중 가장 큰값은 최대공약수 : 6
		 */
		
		int num1 = 6;
		int num2 = 12;
		int c= 0;
		for(int i =1; i<=num1; i++) {
			if(num1 % i ==0 && num2 % i ==0); {
				c=i;//System.out.print(i +" ");
			}   
			
		}
		System.out.println(c);
		//break; 
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할 바로 앞을 빠져나온다.
		 * 
		 */
	     for(int i=num1;  ; i--) {
	    	 
	    	 if (num1 % i==0 && num2 % i==0);{
	    		 System.out.println(i);
	    		 break;
	    	 }
	     }
	     
	     //중청 for문일 경우 break는 나를 감싸고 가장 안쪽에 있는 for문을 벗어남
	     int i = 0;
	    a : for(;;) {
	    	 for(;;) {
	    		 i++;
	    		 if(i==10) {
	    			 System.out.println(i);
	    			 break a; //지칭하는 for문 벗어날수있다.
	    		 }
	    	 }
	     }
                  
	}

}
