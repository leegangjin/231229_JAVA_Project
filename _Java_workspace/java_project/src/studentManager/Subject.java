package studentManager;
public class Subject{
	

private int cnt;
private String subname; //수강과목이름
private int subcord ; //수강과목코드
private char sub; //학점
private String tname; //교수이름
private String sname; //학생이름
private String location; //강의장
private int subcnt;

public Subject( ) {}

public Subject(String subname, String sname) {

	this.subname = subname;
	this.sname =sname;
	this.sub=3;
	
}


public String getSubname() {
	return subname;
}

public void setSubname(String subname) {
	this.subname = subname;
	
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public int getSubcnt() {
	return subcnt;
}

public void setSubcnt(int subcnt) {
	this.subcnt = subcnt;
}



public int getCnt() {
	return cnt;
}

public void setCnt(int cnt) {
	this.cnt = cnt;
}

public String getSubjectname() {
	return subname;
}

public void setSubjectname(String subname) {
	this.subname = subname;
}

public int getSubcord() {
	return subcord;
}

public void setSubcord(int subcord) {
	this.subcord = subcord;
}

public char getSub() {
	return sub;
}

public void setSub(char sub) {
	this.sub = sub;
}



public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

    public String toString() {
		return "과목코드: "+ subcord + "/과목이름: " + subname +" /학생이름: "+ sname +"/학점: "+ sub;
    	
	}
}
