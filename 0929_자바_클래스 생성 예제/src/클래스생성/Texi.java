package 클래스생성;


//상속을 시킬 경우 default 생성자를 만들어 줘야 한다 안그러면 error가 난다
public class Texi extends Car{
	//메소드 오버라이딩
	public void speed(int velocity) {
		speed = speed + velocity;
		if(speed>100) {
			speed = 100;
		}
	}
	
	public static void main(String[] args) {
		Texi myTexi = new Texi();
		myTexi.speed(150);
		System.out.println("texi speed is " + myTexi.speed);
	}

}
