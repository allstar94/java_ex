package 백화점;

public class CustomerTest {

	
	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "kim"); 
		VIPCustomer customer2 = new VIPCustomer(2, "Lee", 33);
		GoldCustomer customer3 = new GoldCustomer(3, "park");
		
	
		int price1 = customer1.calcPrice(1000000);
		int price2 = customer2.calcPrice(1000000);
		int price3 = customer3.calcPrice(1000000);
		String amount1 = Utils.toNumberFormat(price1);
		String amount2 = Utils.toNumberFormat(price2);
		String amount3 = Utils.toNumberFormat(price3);
		
		
		System.out.println("일반"+amount1+"VIP"+amount2+"Gold"+amount3);

		System.out.println("일반"+customer1.bonusPoint+"VIP"+customer2.bonusPoint+"Gold"+customer3.bonusPoint);

		System.out.println(customer1.showCustomerInfo());
		System.out.println(customer2.showCustomerInfo());
		System.out.println(customer3.showCustomerInfo());
	}

}
