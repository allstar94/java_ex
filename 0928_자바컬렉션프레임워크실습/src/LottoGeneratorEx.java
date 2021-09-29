import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * 로또 6개, 1~45
 * Treeset은 저장할 때 이미 정려하기 때문에 읽어올 때 따로 정렬할 필요가 없다.
 * Treeset은 Binary search Tree의 형태로 데이터를 저장하는 컬렉션이다.
 */
public class LottoGeneratorEx {
	public static void main(String[] args) {
		Set lotto = new HashSet();
		Random rd = new Random();
		Set Tree_set = new TreeSet();
		
		for(int i = 0; lotto.size() < 6;i++) {
			lotto.add(rd.nextInt(45)+1);
			Tree_set.add(rd.nextInt(45)+1);
		}
		
		
		System.out.println(lotto);
		
		List list = new ArrayList(lotto);
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println(Tree_set);
		
	}

	
}