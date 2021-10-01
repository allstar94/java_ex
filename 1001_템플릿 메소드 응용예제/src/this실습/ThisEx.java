package this실습;


class Person{
	private int juminNum;
	private int militarNum;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	
	//생성자
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
		System.out.println("주민번호: "+ juminNum);
		System.out.println("생년월일: "+ birthYear + "/" + birthMonth + "/" + birthDay);
		
		if(militarNum != 0) {
			System.out.println("군번: "+ militarNum + "\n");
		}else {
			System.out.println("군과 관계 없음.");
		}
		
	}
	
}

public class ThisEx {
	public static void main(String[] args) {
		Person man = new Person(961214,157601,880102, 12,14);
		Person woman = new Person(990816,880101,13,15);
	}
}
