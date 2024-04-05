package studentManager;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

       
		studentManager sm = new studentManager();
       
       int menu=0;
       Scanner scan = new Scanner(System.in);
       do {
			System.out.println("--menu--");
			System.out.println("1.학생등록 | 2. 학생리스트 출력 | 3.학생검색(학생정보,수강정보)| 4.수강신청 | 5.수강철회  | 6.종료");
			System.out.println(">>menu>>");
			menu = scan.nextInt();
					
			switch(menu) {
			case 1:System.out.println("1.학생등록");  
				sm.insertStudent(scan);
				break;
			
			
			case 2:System.out.println("2.학생리스트 출력");
			   sm.prinStudent();
				break;
			case 3:System.out.println("3.학생검색");
			    sm.searchStudent(scan);
				break;
			case 4:System.out.println("4.수강신청"); 
				sm.registerSubject(scan);
			break;
			case 5:System.out.println("5.수강철회");
				sm.deleteSubject(scan);
				break;
			case 6 :System.out.println("종료되었습니다.");
			break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
			
			
       }while( menu !=6);
       
       scan.close();
				
				
				
				
				
				
				
				
				
				
				
			
	}
	

}
