package �����÷��̾��;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("õõ�� �޸���.");
	}

	@Override
	public void jump() {
		System.out.println("���� �����Ѵ�");
		
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ����");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("<<����� �����Դϴ�.>>");
		
	}
}
