package std;

import java.util.Scanner;

public interface stdProgram {
	
	void prinStd(); //학생정보출력
	void addStd(Scanner scan); //학생 추가
	void modStd(Scanner scan); //학생정보수정
	void delStd(Scanner scan); //학생삭제
	void searchStd(Scanner scan); //학생 검색
	
	void addSub(Scanner scan); //점수추가
	void modSub(Scanner scan); //점수 수정
	void delSub(Scanner scan); //점수 삭제

}
