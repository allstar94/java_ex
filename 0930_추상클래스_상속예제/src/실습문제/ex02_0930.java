package 실습문제;

import java.util.Scanner;

public class ex02_0930 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해 주세요: ");
		int input = sc.nextInt();
		int [] arr = {50000,10000,5000,1000,500,100,50,10,1};
		String [] S_arr = {"오만원권","만원권","오천원권","천원권","오백원","백원","오십원","십원","일원"};
		
		
		for(int i = 0; i< arr.length;i++) {
			int check = 0;
			check = input/arr[i];
			if(check != 0) {
				input -= arr[i]*check;
				System.out.println(S_arr[i] + check + "매");
			}
		}
		
	}

}
