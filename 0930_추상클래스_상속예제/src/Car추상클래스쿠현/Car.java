package Car추상클래스쿠현;

public abstract class Car {
	//추상 메소드
	public abstract void drive();
	public abstract void stop();
	public abstract void controlwiper();
	
	public Car() {}
	
	public void startCar() {
		System.out.println("시동을 켜니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	//템플릿 메소드는 final 예약어를 사용해 선언한다. '틀'이 있는 메소드 의미
	final public void run() {
		startCar();
		drive();
		stop();
		controlwiper();
		turnOff();
	}
	
}
