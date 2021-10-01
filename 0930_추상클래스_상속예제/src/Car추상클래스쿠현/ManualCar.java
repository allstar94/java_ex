package Car추상클래스쿠현;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}

	@Override
	public void controlwiper() {
		System.out.println("사람이 와이퍼 빠르기를 조절합니다.");		
	}
}
