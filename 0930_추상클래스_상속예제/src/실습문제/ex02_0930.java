package �ǽ�����;

import java.util.Scanner;

public class ex02_0930 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��� �ּ���: ");
		int input = sc.nextInt();
		int [] arr = {50000,10000,5000,1000,500,100,50,10,1};
		String [] S_arr = {"��������","������","��õ����","õ����","�����","���","���ʿ�","�ʿ�","�Ͽ�"};
		
		
		for(int i = 0; i< arr.length;i++) {
			int check = 0;
			check = input/arr[i];
			if(check != 0) {
				input -= arr[i]*check;
				System.out.println(S_arr[i] + check + "��");
			}
		}
		
	}

}
