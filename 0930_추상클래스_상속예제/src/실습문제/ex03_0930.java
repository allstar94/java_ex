package 실습문제;

import java.util.Scanner;

public class ex03_0930 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해 주세요>> ");
		int input = sc.nextInt();
		
		
		if(input%400==0 && input%100==0 && input%4==0) {
			System.out.println("윤년");
		}else if(input%100==0 && input%4==0) {
			System.out.println("평년");
		}else if(input%4==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}

}
