package enum응용실습;

import java.util.Scanner;

public class payGropTest {
	private static final Object EMPTY = null;
	
	public static void main(String[] args) {
		for(PayGrop type : PayGrop.values()) {
			System.out.print("결제 종류: ");
			System.out.println(type.getTitle());
		}
		
		for(PayGrop type : PayGrop.values()) {
			System.out.println(type.getPayList());
		}
		
		System.out.println();
		
		System.out.println("결제 수단을 입력하세요 >>>");
		Scanner in = new Scanner(System.in);
		String payment_means = in.next();
		
		PayGrop pay = PayGrop.findByBayCode(payment_means);
		
		if(pay.equals(EMPTY)) {
			System.out.println("결제 종류:" + pay.getTitle());
		}else {
			System.out.println("결제 종류:" +  pay.getTitle());	
		}
		
		
	}
}
