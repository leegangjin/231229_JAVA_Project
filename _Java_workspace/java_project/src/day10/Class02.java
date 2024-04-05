package day10;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setName("스파크");
		c.setColor("빨강색");
		c.setYear("2024");
		c.print();
		c.power();
		System.out.println("my Car Power:"+(c.isPower()? "on":"off"));
		c.power();
		System.out.println("my Car Power:"+(c.isPower()? "on":"off"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("my car speed:"+c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		System.out.println("my car speed:"+c.getSpeed());
		
		Car c2 = new Car();
		c2.setName("그렌저");
		c2.setColor("검정");
		c2.setYear("2003");
		c2.print();
		c2.power();
		System.out.println("Car2 Power:"+(c2.isPower()? "on":"off"));
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		System.out.println("car2 speed:"+c2.getSpeed());

	}	

}

class Car{ //클래스명은 대문자 시작
	//멤버변수 = private
	//메서드 = public  => getter / setter 메서드
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	
	//power()
	//꺼져있을경우 => 켜짐
	//켜져있을경우 => 꺼짐
	public void power() {
		power =!power;
	}
	
	//speedUP()
	public void speedUp() {
		if(speed <=300) {
			speed =300;
		} else {
		speed +=10;
	   }
	}
	//speedDown()
	public void speedDown() {
		if(speed <=0) {
			speed=0;
		}else {
		speed -=10;
		}
	}
	
	//print()
	public void print() {
		System.out.println("myCar"+name+"/"+color+"("+year+")");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isPower() { //boolean 일떄만 is
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}