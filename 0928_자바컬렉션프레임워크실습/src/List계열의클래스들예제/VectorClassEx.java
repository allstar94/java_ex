package List계열의클래스들예제;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		String [] name = {"김진명", "최인호", "조정래","김홍신","박경리"};
		
		//Vector 객체 생성
		//List<E> list = new Vector<E>(); // 일반적인 경우
		List<String> list = new Vector<String>(4,3);

		//Vector 클래스의 주요 메소드 적용
		System.out.println("백터에 저장된 요소의 개수: " + list.size()); // 0이 출력됨!
		System.out.println("백터의 용량은: " + ((Vector<String>)list).capacity()); // 4가 출력됨!
	
		for(int i = 0; i<name.length; i++) {
			list.add(name[i]); //객체 추가
		}

		//Vector 클래스의 주요 메소드 적용
		System.out.println("백터에 저장된 요소의 개수: " + list.size()); // 5가 출력됨!
		System.out.println("백터의 용량은: " + ((Vector<String>)list).capacity()); // 7가 출력됨!
	
		//[김진명, 최인호, 조정래, 김홍신, 박경리]
		System.out.println(list);
		
		list.add(2,"공지영");
		System.out.println(list);

		//객체 검색 get() 메소드, contains()
		//최인호
		System.out.println(list.get(1));
	
		//true
		boolean contains_result = list.contains("김홍신");
		System.out.println(contains_result);

		//false
		boolean contains_result2 = list.contains("홍길동");
		System.out.println(contains_result2);

		System.out.println(list.size());//6
		
		//객체 변경 set() 메소드 -> "공지영" 객체를 "이문열" 객체로 변경하고자 한다.
		System.out.println(list);
		list.set(2, "이문열");
		//[김진명, 최인호, 이문열, 조정래, 김홍신, 박경리]
		System.out.println(list);
		
		//객체 삭제 remove() 메소드
		list.remove(3);
		//[김진명, 최인호, 이문열, 김홍신, 박경리]
		System.out.println(list);

		list.remove("김홍신");
		//[김진명, 최인호, 이문열, 박경리]
		System.out.println(list);
	
		System.out.println(); // 개행
		
		//객체정렬 -> 오름차순
		System.out.println("[객체 오름 차순 정렬]");
		Collections.sort(list);
		//[김진명, 박경리, 이문열, 최인호]
		System.out.println(list);
		
		//객체정렬 -> 오름차순
		System.out.println("[객체 내림 차순 정렬]");
		Collections.sort(list,Collections.reverseOrder());
		//[최인호, 이문열, 박경리, 김진명]
		System.out.println(list);
				
	}
}
