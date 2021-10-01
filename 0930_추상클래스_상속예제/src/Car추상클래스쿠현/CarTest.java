package Car추상클래스쿠현;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("<<< 자율주행 자동차 테스트>>>");
		Car myCar = new AICar();
		myCar.run();
		System.out.println();
		
		System.out.println("<<< 사람이 운전하는 일반 동차 테스트>>");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
