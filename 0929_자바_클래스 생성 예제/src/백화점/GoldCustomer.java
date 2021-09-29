package πÈ»≠¡°;

public class GoldCustomer extends Customer {

	
	public  GoldCustomer(int ID, String Name){
		super.customerID = ID;
		super.customerName = Name;
		super.bonusRatio = 0.02;
		super.customerGrade = "Gold";

	}
	public int calcPrice(int price) {
		super.bonusPoint += price*super.bonusRatio; 
		return (int) (price*0.9);
	}

}
