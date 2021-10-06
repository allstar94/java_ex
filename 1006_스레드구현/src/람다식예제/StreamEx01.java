package 람다식예제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		/*
		 * 자바7 이전까지는 List<Integer> 컬레션에서 요소를 순차적으로
		 * 처리하기 위해 Iterator 외부 반복자를 사용해왔다.
		 */
		
//		List<Integer> list = (List)Arrays.asList(10,20,30,40,50);
//		Iterator<Integer> iterator = list.iterator();
//			
//		while(iterator.hasNext()) {
//			Integer values =iterator.next();
//			System.out.println(values+" ");
//		}
		
		List<Integer> list = (List)Arrays.asList(10,20,30,40,50);
		Stream<Integer> stream = list.stream();
	
		stream.forEach(value -> System.out.print(value + " "));
	}

}
