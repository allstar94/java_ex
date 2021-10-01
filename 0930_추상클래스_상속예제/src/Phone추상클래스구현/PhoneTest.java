package Phone추상클래스구현;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("<<< 스마트폰 테스트>>>");
		phone myPhone = new smartPhone("태훈");
		myPhone.run();
		System.out.println();
		
		System.out.println("<<< 텔레폰 테스트>>");
		phone yourPhone = new TelePhone("지수");
		yourPhone.run();
		System.out.println();
	}

}
