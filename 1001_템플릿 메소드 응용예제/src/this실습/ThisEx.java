package this�ǽ�;


class Person{
	private int juminNum;
	private int militarNum;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	
	//������
	public Person(int juminNum,int militaryNum, int bYear, int bMonth, int bDay) {
		this.juminNum = juminNum;
		this.militarNum = militarNum;
		birthYear= bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}
	public Person(int juminNum, int bYear, int bMonth, int bDay) {
		this(juminNum,0,bYear,bMonth,bDay);
//		this.juminNum = juminNum;
//		this.militarNum = 0;
//		birthYear= bYear;
//		birthMonth = bMonth;
//		birthDay = bDay;
	}
	
	public void showInfo() {
		System.out.println("�ֹι�ȣ: "+ juminNum);
		System.out.println("�������: "+ birthYear + "/" + birthMonth + "/" + birthDay);
		
		if(militarNum != 0) {
			System.out.println("����: "+ militarNum + "\n");
		}else {
			System.out.println("���� ���� ����.");
		}
		
	}
	
}

public class ThisEx {
	public static void main(String[] args) {
		Person man = new Person(961214,157601,880102, 12,14);
		Person woman = new Person(990816,880101,13,15);
	}
}
