package game;

public class Highlevel extends Playerlevel{

	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");				
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count;i++) {
			System.out.println("아주 높이 점프 합니다.");		
		}		
	}

	@Override
	public void turn() {
		System.out.println("턴동작을 합니다.");				
	}

	@Override
	public void impossibleLevel() {
		// TODO Auto-generated method stub
		
	}

}
