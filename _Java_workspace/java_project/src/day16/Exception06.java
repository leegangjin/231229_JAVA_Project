package day16;

public class Exception06 {

	public static void main(String[] args) {
		// 메서드에서 생성된 배열 출력
		int start =1,count=7,size=5;
		int arr[]= new int[5];
		
		int arr1[] =aaa(start, count, size);
		for(int a : arr) {
			System.out.print(a+" ");
		}System.out.println();
		
		bbb(arr1, start, count);

	}
//메서드 생성
	/* 기능 :size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여 
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 매개변수 입력 start(시작값) , count(개수)
	 * 
	 * -size가 0보다 작다면 예외발생
	 * -count개수가 0보다 작다면 예외발생
	 */

	
	public  static int[] aaa (int start,int count,int size) throws RuntimeException{
		if(size<=0||count <=0) {
			throw new RuntimeException("size나 count는 음수가 될수 없습니다.");
		}
		
		int arr[] =new int[size];
	  for(int i=0; i < size; i++) {
		  int random= (int)(Math.random()*count)+start;
		  
		  arr[i]=random;
	  }
		return arr;
		
	}

	
	//메서드 생성
	/* 기능: 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * 
	 * -배열이 null이면 예외발생
	 * -배열의 길이가 0보다 작다면 예외발생
	 */
	
	public  static void  bbb(int arr[],int start,int count) throws RuntimeException{
		try {
			for(int i=0; i < arr.length; i++ ) { 
				arr[i]=(int)(Math.random()*count)+start;
				System.out.print(arr[i]+" ");
			}
		} catch (NullPointerException e) {
			System.out.println("null이 될수 없습니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 넘어섰습니다.");
		}
		
	}
	
	
}
