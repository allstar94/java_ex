package enum����ǽ�;

import java.util.Scanner;

public class payGropTest {
	private static final Object EMPTY = null;
	
	public static void main(String[] args) {
		for(PayGrop type : PayGrop.values()) {
			System.out.print("���� ����: ");
			System.out.println(type.getTitle());
		}
		
		for(PayGrop type : PayGrop.values()) {
			System.out.println(type.getPayList());
		}
		
		System.out.println();
		
		System.out.println("���� ������ �Է��ϼ��� >>>");
		Scanner in = new Scanner(System.in);
		String payment_means = in.next();
		
		PayGrop pay = PayGrop.findByBayCode(payment_means);
		
		if(pay.equals(EMPTY)) {
			System.out.println("���� ����:" + pay.getTitle());
		}else {
			System.out.println("���� ����:" +  pay.getTitle());	
		}
		
		
	}
}
