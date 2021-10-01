package game;

public abstract class Playerlevel {
	int count;
	public abstract void run();
	public abstract void jump(int count);
	public abstract void turn();
	public abstract void impossibleLevel();
	
	public void go(int count) {
		run();
		jump(count);
		turn();
	}
}
