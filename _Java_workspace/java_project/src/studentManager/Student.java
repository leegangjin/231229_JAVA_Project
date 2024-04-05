package studentManager;
public class Student{
	//멤버변수 선언
	private String name; //이름
    private String phone; //폰번호
    private int age;//나이
    private String address; //주소
    private String cord; //학번
    private String subname; //과목이름
    
     Subject[] subject =new Subject[5]; //수강과목
    private int cnt; 

	public Student() {}


	public void printsub() {//수강과목 출력  메서드
	    if(subject.length==0||cnt==0) {
	    	System.out.println("수강과목이 없습니다.");
	      return;
	    }
	    for(int i=0; i< cnt; i++) {
	    	System.out.println("과정:"+subject[i]);
	    }
	   }
	    public void insertsub(Subject name ) { //수강과목 등록 메서드
			if(cnt < subject.length) {
				subject[cnt] = name;
				cnt++;
			}else if(cnt >subject.length) {
				System.out.println("더이상 추가 하실수 없습니다.");
			}
		}
	    public void delsub(String subname) { //수강과목 삭제 메서드
	    for(int i=0; i < cnt; i++) {
	    	if(subject[i].getSubname().equals(subname)) {
	    		for(int j=0; j <cnt-1; j++) {
	    			subject[j]=subject[j+1];
	    		}
	    	}cnt--;
	    	break;
	    	
	    }
	   
	    

	   }
	    public void printInfo() { //학생정보 출력 메서드
	    	System.out.println("---학생정보---");
	    	System.out.println("이름:"+name+ "/ 학번: "+cord+" /나이:"+age+"세"+" /번호:"+phone);
	    	System.out.println("주소:"+address);
	    }

	public String getSubname() {
		return subname;
	}



	public void setSubname(String subname) {
		this.subname = subname;
	}



	public Student(String cord,String name,String phone,String address,int age) {
    	this.address=address;
    	this.name=name;
    	this.cord=cord;
    	this.phone=phone;
    	this.age=age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCord() {
		return cord;
	}

	public void setCord(String cord) {
		this.cord = cord;
	}


	public String toString() {
		return "이름:"+name+" /학번:"+cord+" /나이:"+age+" /번호:"+phone+" /주소:"+address;
		
	}
}



