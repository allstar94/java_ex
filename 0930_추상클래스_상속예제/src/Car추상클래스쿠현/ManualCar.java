package Car�߻�Ŭ��������;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
	}

	@Override
	public void controlwiper() {
		System.out.println("����� ������ �����⸦ �����մϴ�.");		
	}
}
