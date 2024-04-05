package day_01;

public class 과제 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 평균은 소수점을 살려서 출력
		 * 
		 * 조건선택연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격으로 출력
		 * 
		 **/
		
		int kor =83;
		int eng = 87;
		int math = 93;
		
	
		
		int sum = kor + eng + math;
		
		System.out.println("국어점수는" + kor + "점입니다");
		System.out.println("영어점수는" + eng + "점입니다");
		System.out.println("수학점수는" + math + "점입니다");
		
		
		System.out.println("세 과목의 점수의 합계는" + sum + "점입니다" );
		double avg = (double) sum / 3;
		//System.out.println(avg);
		
		System.out.println("세 과목의 평균은" + sum/3.0 + "입니다");
		String result= (sum>=80)? "합격입니다." : "불합격입니다" ;
	
		
		
		System.out.println((sum>=80) ? "세 과목의 평균 80점 이상으로 합격입니다. 수고하셨습니다." : "세 과목의 평균 80점 이하로 불합격입니다. 수고하셨습니다 다음번엔 화이팅합시다!");
		
		//조건선택 연산자 => if문으로 변경
		/*if(조건문) 처리문;
		   else 처리문;
		 **/
		if(avg>=80)
			System.out.println("결과:합격");
		else
			System.out.println("결과: 불합격");
		
		
		
		

	}

}
