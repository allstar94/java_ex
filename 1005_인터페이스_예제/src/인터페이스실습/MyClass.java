package 인터페이스실습;

public class MyClass {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		RemoteControl.changeBettery();
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(false);
		RemoteControl.changeBettery();
		rc.turnOff();
		
	}

}
