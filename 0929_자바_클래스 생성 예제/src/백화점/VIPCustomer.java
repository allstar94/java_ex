package πÈ»≠¡°;

public class VIPCustomer extends Customer {
	private int agentID;
	
	public VIPCustomer(int ID, String Name, int agent_ID){
		super.customerID = ID;
		super.customerName = Name;
		super.bonusRatio = 0.05;
		this.agentID = agent_ID;
		super.customerGrade = "VIP";
	}

	public int calcPrice(int price) {
		super.bonusPoint += price*super.bonusRatio; 
		return (int) (price*0.9);
	}
}
