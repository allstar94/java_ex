package �������̽��ǽ�;


/*
 *  RemoteContral �������̽��� Television Ŭ������ Audio Ŭ������
 *  ������ �ִ� ��ɵ��� '�߻� �޼ҵ�'�� �����صδ� �������̽��̴�.
 */
public interface RemoteControl {
	//'����' ������ ����� ����
	//public static final ���� ����!!
	public static final int MAX_VOLUME =10; //�ִ� ���
	public static final int MIN_VOLUME = 0; //�ּҺ���

	//'�߻�޼ҵ�' ����
	//public abstract ��������
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	/*
	 * �ڹ� 8�������ʹ� '����Ʈ' �޼ҵ�� '����' �޼ҵ带 ���� �ɹ��� ���� ����!!
	 * �ڹ� ������ ���忡�� �������� �ο�!
	 */
	
	
	//'����Ʈ' �޼ҵ� ���� -> ����� ���� -> ���� interface�� Ȯ���ؼ� ���ο����� �߰��ϱ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}else {
			System.out.println("������ ���� �մϴ�");
		}
	}
	
	//'����' �޼ҵ� ���� -> ����� ���� -> ����Ʈ �޼ҵ�ʹ� �޸� ��ü�� ��� �������̽������� ȣ���� �����մϴ�.
	static void changeBettery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
	
}
