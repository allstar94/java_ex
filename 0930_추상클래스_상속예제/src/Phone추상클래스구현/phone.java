package Phone추상클래스구현;

public abstract class phone {
	protected String name;
	
	public phone(String name) {
		name = name;
	}
	public abstract void search();
	public abstract void autoresponder();
	
	public void on() {
		System.out.println("핸드폰을 켭니다.");
	}
	
	public void Off() {
		System.out.println("핸드폰을 끕니다.");
	}
	final public void run() {
		on();
		search();
		autoresponder();
		Off();
	}
}
