package Car�߻�Ŭ��������;

public abstract class Car {
	//�߻� �޼ҵ�
	public abstract void drive();
	public abstract void stop();
	public abstract void controlwiper();
	
	public Car() {}
	
	public void startCar() {
		System.out.println("�õ��� �Ѵϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	//���ø� �޼ҵ�� final ���� ����� �����Ѵ�. 'Ʋ'�� �ִ� �޼ҵ� �ǹ�
	final public void run() {
		startCar();
		drive();
		stop();
		controlwiper();
		turnOff();
	}
	
}
