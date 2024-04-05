package day_07;

public class StringEX_01 {

	public static void main(String[] args) {
		/* file에 저장되어 있는 문자를 파일명과 확장자로 분리하여 출력
		 * 파일명 : 이것이자바다
		 * 확장자 : java
		 * 
		 */
		
		String file = " 이것이 자바다.java";
		int file1 = file.indexOf(".");  //"." 의 번지수는  8
		String file2 = file.substring(0, file1);
		String file3 = file.substring(file1+1);
		
		System.out.println("파일명 :" + file2);
		System.out.println("확장자 :" + file3);
		
		
		
		

	}

}
