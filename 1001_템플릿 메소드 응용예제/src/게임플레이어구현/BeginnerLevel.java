package 게임플레이어구현;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 할줄 모른다");
		
	}

	@Override
	public void turn() {
		System.out.println("돌줄 모른다");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("<<초보자 레벨입니다.>>");
		
	}

}
