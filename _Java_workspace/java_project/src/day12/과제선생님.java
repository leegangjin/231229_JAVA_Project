package day12;
/* -학생 정보를 관리하기 위한 클래스
 * -학생 기본정보 : 이름 , 생년월일 , 전화번호 , 나이
 * -학원 정보 : 학원명 ="EZEN"(final static),지점
 * -수강 정보 : 수강과목 , 기간
 * => 여러과목을 들을 수 있음(여러과목 수강하기 위해서는 배열로 처리 5과목 까지 가능)
 * 
 * ex)홍길동 000101 010-1111-1111 25살
 *           EZEN(인천)
 *           자바 6개월,파이썬 1개월 , 빅데이터 3개월
 *           
 *  기능(메서드)
 *  -학생기본정보를 출력하는 기능
 *  -학원정보를 출력하는 기능
 *  -수강정보를 출력하는 기능
 *  -학생의 수강정보를 추가하는 기능        
*/ 
public class 과제선생님 {

	public static void main(String[] args) {
		
		Student1 st =new Student1();
		st.setName("홍길동");
		st.setPhone("010-1239-2345");
		st.pringInfo();
		st.printCompany();
		st.printCourse();
		
		Student1 st1 =new Student1("hong","010-1111-1111","인천");
		st1.pringInfo();
		st1.printCompany();
		st1.insertCourse("java", "5");
		st1.insertCourse("html", "3");
		st1.printCourse();
		Student1 st2 =new Student1("pack","000101","0101-3333-3333",25,"인천");
		st2.pringInfo();
		st2.printCompany();
		st2.insertCourse("java", "5");
		st2.printCourse();
		
		//5명추가 총 8명 생성
		Student1 st3 =new Student1("철수","990101","010-2323-4215",26,"대전");
		st3.pringInfo();
		st3.printCompany();
		st3.insertCourse("c", "3");
		st3.printCourse();
		System.out.println();
		Student1 st4 =new Student1("영희","880926","010-9291-2314",37,"계양");
		st4.pringInfo();
		st4.printCompany();
		st4.insertCourse("java", "3");
		st4.printCourse();
		System.out.println();
		Student1 st5 =new Student1();
		st5.pringInfo();
		st5.printCompany();
		st5.insertCourse("캐드", "3");
		st5.printCourse();
		System.out.println();
		Student1 st6 =new Student1();
		st6.pringInfo();
		st6.printCompany();
		st6.insertCourse("java", "3");
		st6.printCourse();
		System.out.println();
		Student1 st7 =new Student1();
		st7.pringInfo();
		st7.printCompany();
		st7.insertCourse("영어", "3");
		st7.printCourse();
		Student1 [] std=new Student1[8];
		std[0]=st;
		std[1]=st1;
		std[2]=st2;
		std[3]=st3;
		std[4]=st4;
		std[5]=st5;
		std[6]=st6;
		std[7]=st7;
		
		System.out.println("--------------------------");
		String searchName  ="hong";
		//hong 학생의 학생정보 , 학원벙보 , 수강정보를 출력
		
		//인천지점의 학생들을 모두 검색하여 학생정보만 출력
		
		//java과목을 수강하는 학생들만 검색하여 학생정보/학원정보 출력
		int cnt =0;
		System.out.println(searchName+"의 검색정보---");
		for(int i=0; i < std.length; i++) {
			if(searchName.equals(std[i].getName())) {
				std[i].pringInfo();
				std[i].printCompany();
				std[i].printCourse();
			}
		}
		System.out.println("-----------------");
		String gi ="인천";
		System.out.println(gi+"의 검색정보---");
		for(int i=0; i < std.length; i++) {
			
			if(gi.equals(std[i].getBranch())) {
				if(std[i].getBranch()!=null)
				std[i].pringInfo();
			}
		}
		
     System.out.println("-----------------");
		String sugang ="java";
		System.out.println(sugang+"의 수강학생 정보---");
		int cnk =0; //학생의 번지
		while(cnk < std.length) {
			for(int i=0; i <std[cnk].getCourse().length; i++) {
				if(std[cnk].getCourse()[i]!=null) {
					if(sugang.equals(std[cnk].getCourse()[i])) {
						std[cnk].printCompany();
						std[cnk].pringInfo();
						std[cnk].printCourse();
					}
				}
			}
			cnk++;
		}
	}

}
class Student1{
	//멤버변수 선언
	private String name; //이름
	private String birth; //생일
	private String phone; //폰번호
	private int age; //나이
	private final static String COMPANY="EZEN"; //final은 대문자로 변수명 처리  //학원이름
	private String branch; //지점
	private String[] course =new String[5]; //수강과목
	private String[] period =new String[5]; //수강기간
	private int cnt; //배열의 index 처리용 번지
	
	//생성자
	public Student1() {}
	
	public Student1(String name, String phone , String branch) {
		this.name =name;
		this.phone =phone;
		this.branch =branch;
	}
	public Student1(String name,String birth, String phone,int age ,String branch) {
		this(name,phone,branch); //생성자 호출
		this.age=age;
		this.birth=birth;
	}
	
	
		//method 
	public void pringInfo() {//학생의 기본정보 출력
		System.out.println("---학생정보---");
		System.out.println("이름:"+name+"("+age+"세"+birth +") /"+phone);
	}
	public void printCompany() {
		System.out.println("==학원정보==");
		System.out.println("학원명:"+COMPANY+"/"+branch+"지점");
	}
 //수강정보출력
	public void printCourse() {
		if(course.length==0||cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return; //여기서 메서드 종료
		}
		//cnt까지만 출력 => 추가되지않은 값은 출력 x
		for(int i=0; i<cnt; i++) {
			System.out.println("과정:"+course[i]+"("+period[i]+"개월)");
		}
	}
	
	//수강정보 등록
	//insertCouse()
	//매개변수 course,period 주고 => 배열에 추가(배열을 완성 /리턴되는 값은 없음.)
	public void insertCourse(String course , String period) {
		//cnt =0 => 아직 추가한적 없음.
		if(cnt >=5) {
			//배여를 더 늘려 더 많은 수강을 받을 수도 있음. (배열복사)
			System.out.println("더이상 수강할수 없습니다.");
			return;
		}
		this.course[cnt] =course;
		this.period[cnt] =period;
		cnt++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
}
