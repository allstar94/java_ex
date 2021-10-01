package Phone추상클래스구현;

public class TelePhone extends phone {

	public TelePhone(String name) {
		super(name);
	}

	@Override
	public void search() {}

	@Override
	public void autoresponder() {
		System.out.println("핸드폰으로 자동응답합니다.");		
	}
}
