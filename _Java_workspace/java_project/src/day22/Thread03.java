package day22;


class MThread extends Thread{
   int  start;
   int end;
   int total;
   
   public MThread(int start, int end) {
	   this.end=end;
	   this.start=start;
   }
   
	@Override
	public void run() {
		for(int i=start; i <=end; i++) {
			this.total+=i;
		}
		//System.out.println(start+"~"+end+"까지의 합: "+total);
	}
	
	
}
public class Thread03 {

	public static void main(String[] args) {
		/* 1~50 , 51~100 까지의 합을 구하는 두개의 Thread를 생성
		 * 그 결과를 확인
		 * 
		 * 두개의 Thread가 실행되고 난후
		 * tread1 1~50 까지의 합계 출력
		 * thread2 51~100까지의 합계 출력
		 * thread1 + thread2의 합계 출력
		 * 
		 */
		MThread th2 = new MThread(1,50);
		MThread th3 = new MThread(51,100);
		th2.start();
		th3.start();
		try {
			th2.join();
			Thread.sleep(500); //0.5초 기다렸다가 실행.
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("th2 total => "+ th2.total);
		System.out.println("th3 total => "+ th3.total);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		int lasttotal =th2.total+th3.total;
		System.out.println("th2 +th3"+"의 total => "+lasttotal);
		
		
   
	
	}

}
