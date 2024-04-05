package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고 , 출력
		 * 합계를 출력
		 * 입력 : 45,78 ,89,97,68,57,48 => String
		 * list에 넣고 , 출력 => 합계(인원수) 출력
		 * 70이상 점수 개수 출력
		 */
		Scanner scan =new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		int sum=0;
		
		int cnt=0;
	    String  a =null;
		
		
		while(true) {
			System.out.println("값을 입력하세요.");
			arr.add(scan.next());
			System.out.println("1.계속 | 2.그만");
			a=scan.next();
			if(a.equals("2")) {
				break;
			}		}
		for(int i=0; i< arr.size(); i++) {
			sum= sum+Integer.parseInt(arr.get(i));
			if(Integer.parseInt(arr.get(i))>=70) {
				cnt++;
			}
		}
		System.out.println(arr);
		System.out.println("인원수 :"+ arr.size());
		System.out.println("합계:"+sum);
		System.out.println("70점 이상은 :"+cnt);
		
		String num ="45,78 ,89,97,68,57,48";
       String[] numbers = num.split(",");
    		   List<Integer>list1 = new ArrayList<Integer>();
       ;
       
       for(String n : numbers) {
    	   list1.add(Integer.parseInt(n));
    	   
       }
       System.out.println(list1);
			int sum1=0; 
			int count =0;
		for(int tmp : list1) {
			sum1+=tmp;
			if(tmp>=70) {
				count++;
			}
		}
		System.out.println("총합:"+sum1);
		System.out.println("70점이상 :" +count);
		
		
		
		
		
		scan.close();



	}

}
