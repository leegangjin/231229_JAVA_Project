package std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//3번
public class StdManager implements stdProgram {
	private ArrayList<Student> list= new ArrayList<>();
	Student s =new Student();
	
	public void add() {
		list.add(new Student("홍길동"));
		list.add(new Student("박순이"));
		list.add(new Student("홍자영"));
		list.add(new Student("홍미미"));
		list.add(new Student("수로아"));
	}

	

	@Override
	public void addStd(Scanner scan) {
		
		System.out.println("학생명 >");
		String name =scan.next();
		System.out.println("나이 >");
		int age =scan.nextInt();
		System.out.println("번호 >");
		String num =scan.next();
		
		Student s =new Student(name, age, num);
		
		list.add(s);
		
		
		
	}

	@Override
	public void modStd(Scanner scan) {
		System.out.println("이름 입력 >");
		String name =scan.next();
				for(int i=0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("수정정보를(이름,나이,번호 중 하나)입력하세요.");
				String op =scan.next();
				switch(op) {
				case "이름" : String modName =scan.next(); 
				list.get(i).setName(modName);
				break;
				case "나이" : int modAge =scan.nextInt();
				list.get(i).setAge(modAge);
				break;
				case "번호" :  String modNum= scan.next();
				list.get(i).setNum(modNum);
				break;
					defaylt : System.out.println("정보가 존재하지 않습니다.");
				}
				System.out.println("수정완료");
				return;
				

			}	
		}
				System.out.println("학생이 존재하지 않습니다.");
		
	}

	@Override
	public void delStd(Scanner scan) {
		System.out.println("학생명 >");
		String name =scan.next();
		boolean result = list.remove(new Student(name));
		if(!result) {
			System.out.println("학생이 없습니다.");
			return;
		}
		System.out.println("학생 삭제 완료");
	
	}
		
		

	@Override
	public void searchStd(Scanner scan) {
		
		System.out.println("학생 검색 >");
		String name =scan.next();
		if(list.contains(new Student(name))) {
			for(Student s : list ) {
				if(s.getName().equals(name)) {
					s.printOne();
					return;
				}
			}
			System.out.println("검색된 학생이 없습니다.");
		}
		
	}

	@Override
	public void addSub(Scanner scan) {
		System.out.println("학생이름 입력 >");
		String name =scan.next();
		System.out.println("과목 입력 >");
		String sub=scan.next();
		System.out.println("점수 입력 >");
		int score =scan.nextInt();
		
		for(int i =0; i < list.size(); i++) {
			if( list.get(i).getName().equals(name)) {
				list.get(i).addSubject(sub, score);
				System.out.println("점수추가 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
		
		
		
		
	}

	@Override
	public void modSub(Scanner scan) {
		System.out.println("학생이름 입력 >");
		String name =scan.next();
		System.out.println("과목 입력 >");
		String sub=scan.next();
		System.out.println("점수 입력 >");
		int score =scan.nextInt();
		
		for(int i =0; i < list.size(); i++) {
			if( list.get(i).getName().equals(name)) {
				//list.get(i).delSubjecct(sub); //삭제 후
				//map이라서 중복 불가능 . 그냥 add해도 덮어씀
				list.get(i).addSubject(sub, score); //추가
				System.out.println("점수추가 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
		
		
				
		}
	


	@Override
	public void delSub(Scanner scan) {
	System.out.println("학생이름 입력 >");
	String name =scan.next();
	System.out.println("과목 입력");
	String sub =scan.next();
	for(int i =0; i < list.size(); i++) {
		if( list.get(i).getName().equals(name)) {
			list.get(i).delSubjecct(sub);;
			System.out.println("점수추가 완료");
			return;
		}
	}
	System.out.println("학생이 없습니다.");
		
		
		
	}
	//학생 리스트 생성후 program에 있는 메서드 구현
	
	@Override
	public void prinStd() {
		System.out.println("---학생정보---");
		
		for(int i =0; i <list.size(); i++) {
			list.get(i).printOne();
			
		}
	}





	
}
