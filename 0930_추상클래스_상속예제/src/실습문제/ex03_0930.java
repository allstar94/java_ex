package �ǽ�����;

import java.util.Scanner;

public class ex03_0930 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���>> ");
		int input = sc.nextInt();
		
		
		if(input%400==0 && input%100==0 && input%4==0) {
			System.out.println("����");
		}else if(input%100==0 && input%4==0) {
			System.out.println("���");
		}else if(input%4==0) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
	}

}
