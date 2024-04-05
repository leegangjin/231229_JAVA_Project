package std;

import java.util.HashMap;
import java.util.Objects;

public class Student {
	//멤버변수 : 이름 , 나이 , 전화번호 , map(과목,점수), 합계 , 평균
	//생성자, 메서드  , getter /setter , 출력메서드 toString 가능
	//메서드 - 출력메서드 (학생정보 , 과목점수(성적표) , 합계 , 평균)
	 //과목 점수는 매니저
	//메서드- map(과목,점수)  데이터를 추가 메서드
	//메서드- map(과목,점수)  데이터를 삭제 메서드
	
	//멤버변수는 private
	//메서드는 public
	//클래스명은 대문자 변수명 메서드명은 소문지
	//변수명 메서드명 단어가 많아지면  다음 시작단어 대문자(카멜케이스 기법)
	//indent : 들여쓰기 잘 맞추기
	
	private String name; //이름
	private  String  num; //폰번호
	private int age; //나이

	private int score; //점수
	
	private HashMap<String, Integer> map =new HashMap<>();
	
	private int sum; //합계
	private double avg; //평균
	
	public Student() {}
	
	public  Student(String name) {
		this.name=name;
		this.age=15;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, avg, map, name, num, score, sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 내객체의 주소와 같다면 true 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
			return false;
		Student other = (Student) obj;
		return   Objects.equals(name, other.name); //이름만 같으면 true
				
	}

	public Student(String name,int age ,String num) {
		this.name=name;
		this.age=age;
		this.num=num;
	}
	
	//출력메서드
	public void printOne() {  //학생 1명의 정보출력
		System.out.print(name +"("+age+") / ");
		if(num != null) {
			System.out.println(num);
		}
		System.out.println();
		if(map.size() <= 0) {
			System.out.println("점수가 없습니다..");
			System.out.println("--------");
			return;
		}
		printsub();
		calC();
		System.out.println("result: "+sum+"["+avg+"]");
		System.out.println("------------");
	}
	public void printSub() { //학생의 성적표 출력 -map
		System.out.println("---------");
		for(String sub : map.keySet()) {
			System.out.println(sub +":"+map.get(sub));
		}
		System.out.println("---------");
	}
	public void calC() { //합계 평균 계산 메서드
		this.sum=0;
		this.avg=0;
		for(String sub : map.keySet()) {
			sum+= map.get(sub);
		}
		avg=(double)sum /map.size();
	}
	
	//--------------------------------


	public void addSubject(String sub, int score) { //과목추가
		map.put(sub, score);
		System.out.println("점수 추가");
	}
	public void delSubjecct(String sub) {//과목삭제
	
		if(	map.remove(sub)==null) {
			System.out.println("해당과목이 없습니다.");
			return;
		}
		map.remove(sub);
	}
		
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", age=" + age + ", score=" + score + ", sum=" + sum
				+ ", avg=" + avg + "]";
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
		
	public void addmap (String sub, int score ) { //데이터 추가
		map.put(sub,score);
		
	}
	public void delmap(String sub, int score ) { //데이터 삭제
		map.remove(sub,score);
	}
	
	public void printInfo() { //학생정보 출력메서드
		System.out.println("---학생정보---");
		System.out.println("이름 :"+name + " 나이 : "+age+"전화번호: "+num);
//		System.out.println("수강과목 : "+map.keySet());
//		System.out.println("합계:"+sum +"평균 :"+sum/map.size());
		
	}
	public void printsub() {
		
		System.out.println("수강과목 :"+map.keySet()+"점수:"+map.values());
	}
	
	

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		 
		this.avg = avg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
