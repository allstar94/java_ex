package Phone�߻�Ŭ��������;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("<<< ����Ʈ�� �׽�Ʈ>>>");
		phone myPhone = new smartPhone("����");
		myPhone.run();
		System.out.println();
		
		System.out.println("<<< �ڷ��� �׽�Ʈ>>");
		phone yourPhone = new TelePhone("����");
		yourPhone.run();
		System.out.println();
	}

}
