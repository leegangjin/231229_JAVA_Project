package day12;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Student sc= new Student("노아 ","010-9327-2137","000111",25,"인천");
		    sc.printperson();
		    System.out.println();
		    sc.printhak();
		    System.out.println();
		    sc.addgroup("java",6);
		    sc.addgroup("html",3);
		    sc.addgroup("c",1);
		    sc.addgroup("파이썬",2);
		    sc.addgroup("캐드",4);
		    sc.printsub();
		    System.out.println();
		    sc.addgroup("c#", 5);
		    
	}
}


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






class Student{
	private String name;
	private String birth;
	private String num;
	private String[] group=new String[5];
	private String gigum;
	private int age;
	private int month[]=new int[5];
	private final static String  HAK ="EZEN";
	private int add =0;
	public Student(String name, String num, String birth, int age ,String gigum) {
		
		this.name=name;
		this.num=num;
		this.age=age;
		this.birth=birth;
		this.gigum=gigum;
		
	}
    public void addgroup(String group,int month) {
    	if(add < 5) {
    		this.group[add]=group;
    		this.month[add]=month;
    	add++;
    	}else {
    		System.out.println("추가불가");
    	}
    }	


	public String getGigum() {
		return gigum;
	}



	public int[] getMonth() {
		return month;
	}



	public void setGigum(String gigum) {
		this.gigum = gigum;
	}



	public void setMonth(int[] month) {
		this.month = month;
	}



	public String getName() {
		return name;
	}

	public String getBirth() {
		return birth;
	}

	public String getNum() {
		return num;
	}

	public int getAge() {
		return age;
	}

	

	public String getHAK() {
		return HAK;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	
	public String toString() {
		return HAK +gigum+">"+"("+name +num+birth+")"+group;
		
	}
	public void printperson() {
	
		System.out.println("학생이름:"+name+" 생년월일 : "+birth+" 전화번호 : "+num+" 나이 :" +age);
	}
	public void printhak() {
		System.out.println("학원이름 :"+ HAK +"("+gigum +")");
	}
	public void printsub() {
		for(int i =0; i< add; i++) {
		System.out.println("수강과목: "+group[i]+"/"+" 수강기간:"+ month[i] +"개월");
	}
}
}
