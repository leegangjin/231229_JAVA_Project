package day15;


public class Customer {
/*  일반 고객 / gold고객(할인)  /vip고객(할인)
 *  고객은 customer 상속 
 *  고객 ID : int customerID
 *  고객이름 : String customerName
 *  고객등급 : String customerGrade
 *  보너스포인트 : int bonusPoint
 *  보너스 적립비율: double bonusRatio
 *  
 *  클래스 생성
 *  -기본customerGrade ="silver"
 *  -bonusRatio =0.01 => 1% 적립
 *  
 *  -메서드
 *  1.보너스를 적립 계산 메서드(메서드명 : calcPrice(int price)
 *  => 구매 금액을 주고 적립 보너스를 계산 bonusPoint에 누적
 *  => 보너스 적립, 할인여부를 체크해서 구매 price 리턴
 *  
 *  2.출력메서드(메서드 명 : customerInfo())
 *  =>홍길동님 등급은 VIP이며,보너스 포인트는 1000입니다.
 *    전담 상담사 번호는 1111입니다.
 *  
 *  -SILVER 등급
 *  =>제품을 구매할때 할인이 X , 보너스 포인트 1% 적립
 *  
 *  -GOLD 등급
 *  =>제품을 구매할때 10%할인 , 보너스 포인트 2% 적립
 *  
 *  -VIP 등급
 *  =>제품을 구매할때 10% 할인 , 보너스 포인트 5% 적립
 *  =>전담 상담사를 멤버변수에 추가(int agentID)
 *  
 *  
 *  GoldCustomer extends Customer{
 *   기본 메서드를 오버라이딩 해서 사용
 *  }
 *  VIPCustomer extends Customer{
 *   기본 메서드를 오버라이딩 해서 사용
 *  }
 *  CustomerMain 클래스에서 확인
 *  
 *  
 */
	
	//멤버변수 선언
          protected	int customerID; //고객아이디
	      protected String customerName; //고객이름
	      protected String customerGrade; //고객등급
	      protected int bonusPoint; //보너스포인트
	      protected double bonusRatio; //보너스적립비용
	      private int agentID; //전담상담사 
	
	public int getAgentID() {
			return agentID;
		}

		public void setAgentID(int agentID) {
			this.agentID = agentID;
		}

		//생성자
	     public Customer() {}
	     
	     public Customer (int customerID,String customerName) {
	    	 this.customerID=customerID;
	    	 this.customerName=customerName;
	    	 customerGrade="SILVER";
	    	 bonusRatio=0.01;
	    	 
	     }
	     public Customer(String customerGrade,int bonusPoint,double bonusRatio) {
	    	 this.bonusPoint=bonusPoint;
	    	this .customerGrade=customerGrade;
	    	 this.bonusRatio=bonusRatio;
	     }

		public int getCustomerID() {
			return customerID;
		}

		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerGrade() {
			return customerGrade;
		}

		public void setCustomerGrade(String customerGrade) {
			this.customerGrade = customerGrade;
		}

		public int getBonusPoint() {
			return bonusPoint;
		}

		public void setBonusPoint(int bonusPoint) {
			
			this.bonusPoint = bonusPoint;
		}

		public double getBonusRatio() {
			return bonusRatio;
		}

		public void setBonusRatio(double bonusRatio) {
			bonusRatio=0.01;
			this.bonusRatio = bonusRatio;
			
		}
		
	
	//메서드
		
		public int calcPrice(int price) {
			 
			 bonusPoint =bonusPoint+(int)(price*bonusRatio);
			
			 return price; //실버등급은 할인이 없음
		}

		public void customerInfo() { //출력메서드
			System.out.println(customerName+"님 등급은"+customerGrade+"이며, 보너스포인트는 " +bonusPoint+"입니다.");

			}

		@Override
		public String toString() {
			return "Customer [고객아이디=" + customerID + ", 고객이름=" + customerName + ", customerGrade="
					+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + ", agentID="
					+ agentID + "]";
		}
	
	//toString
	
	
	
	
}
