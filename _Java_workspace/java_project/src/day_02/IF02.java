package day_02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어 , 영어 , 수학 점수를 입력받아
		*합계 , 평균, 평가를 출력
		*평가는 
		*평균이 90이상이면 A
		*평균이 80이상이면 B
		*평균이 70이상이면 C
		*나머지는 D
		*입력값이 0보다 작거나 100보다 크면 잘못된 값
		
*/
            Scanner scan = new Scanner(System.in);
            System.out.println("정수입력(0~100 : 국어, 영어, 수학 순으로 입력  >");
            System.out.println("국어 점수를 입력해주세요.");
             
            int kor = scan.nextInt();
            if(kor < 0 || kor > 100) {
            	System.out.println("다시 입력해주세요.");
            }
            System.out.println("나의 국어점수 : "+kor + "점");
            System.out.println("----------");
            
            
           
            System.out.println("수학 점수를 입력해주세요.");
            int math = scan.nextInt();
            if(math < 0 || math > 100) {
            	System.out.println("다시 입력해주세요.");}
            System.out.println("나의 수학점수 : "+math + "점");
           
            System.out.println("-----------");
            System.out.println("영어 점수를 입력해주세요.");
            int eng = scan.nextInt();
            if(eng <0 || eng> 100) {
            	System.out.println("다시 입력해주세요.");
            }
            System.out.println("나의 영어점수 : " +eng + "점");
            
            System.out.println("---------");
           int sum = kor + eng + math;
           System.out.println("세 과목의 합은 : " +sum + "점입니다.");
           double avg = (double)sum/3.0;
           System.out.println("세 과목의 평균은 : " +avg +"점입니다.");
           
           scan.close();
           if(avg<0 || avg>100) {
        	   System.out.println("잘못된 성적입니다.");
           }
           if(avg>=90) {
        	   System.out.println("A학점입니다.");
           }if (avg>=80) {
        	   System.out.println("B학점입니다.");
           }else if(avg>=70) {
        	   System.out.println("C학점입니다.");
           }else {
        	   System.out.println("D학점입니다.");
           }
           
          
           
           
           
         
        
            
            
            
            
            
	}

}
