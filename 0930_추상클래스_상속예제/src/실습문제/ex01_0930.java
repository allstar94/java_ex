package �ǽ�����;

import java.util.Scanner;

public class ex01_0930 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �ڸ� �Է��ϼ���");
		char input = sc.next().charAt(0);		
		System.out.println(input);
	
		if(input>= 'A' && input <= 'Z') {
			input += ('a'-'A');
			System.out.println(input);
		}else if(input >= 'a'&& input <= 'z') {
			input -= ('a'-'A');
			System.out.println(input);
		}else {
			System.out.println("�����ڰ� �ƴմϴ�");
		}
	}

}
