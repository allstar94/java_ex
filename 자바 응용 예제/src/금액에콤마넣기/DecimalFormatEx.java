package 금액에콤마넣기;

import java.util.Scanner;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		System.out.print("결제 금액을 입력하세요>>> ");
		Scanner in = new Scanner(System.in);
		long totlamount = in.nextLong();
		
		//추가
		
		String amount = Utils.toNumberFormat(totlamount);
		
		System.out.println("결제 금액: " + amount);
		
	}

}
