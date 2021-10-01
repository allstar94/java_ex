package 게임플레이어구현;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프한다");
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돈다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("<<고급자 레벨입니다.>>");
		
	}
}
