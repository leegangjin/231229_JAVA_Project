package day11;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c = new Card();
//		c.setShape('*');
//		c.setNum(11);
//		c.print();
//		c.setShape('&');
//		c.setNum(12);
//		c.print();
//		c.setShape('*');
//		c.setNum(13);
//		c.print();
//		c.setShape('*');
//		c.setNum(14);
//		c.print();
//		c.setShape('♣');
//		c.setNum(13);
//		c.print();
		
		CardPack cp =new CardPack(); //52장의 카드가 모두 생성됨.
		cp.shuffle();
		int cnt=0;
		for(int i =0; i <4; i++) {
			for(int j=0; j <13; j++) {
				cp.getPack()[cnt].print();
				
				//cp.getPack() : CardPack 클래스 안에 있는 pack[]
				//cp.getPack()[cnt] : pack[0] => Card (멤버변수, 메서드 )
				cnt++;
		
			}
			System.out.println();
			
		}
		System.out.println();
		cp.pick().print();
		System.out.println();
		cp.pick().print();
		System.out.println();
		cp.pick().print();

	}
}

