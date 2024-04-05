package day15;

public class CustomerMain {

	public static void main(String[] args) {
		Customer[] customerList =new Customer[10];
		Customer ct =new Customer(1001,"김노아");
		Customer gd =new GOLD(1002,"김치치");
		Customer vv =new VIP(1003,"노아킴",1111);
		
		int cnt=0;
		customerList[cnt]=ct;
		cnt++;
		customerList[cnt]=gd;
		cnt++;
		customerList[cnt]=vv;
		cnt++;
		customerList[cnt]=new Customer(1004,"영이");
		cnt++;
		customerList[cnt]=new GOLD(1005,"순이");
		cnt++;
		customerList[cnt]=new VIP(1006,"철이",1023);
		cnt++;
		customerList[cnt]=new VIP(1007,"빠뽀",1111);
		cnt++;
		
		System.out.println("--할인율과 포인트 계산--");
		int price =100000;
		for(int i=0; i < cnt; i++) {
			int saleprice=customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()
					+"님의 지불금액은"+saleprice+" / "
					+"보너스 포인트"+ customerList[i].getBonusPoint());
		}
		System.out.println("------------");
		for(int i=0; i < cnt; i++) {
			Customer c =customerList[i];
			if(c instanceof VIP) {
				VIP vip =(VIP)c;
				if(vip.getAgentID()==1111) {
					vip.setAgentID(3333);
				}
		}
				
}
		System.out.println("--고객 정보 출력---");
		for(int i=0; i <cnt; i++) {
			customerList[i].customerInfo();
		}
		
		
		
		//agentID =1111 => 3333변경
		
		
		//다운케스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		//자식 고유의 멤버변수나 메서드를 호출하고자 할 때 사용
		//다운케스팅 : 반드시 명시적으로 형변환 해야힘.
		//instanceof : 객체의 형이 맞는 체크하는 명령어 true /false
		
//		int price = ct.calcPrice(10000);
//		System.out.println("지불금액: "+price);
//		ct.customerInfo();
//		
//		System.out.println("지불금액 :" +gd.calcPrice(10000));
//		gd.customerInfo();
//		
//		System.out.println("지불금액 : "+vv.calcPrice(10000));
//		vv.customerInfo();
//		

	}

}
