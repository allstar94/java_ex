package Car�߻�Ŭ��������;

public class AICar extends Car {
	
	public AICar() {}

	@Override
	public void drive() {
		System.out.println("���� ���� �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� ������ ���� ��ȯ�մϴ�.");
	}

	@Override
	public void controlwiper() {
		System.out.println("�� ���� �翡 ���� ������ �����Ⱑ �ڵ����� �����˴ϴ�.");		
	}
}
