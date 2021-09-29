package 이메일유효성검사패턴;

public class EmailRegexEx {

	public static void main(String[] args) {
//		String email = null;
//		
//		System.out.print("이메일을 입력하세요:");
//		
//		Scanner scan = new Scanner(System.in);
//		email = scan.next();
//		
//		
//		
//		String regax = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
//		boolean check = email.matches(regax);
//		if(check) {
//			System.out.println(email);
//		}
		
		String [] email_ex = {"king5901@naver.com",
				"kim1234@gmail.com","erin0521@partner.sk.com","asd456@partner.sk.com.aaa"
		};
		
		String email_pattern = "^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		
		for(String email : email_ex) {
			boolean check = email.matches(email_pattern);
			if(check == true) {
				System.out.println("적합한 이메일 : "+ email);
			}else {
				System.out.println("부적합한 이메일 : "+ email);
			}
			
		}
		
	}

}
