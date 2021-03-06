package 게임플레이어구현;

/*
 * player 클래스와 playerLevel 클래스는 포함(HAS_A) 관계이다. 즉 집합(aggregation) 연관관계이다.
 * 전체와 부분을 나타낸 모델 요소이다.
 * 게임에서 모든 Player는 자신의 레벨이 있기 때문에, Player 클래스에서 PlayerLevel을
 * 맴버변수로 갖는다. 레벨이 올라갈수록 수행할 수 있는 기능이 달라진다.
 * 그러므로 PlayerLevel 클래스를 추상 클래스로 만들어 모든 레벨에서 공통으로 수행하는 
 * 기능을 구현하고, 각 레벨마다 달라지는 기능은 추상 메소드로 만들어 준다.
 */

public class Player {
	//[중요] Player 클래스에서 PlayerLevel을 '맴버변수로'로 갖는다.
	private PlayerLevel level;
	
	
	//생성자
	public Player() {
		//처음 생성되면 비기너레벨로 시작하며, 레벨 메세지 출럭
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
