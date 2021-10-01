package �����÷��̾��;

/*
 * player Ŭ������ playerLevel Ŭ������ ����(HAS_A) �����̴�. �� ����(aggregation) ���������̴�.
 * ��ü�� �κ��� ��Ÿ�� �� ����̴�.
 * ���ӿ��� ��� Player�� �ڽ��� ������ �ֱ� ������, Player Ŭ�������� PlayerLevel��
 * �ɹ������� ���´�. ������ �ö󰥼��� ������ �� �ִ� ����� �޶�����.
 * �׷��Ƿ� PlayerLevel Ŭ������ �߻� Ŭ������ ����� ��� �������� �������� �����ϴ� 
 * ����� �����ϰ�, �� �������� �޶����� ����� �߻� �޼ҵ�� ����� �ش�.
 */

public class Player {
	//[�߿�] Player Ŭ�������� PlayerLevel�� '�ɹ�������'�� ���´�.
	private PlayerLevel level;
	
	
	//������
	public Player() {
		//ó�� �����Ǹ� ���ʷ����� �����ϸ�, ���� �޼��� �ⷰ
		level = new BeginnerLevel();
		level.showLevelMessage();
		
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
