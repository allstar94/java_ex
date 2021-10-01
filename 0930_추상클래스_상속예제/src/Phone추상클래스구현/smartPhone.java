package Phone추상클래스구현;

public class smartPhone extends phone {

	public smartPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void search() {
		System.out.println("핸드폰으로 검색합니다.");
	}

	@Override
	public void autoresponder() {	}

}
