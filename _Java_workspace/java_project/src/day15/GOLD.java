package day15;

public class GOLD  extends Customer{
//gold / vop만 할인율 존재
	private double saleRatio;
	public GOLD () {}
	public GOLD(int id, String name) {
		super(id,name);
		customerGrade="GOLD";
		bonusRatio=0.02;
		saleRatio=0.1;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price*bonusRatio);
		price =price -(int)(price*saleRatio);
		return (price);
	}
	
	

	
	
	
}
