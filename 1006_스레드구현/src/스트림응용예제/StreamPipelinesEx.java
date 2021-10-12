package 스트림응용예제;

import java.util.Arrays;
import java.util.List;

/*
 * 회원(Member) 객체에서 남자 회원의 평균 나이를 람다식과 구하는 프로그램 작성
 */

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List<Member> list = (List)Arrays.asList(new Member("박태호",Member.MALE, 30),
												new Member("김연경",Member.FEMALE,29),
												new Member("손유일",Member.MALE,32),
												new Member("안재홍",Member.MALE,27));
		
		
		//[1방법] 외부 반복자를 적용하여 해결
		//index를 이용하는 for문 그리고 Iterater 이용하는 while문은 모두
		//외부 반복자를 이용한다.
		
//		double sum = 0;
//		int count = 0;
//		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getGender() == Member.MALE ) {
//				sum += list.get(i).getAge();
//				count++;
//			}
//		}
//		double ageAvg = sum/count;
//		
//		System.out.println("남자 회원의 평균 나이: " + ageAvg); //29.6
//		
		
		//[2방법] 내부 반복자를 적용하여 해결
		
		double ageAvg = list.stream().filter(m-> m.getGender() == Member.MALE)
												.mapToInt(Member::getAge)
												.average()
												.getAsDouble();		
		
		System.out.println("남자 회원의 평균 나이: " + Math.ceil(ageAvg)); //29.6

		
	}

}
