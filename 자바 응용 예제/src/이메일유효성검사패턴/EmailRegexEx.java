package �̸�����ȿ���˻�����;

public class EmailRegexEx {

	public static void main(String[] args) {
//		String email = null;
//		
//		System.out.print("�̸����� �Է��ϼ���:");
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
				System.out.println("������ �̸��� : "+ email);
			}else {
				System.out.println("�������� �̸��� : "+ email);
			}
			
		}
		
	}

}
