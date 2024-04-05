package sale;

public class order extends Sale<String, Integer>{
	//주문객체
	//주문을 하려면 (메뉴명 ,가격) ,수량 ,합계 (가격*수량)
	//(메뉴명,가격) : 상속받은 객체의 값 super
	//수량, 합계 : order만 가지고 있는 내 객체 => this
 	private int count;//수량
	private int total;  //( 가격*수량)
	
	public order() {}
	
	public order(String menu, int price,int count, int total) {
		super(menu,price);
		super.menu=menu;
		super.price=price;
		this.count=count;
		this.total=price*count;
	}
	
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "order [count=" + count + ", total=" + total + "]";
	}

	public void orderPrint() {
		System.out.println("주문 내역");
			System.out.println("---전체 주문내역---");
			System.out.println(super.getMenu()+":"+super.getPrice()+"  /  ");
			System.out.println(count+"개 주문 => 금액 : "+total);
		}

}
