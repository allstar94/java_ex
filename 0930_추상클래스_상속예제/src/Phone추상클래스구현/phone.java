package Phone�߻�Ŭ��������;

public abstract class phone {
	protected String name;
	
	public phone(String name) {
		name = name;
	}
	public abstract void search();
	public abstract void autoresponder();
	
	public void on() {
		System.out.println("�ڵ����� �մϴ�.");
	}
	
	public void Off() {
		System.out.println("�ڵ����� ���ϴ�.");
	}
	final public void run() {
		on();
		search();
		autoresponder();
		Off();
	}
}
