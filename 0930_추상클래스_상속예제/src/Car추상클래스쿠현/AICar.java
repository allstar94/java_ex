package Car추상클래스쿠현;

public class AICar extends Car {
	
	public AICar() {}

	@Override
	public void drive() {
		System.out.println("자율 주행 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 방향 전환합니다.");
	}

	@Override
	public void controlwiper() {
		System.out.println("비나 눈의 양에 따라 와이퍼 빠르기가 자동으로 조절됩니다.");		
	}
}
