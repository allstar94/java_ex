package game;

public class Highlevel extends Playerlevel{

	@Override
	public void run() {
		System.out.println("���� ������ �޸��ϴ�.");				
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count;i++) {
			System.out.println("���� ���� ���� �մϴ�.");		
		}		
	}

	@Override
	public void turn() {
		System.out.println("�ϵ����� �մϴ�.");				
	}

	@Override
	public void impossibleLevel() {
		// TODO Auto-generated method stub
		
	}

}
