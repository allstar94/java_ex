package �������ڷ���;

// �߿� ����

public class URLPath {

	public static void main(String[] args) {
		String url = "http://localhost::8080/Model_Board/login.do";
		
		//34
		int lastPosition = url.lastIndexOf("/");
		//System.out.println(lastPosition);
		String filePath = url.substring(lastPosition);
		
		System.out.println(filePath);
	
	}

}
