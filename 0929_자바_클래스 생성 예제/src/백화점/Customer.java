package πÈ»≠¡°;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() {}
	
	public Customer(int ID, String Name){
		customerID = ID;
		customerName = Name;
		bonusRatio = 0.01;
		customerGrade = "General";
	}
		
	
	public String showCustomerInfo(){
		return customerName +" " +customerGrade;
	}
	
	public int calcPrice(int price) {
		return price;
	}
	
}
