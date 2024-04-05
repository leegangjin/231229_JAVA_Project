package day_04;

public class For_07 {

	public static void main(String[] args) {
		/* 이중 for문
		 * for(int i=1; i<=5; i++{            i=1      2    3   4     5
		 *            for(int j=1; j<=; j++){   j=1~5 1~5 1~5 1~5    1~5
		 *            실행문;  5 5 5 5 5 => 25번 실행
		 *         }
		 *    } 
		 */
		 
		//별찍기
		/* *****   i=1, j=5
		 * *****   i=2, j=5
		 * *****   i=3, j=5
		 * *****   i=4, j=5
		 * *****   i=5, j=5
		 */
		for(int i =1; i<=5; i++) {
			for(int j=1;  j<=5; j++) {
			System.out.print("*");
		
		}
		System.out.println(); //한 줄 끝나면 줄바꿈
		}  
			                 
		System.out.println("--------------------");
	              /* *               i=1, j=1
	              /* **              i=2, j=2
	              /* ***             i=3, j=3
	              /* ****            i=4, j=4
	              /* *****           i=5, j=5
	               * 
	               */
			for(int i =1; i<=5; i++) {
			  for(int j =0; j<i; j++) {
				  
				System.out.print("*");				
			}
			  System.out.println();
		}
			System.out.println("-----------");
			
		/*          		  
		 * 		    *          i=1, j=5(1~5)
		 * 		   **          i=2 , j=4 (1~4)
		 * 		  ***         i=3, j=3(1~3)
		 * 		 ****          i=4, j=2(1~2 
		 * 		*****          i=5, j=1(1~1)
		 */
			for(int i=1; i<=4; i++) {
				for(int j=1; j<=5; j++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
			System.out.println("-------------");
        /*       *  i=1 , o=4, j=1  
        /*      **  i=2 , o=3, j=2  
        /*     ***  i=3 , o=2, j=3  
        /*    ****  i=4 , o=1, j=4  
        /*   *****  i=5 , o=0, j=5  
         *      
         */
			
			for(int i=1; i<=5; i++) {
				//공백
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				//별
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			System.out.println("----------------");
        /*       *
         *      ***     
         *     *****
         *    *******
         *   *********
         */
			
			for(int i=1; i<=9; i+=2) {
				for(int j=1; j<=9-i; j+=2) {
					System.out.print(" ");
				}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
			}
              
			/*  1 2 3
			 *  4 5 6
			 *  7 8 9
			 *  3줄씩 3개출력
			 */
			System.out.println("-------------");
			int cnt =0;
			for(int i=1; i<=3; i++) {
				for( int j=1; j<=3; j++){
					cnt++;
					System.out.print(cnt + " ");
				}
				System.out.println();
			}
			System.out.println("----------------");
			
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-------");
			
			
	
	
        		   
        	   
        		   
        	   
           
	}

              	
	}
	