package day20;

public class Customer {
	private String name;
	private int age;
	private int price;
	
 public Customer() {}
 

public void setPrice(int price) {
	this.price = price;
}


public int getPrice() {
	return price;
}


public Customer(String name, int age) {
	 this.name=name;
	 this.age=age;
	 this.price= (age >=15)? 100 : 50 ;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "customer [이름=" + name + ", 나이=" + age + "세]";
}
//    @Override
//     public int compareTo(Customer o) {
//    	
//     return o1.get.name().compareTo(o2.getName());
//}
 
 
 
 
}
