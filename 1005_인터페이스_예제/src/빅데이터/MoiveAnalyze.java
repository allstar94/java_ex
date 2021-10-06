package ������;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoiveAnalyze {
	
	public static void main(String[] args) {
		//���
		String [] reply = {"����a","����3","��Ÿ��123","�׼�,����1","��Ÿ��:, ����<>"};
	
		
		//��ȭ �帣
		String [] feel = {"��庥ó","�׼�","��Ÿ��","����","����","�θǽ�","������",
					"����","��ť","���","�߸�","�ִϸ��̼�","�ڹ̵�","������"};
		
		
		//�帣�� ������ ī��Ʈ�ؼ� ���� �����ϴ� �迭 ��ü ������
		int[] result = new int[14]; //0���� �ڵ� �ʱ�ȭ
		
		String word = null;
		
		for(int i = 0 ; i<reply.length;i++) {
			String regex = "[A-Za-z0-9<>!~zg().?:/]";
			reply[i] = reply[i].replaceAll(regex, "");
			System.out.println(reply[i]);
			
			for(int j = 0; j<feel.length;j++) {
				int count = 0;
				Pattern p = Pattern.compile(feel[j]);
				Matcher M = p.matcher(reply[i]);
				
				while(M.find()) {
					word = M.group();
					count++;
				}
				result[j] = result[j] + count;
				
				if(i == (reply.length-1) && j == (reply.length-1)) {
					for(int x=0;x<feel.length;x++){
						if(result[x]==0) continue;
						System.out.print(feel[x] + ":");
						System.out.println(result[x]+ "��");
					}	
				}
			}
		}
	}

}
