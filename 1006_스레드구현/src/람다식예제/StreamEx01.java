package ���ٽĿ���;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		/*
		 * �ڹ�7 ���������� List<Integer> �÷��ǿ��� ��Ҹ� ����������
		 * ó���ϱ� ���� Iterator �ܺ� �ݺ��ڸ� ����ؿԴ�.
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
