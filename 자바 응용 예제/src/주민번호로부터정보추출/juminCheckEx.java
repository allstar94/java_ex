package 주민번호로부터정보추출;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class juminCheckEx {

	public static void main(String[] args) {
		
		//준비 단계: 필요 변수, 배열의 초기화
		String juminNum;
		int sum = 0; // 누게 변수는 0으로 초기화
		int [] weight = {2,3,4,5,6,7,0,8,9,2,3,4,5};// 가중치 배열 초기화
		int temp, result;
		
		//입력 단계
		System.out.print("주민번호 입력>>>");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();
		
		
		/*
		 입력 받은 주민번호를 유형성 검사 -> 정규 표현식(regex) 패턴 적용
		 */
		//^ -> 이거로 시작하겠다. $ -> 끝날때 사용한다.
		// [] -> 범위 {} -> 숫자 개수
		String regex = "^[0-9]{6}-[1234][0-9]{6}$";
		
		//[첫번째 방법]
		//boolean check = Pattern.matches(regex, juminNum);
		
		//[두번째 방법]
		boolean check = juminNum.matches(regex);
		
		if(check == false) {
			System.out.println("입력된 주민번호는 정규 표현식 형식에 맞지 않음!");
			return;
		}	
		System.out.println("입력된 주민번호는 정규 표현식 형식에 적합함!");
		
		/*
		  입력받은 주민번호에 체크 공식 적용
		*/  
		// 1단계 적용 -> sum 구하기
		for(int i=0; i<13;i++) {
			if(juminNum.charAt(i)=='-')continue;
				sum += (juminNum.charAt(i)-48) * weight[i];
		}
		System.out.println(sum);
		
		//2단계 공식 -> temp 값이 두 자리인 주민번호가 있다. 10 or 11
		temp = 11 - (sum%11);

		System.out.println(temp);
		//3단계 공식 -> temp 값이 두 자리인 주민번호를 대비해서..
		result = temp % 10;
		
		System.out.println(result);
		
		if(result == juminNum.charAt(13) - 48) {
			System.out.println("입력된 주민번호가 정상입니다.");
			//"나이" 추출
			/*
			"나이" 추출 시나리오 작성

			1. 현재 시스템으로부터 년도 얻어내기 = 2021
			2. 주민번호 앞 자리의 생년월일에서 년도 두자리만 얻어오기 → "97" → 97 정수값으로 변환
			3. 주민번호 뒤 자리의 첫번째 자리 1,2,3,4, 중 어느 것인지 비교 판단하여

			    if 1,2면은 1900을 더해주고 → 1900+97 = 1997

			    3,4면 2000을 더해준다.

			4. 2021 - 1997 = 나이 추출			
			*/
			
			Calendar cal = Calendar.getInstance(Locale.KOREA);
			
			int year = cal.get(Calendar.YEAR);
			int age = 0;
			int yy = Integer.parseInt(juminNum.substring(0,2));
			
			System.out.println(year);
			
			if((juminNum.charAt(7)-48) < 3) {//1,2인경우
				yy += 1900;
			}else {//3,4 인 경우
				yy += 2000;
			}
			age = year - yy + 1;
			System.out.println(age);
			
			//성별
			if((juminNum.charAt(7)-48)%2 == 0) { // 2,4인 경우
				System.out.println("성별: 여자");
			}else {
				System.out.println("성별: 남자");
			}
			
			
			//출신지역 추출
			//지역코드를 2차원 배열로 초기화
			String [][] localeCode = {{"서울","00","08"},{"부산","09","12"}
			,{"인천","13","15"},{"경기","16","25"},{"강원","26","34"},{"충북","35","39"},
			{"대전","40","40"},{"충남","41","43"},{"충남","45","47"},{"세종","44","44"},
			{"세종","96","96"},{"전북","48","54"},{"전남","55","64"},{"광주","65","66"},
			{"대구","67","70"},{"대구","67","70"},{"경북","71","80"},{"경남","81","84"},
			{"경남","86","90"},{"울산","85","85"},{"제주","91","95"}};
			
			String localeString = juminNum.substring(8,10);
			int locale = Integer.parseInt(localeString);
			
			
			String birthPlace = null;
			for(int j=0;j<=19;j++) {
				if(locale >= Integer.parseInt(localeCode[j][1]) && 
						locale<= Integer.parseInt(localeCode[j][2])) {
					birthPlace = localeCode[j][0];
				}
			}
			System.out.println("출신지역: " + birthPlace);
			
			int mm = Integer.parseInt(juminNum.substring(2,4));
			int dd = Integer.parseInt(juminNum.substring(4,6));
			
			
			//생년월일 추출
			if((juminNum.charAt(7)-48) < 3) {//1,2인경우
				System.out.println(yy+"년" + mm +"월" + dd+"일");
			}else {//3,4 인 경우
				System.out.println(yy+"년" + mm +"월" + dd+"일");
			}
			
			//"띠" 추출
			
			String ddi = null;
			String [] gangi = {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
			ddi = gangi[yy%12];
			
			System.out.println("띠: "+ ddi);
			
			
		}else {
			System.out.println("입력된 주민번호가 비정상입니다.");
		}
	}

}
