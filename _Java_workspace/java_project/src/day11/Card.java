package day11;
/* 1장의 카드를 생성하기위한 클래스
 * -숫자 :1~10 ,J(11),Q(12),K(13)
 * -모양 : ♥,◆,♣,♠
 * -한장의 카드를 출력하는 기능 print() => ♥1
 * -ex) ◆12 =>◆Q ,♠13 => ♠K, %2 => ♥2 (없는 모양 시 하트) , &15 => ♥1 (없는 숫자시 1)
 * setter에선 1~13 출력할땐 1~10 print 에서 JQK
 */
/*-클래스의 구성
 * -멤버변수 : 모양(shape), 숫자(num) => private => getter /setter 생성
 * -메서드: print()
 * -생성자 : 기본생성자만 생성 => char 지정하기 =>♥1
 * 
 */
public class Card {
	
       private int num;
     private char shape;
     
     public int getNum() {
		return num;
	}

	public char getShape() {
		return shape;
	}

	public void setNum(int num) {
		//	1~13까지만 내 숫자, 그 외는 1로 설정
		if(num < 1||num > 13) {
			this.num=1;
		}else {
			this.num =num;
		}
		//this.num = num;
	}
     //외부의 값(매개변수)으로 내부변수 (멤버변수)를 변경할 때 사용하는 메서드
	public void setShape(char shape) {
		switch(shape) {
		case '♥' :case '◆': case '♣' : case '♠':
			this.shape=shape;
			break;
			default :
				this.shape = '♥';
		}
			
		
		//this.shape = shape;
	}

	//생성자
     public Card() {
    	 this.num=1;
    	 this.shape='♥';
     }
     public void print() {
    	 System.out.print(shape);
    	 switch(num) {
    	 case 11:
    		 System.out.print("J ");
    		 break;
    	 case 12:
    		 System.out.print("Q ");
    		 break;
    	 case 13:
    		 System.out.print("K ");
    		 break;
    		 default :
    			 System.out.print(num+" ");
    	
    	 }
     }
}
