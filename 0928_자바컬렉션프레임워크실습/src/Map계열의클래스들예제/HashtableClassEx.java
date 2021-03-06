package Map계열의클래스들예제;

import java.util.Hashtable;
import java.util.Scanner;

public class HashtableClassEx {

	public static void main(String[] args) {
		String[] userID = {"Lee","Kim","Jang","Wang","Ha"};
		String[] password = {"L123","K456","J234","W896","H567"};
		
		//hashtable 객체 생성
		//Hashtable<Key, Value>
		Hashtable<String, String> ht = new Hashtable<String, String>(userID.length);
		
		for(int i = 0; i<userID.length;i++) {
			ht.put(userID[i], password[i]);
		}
		//{Jang=J234, Ha=H567, Lee=L123, Wang=W896, Kim=K456}
		//순서는 중요치 않아서 정렬되어 있지않고, 중가로를 사용한다
		System.out.println(ht);
		
		boolean FLAG = true;
		
		while(FLAG) { // 무한 루프
			System.out.print("유저 ID는 >>> ");
			Scanner in = new Scanner(System.in);
			String user_key = in.nextLine();
			String pw_value = ht.get(user_key);
			
			if(pw_value != null) {
				System.out.print("유저 PASSWORD는 >>> ");
				String passwordInputValue = in.nextLine();
				
				
				if(pw_value.equals(passwordInputValue)) {
					System.out.println("인증 성공!!");
				}else {
					System.out.println("인증 실패!!");
				}
			}else {
				System.out.println("인증한 유저 ID!!");
			}
		}
		
	}

}
