package sale;

public class Sale <K,V> {
	protected K menu; //메뉴
	protected V price; //가격
	
	

	

	@Override
	public String toString() {
		return "Sale [menu=" + menu + ", price=" + price + "]";
	}

	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}

	public Sale () {}
	
	public Sale(K menu, V price) {
		this.menu=menu;
		this.price=price;
	}

}
