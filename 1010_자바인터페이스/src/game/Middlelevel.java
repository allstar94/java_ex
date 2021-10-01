package game;

public class Middlelevel extends Playerlevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");		
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count;i++) {
			System.out.println("높이 점프 합니다");		
		}
	}

	@Override
	public void turn() {		
	}

	@Override
	public void impossibleLevel() {
		// TODO Auto-generated method stub
		
	}

}
