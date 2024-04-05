package day11;

public class Class04 {

	public static void main(String[] args) {
		/* Tv클래스 생성
		 * 멤버변수 : brand , power , ch ,vol
		 * 메서드 : 
		 * power()
		 * power가 켜지면 "TV가 켜졌습니다. "꺼지면 "Tv가 꺼졌습니다."
		 * 
		 * chUp() : 1씩 증가 ch은 20까지 있음. 20이 넘어가면 다시 0번으로 순환구조
		 * chDown() : 1씩 감소 ch은 20까지 있음. up처럼 순환구조
		 * 
		 * volUp() / volDown : 1씩증가 / 1씩 감소
		 * vol은 10까지 있음. 10이 넘으면  10, 0이면 음소거라고 출력
		 * 
		 * 
		 * 
		 */
		Tv t =new Tv();
		//t.setBrand("LG");
		t.print();
		t.power();
		t.power();
		t.power();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.print();
		t.power();
	
		

	}

	
}

class  Tv {
	private  final String  BRAND ="LG" ;//final은 변경할 수 없는 값을 지정 / 대문자로
	private boolean  power; //false
	private int  vol; //0
	private int ch; //0
	
	public Tv() {
		this.vol=3;
	}
	
	public void power(){
		power = !power;
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
		
	}
	public void volUp() {
		
		if(power) {
			if(vol >= 10) {
				vol=10;
				System.out.println("최대 음량입니다.");
			}else  {
				vol+=1;
				System.out.println("현재 음량 :"+vol);
			}
			print();
		}			
	}
	
	public void volDown() {
		
		if(power) {
		if(vol <= 0) {
			vol=0;
			System.out.println("음소거");
		}else  {
			vol-=1;
			System.out.println("현재 음량 :"+vol);
		}
				print();
			}
	}
	
	public void print() {
		System.out.println("TV brand :" +BRAND +"ch :"+ch+"vol :" +vol);
	}
	
	
	public void chUp() {
		
			if(ch >= 20) {
				ch=-1;
			}else {
				ch+=1;
				System.out.println("현재 채널 :"+ch);
				
			}
			print();
		}
	
	public void chDown() {
		
			if(ch < 0) {
				System.out.println("현재 채널 :"+ch);
				ch=20;
			}else {
				ch-=1;
			}
			print();
		}
	
	public String getBrand() {
		return BRAND;
	}
//	public void setBrand(String brand) {
//		this.BRAND = brand;
	//}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	
	
	
}
	
