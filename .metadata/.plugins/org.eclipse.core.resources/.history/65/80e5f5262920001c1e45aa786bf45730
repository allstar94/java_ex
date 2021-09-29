package Set계열의클래스예제;
/*
	개발자가 어떤 클래스를 구현하면 컴파일 시 최상위 클래스인
	object 클래스로부터 상속을 받게된다.
*/
public class Member {
	//인스턴스 변수(객체 변수) 선언
	private String name;	//이름
	private int age;		//나이
	private String juminNum;//주민번호
	
	
	//생성자
	public Member(String name, int age, String juminNum) {
		this.name = name;
		this.age = age;
		this.juminNum = juminNum;
	}


	@Override
	public boolean equals(Object obj) {
		//참조변수 instanceof 타입
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name)&&
					(member.age == age) &&
					member.juminNum.equals(juminNum);
		}else {
			return false;
		}
		
	}
	@Override // 재정의
	public int hashCode() {
		return name.hashCode() + age + juminNum.hashCode();
	}

	
}
