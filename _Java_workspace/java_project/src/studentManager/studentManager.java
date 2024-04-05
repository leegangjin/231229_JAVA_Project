package studentManager;

import java.util.Scanner;
public class studentManager implements Program{
	private Student[] s =new Student [10];
	private int cnt =0;
	Subject sj = new Subject();
	

	@Override
	public void prinStudent() { //학생정보출력
		for(int i=0; i< cnt; i++) {
			s[i].printInfo();
		}
	}

	@Override
	public void insertStudent(Scanner scan) { //학생등록
		System.out.println("학생 등록");
		System.out.println("학번,이름,번호,주소,나이를 입력해주세요.");
		String cord =scan.next();
		String name =scan.next();
		String phone =scan.next();
		String address =scan.next();
		int  age =scan.nextInt();
		s[cnt] =  new Student(cord,name,phone,address, age);
		cnt++;
	}

	@Override
	public void searchStudent(Scanner scan) {//학생검색
		System.out.println("학생명 > ");
		String name = scan.next();
		for(int i=0; i < cnt;i++) {
			if(s[i].getName().equals(name)) {
				s[i].printInfo();
				s[i].printsub();
				
			}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {//수강신청
		System.out.println("수강신청 학생명");
		String name = scan.next();
		for(int i=0; i <cnt; i++) {
			
			if(s[i].getName().equals(name)) {
				System.out.println("과목 명");
				String subname=scan.next();
				Subject se =new Subject(subname,name);  
				s[i].insertsub(se);
				System.out.println("등록완료");
				break;
		
		
		
				
			}
		}
	}

	@Override
	public void deleteSubject(Scanner scan) { //수강삭제
		System.out.println("수강철회 할 학생의 이름을 써주세요");
		String name=scan.next();
		for(int i=0; i < cnt; i++) {
			if(s[i].getName().equals(name)) {
				System.out.println("수강철회 할 과목을 쓰세요");
				String delname =scan.next();
				s[i].delsub(delname);
				System.out.println("삭제완료");
				
			}
		}
	}



}
