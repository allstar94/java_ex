package 빅데이터;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoiveAnalyze {
	
	public static void main(String[] args) {
		//댓글
		String [] reply = {"마법a","모험3","판타지123","액션,경이1","판타지:, 경의<>"};
	
		
		//영화 장르
		String [] feel = {"어드벤처","액션","판타지","경이","모험","로맨스","스릴러",
					"공포","다큐","드라마","추리","애니메이션","코미디","뮤지컬"};
		
		
		//장르의 개수를 카운트해서 값을 저장하는 배열 객체 새엇ㅇ
		int[] result = new int[14]; //0으로 자동 초기화
		
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
						System.out.println(result[x]+ "개");
					}	
				}
			}
		}
	}

}
