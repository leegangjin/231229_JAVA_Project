package ddddddddd;


public class CardPack2 {
	int arr[] = new int[52] ; 
	private card2[] pack =new card2[52];
	private int cnt=0; 
	
	public CardPack2() {
		char shape = '♥';
		for(int i =1; i <=4; i++) { 
			
			switch(i) {
			case 1: shape ='♥'; break;
			case 2: shape ='◆'; break;
			case 3: shape ='♣'; break;
			case 4: shape ='♠'; break;
			}
			for(int j=1; j <=13; j++) { 
				card2 c =new card2(); 
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] =c;
				cnt++;
			}
		}
		
			
 }
	
	public void shuffle(){
		for(int i =0;  i < pack.length; i++) {
			 int random =(int)(Math.random()*pack.length-1)+0;
	    	   card2 temp =pack[i];
	    	   pack[i] = pack[random];
	    	   pack[random] = temp;
		}
	}
	
	public card2 pick() {
	cnt--;
		return pack[cnt];
	}

	public void init() {
		cnt=52;
	}
	
	public card2[] getPack() {
		return pack;
	}

	public void setPack(card2[] pack) {
		this.pack = pack;
	}
	
}
	
