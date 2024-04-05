package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car1클래스를 통해 c객체를 생성 new 키워드를 통해 생성 Car1() 생성자에 의해 초기화 된다.
		Car1 c = new Car1(); 
		c.setName("제네시스");
		c.setColor("하양");
		c.setYear("2024");
		c.print();
		c.door();
		System.out.println("my car door:"+(c.isDoor()? "열림":"닫힘"));
		c.door();
		System.out.println("my car door:"+(c.isDoor()? "열림":"닫힘"));
		c.power();
		System.out.println("my Car Power:"+(c.isPower()? "on":"off"));
		
		c.speedUp();
		c.speedUp();
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
		System.out.println("my car speed:"+c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.power();
		c.speedUp();
		
		Car1 c2 = new Car1("소나타","2021");
		c2.print();
		Car1 c3 = new Car1("아반떼", "2020", "빨강" ,false);
		c3.print();
	
	}
	

}
//같은 패키지에서 같은 이름의 클래스를 사용하면 error
class Car1{
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	private boolean door;
	
	//생성자 위치 , 클래스 이름과 일치하여야 함. 
	public Car1( ) {
		//기본 생성자
	}
	//생성자는 여러개 만들 수 있음 (생성자 오버로딩)
	//오버로딩 조건 : 매개변수의 개수가 달라야함, 타입이 달라야함
	public Car1(String name, String year, String color , boolean door ) {
		this(name,year); //생성자 호출
		this.color =color;
		this.door= door;
		
		
		
	}
	public Car1(String name, String year) {
		this.name=name;
		this.year =year;
	}
	{ 
		//원하는 멤버변수의 값을 초기화
		color="red";
	//	door =4;
		
	}
	//멤버변수 : name, year, color , power , speed ,door(문개수)
	
	//내 차량의 정보를 출력하는 메서드(name,year,color,door)
	
	//power()
	//시동이 켜졌습니다. /시동이 꺼졌습니다.
	public void power() {
	
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
		if(power&& speed>0) {
			System.out.println("주행 중입니다.");
		}else if(!power && speed >0) {
			System.out.println("주행 중엔 시동을 끌수 없습니다.");
		}else {
			System.out.println("시동을 끕니다.");
		}
	}
	
	//speedUp/down의 기본조건 power가 켜져야한다.
	//시동이 꺼져있는 상태라면 시동이 꺼져있습니다. 시동을 켜주세요.출력
	//speedup
	//300이상이면 최고속도입니다. 출력
	//현재속도를 출력
	public void speedUp() {
		if(door) {
			System.out.println("문이 열려있습니다. 문을 닫아주세요.");
		}
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		}
		
		if(speed >=300) {
			speed =300;
			System.out.println("최고속도 입니다.");
		} else {
		speed +=10;
		
		System.out.println("현재 속도 : "+speed);
	   }
	}
	
	//speedDown
	//현재 속도가 높습니다.
	//속도가 0이되면 더이상 내려가지않음.(멈췄습니다.)
	//현재속도가 얼마인지
	public void speedDown() {
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		}
		
		if(speed <=0) {
			speed=0;
			System.out.println("멈췄습니다.");
		}else {
		speed -=10;
		System.out.println("현재 속도 : "+ speed);
		}
	}
	
	//getter //setter
	
	//door
	public void door() {
		door = !door;
		if(door) {
			System.out.println("문이 열렸습니다.");
		}else {
			System.out.println("문이 닫혔습니다.");
		}
		if(door &&speed >0) {
			System.out.println("문이 열려있습니다. 멈춰주세요.");
		}
	}
	
	//print
	public void print() {
		System.out.println("myCar "+name+"/"+color+"("+year+")");
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

	public boolean isPower() {
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

	public void getDoor(boolean door) {
		this.door=door;
	}

	public void setDoor(boolean door) {
		this.door = door;
	}
	public boolean isDoor() {
		return door;
	}
		

}