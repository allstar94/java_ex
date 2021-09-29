package 클래스생성;

public class Car {
	protected int speed;
	protected String wheelNum;
	protected String carName;

	public Car() {}
	public Car(String name) {
		carName =name;
	}
	public Car(int velocity) {
		speed = velocity;
	}
	public Car(String name, int velocity) {
		carName =name;
		speed = velocity;
	}
	//사용자 정의 메소드
	public void speedUp() {
		speed = speed + 10;
	}
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
	public void speedDown() {
		speed = speed - 1;
		if(speed < 0) {
			speed = 0;
		}
	}

	public void stop() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("제너시스");
		System.out.println("마이카는 "+ myCar.carName);
		Car yourCar = new Car(120);
		System.out.println("마이카는 속도는"+ yourCar.speed);
		Car hisCar = new Car("체어맨",150);
		System.out.println("마이카는 "+ hisCar.carName + "마이카는 속도는"+ yourCar.speed);
	
	}

}
