package �������ڷ���;


/* 
 * �ڹ� ������ ������ ����
 * ������ ����� ��� �������� ����� �����ϴ�.
 * */
public class VariableScopeEx {

	public static void main(String[] args) {
		int var1 = 20;
		int var2 = 0;
		
		if(var1 > 10) {
			var2  = var1 - 10;
		}
		int var3 = var1 + var2 + 5;
		

	}

}
