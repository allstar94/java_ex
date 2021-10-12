package ��Ʈ�����뿹��;

import java.util.Arrays;
import java.util.List;

/*
 * ȸ��(Member) ��ü���� ���� ȸ���� ��� ���̸� ���ٽİ� ���ϴ� ���α׷� �ۼ�
 */

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List<Member> list = (List)Arrays.asList(new Member("����ȣ",Member.MALE, 30),
												new Member("�迬��",Member.FEMALE,29),
												new Member("������",Member.MALE,32),
												new Member("����ȫ",Member.MALE,27));
		
		
		//[1���] �ܺ� �ݺ��ڸ� �����Ͽ� �ذ�
		//index�� �̿��ϴ� for�� �׸��� Iterater �̿��ϴ� while���� ���
		//�ܺ� �ݺ��ڸ� �̿��Ѵ�.
		
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
//		System.out.println("���� ȸ���� ��� ����: " + ageAvg); //29.6
//		
		
		//[2���] ���� �ݺ��ڸ� �����Ͽ� �ذ�
		
		double ageAvg = list.stream().filter(m-> m.getGender() == Member.MALE)
												.mapToInt(Member::getAge)
												.average()
												.getAsDouble();		
		
		System.out.println("���� ȸ���� ��� ����: " + Math.ceil(ageAvg)); //29.6

		
	}

}
