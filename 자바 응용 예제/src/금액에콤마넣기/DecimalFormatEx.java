package �ݾ׿��޸��ֱ�;

import java.util.Scanner;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		System.out.print("���� �ݾ��� �Է��ϼ���>>> ");
		Scanner in = new Scanner(System.in);
		long totlamount = in.nextLong();
		
		//�߰�
		
		String amount = Utils.toNumberFormat(totlamount);
		
		System.out.println("���� �ݾ�: " + amount);
		
	}

}
