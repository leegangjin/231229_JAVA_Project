package day21;

public class File02 {

	public static void main(String[] args) {
		//System.in 을 이용하여 알파벳 하나를 쓰고
		// 엔터를 누르면 알파벳을 콘솔에 찍기
		//
		
		System.out.println("알파벳 입력 > ");
		
		try {
			int i;
			while ((i  = System.in.read()) !='\n') {
				System.out.println((char)i);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}