package game;

public class Middlelevel extends Playerlevel {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");		
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count;i++) {
			System.out.println("���� ���� �մϴ�");		
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
