package enum����ǽ�;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * arrays Ŭ������ �ֿ� �޼ҵ�
 * -> static <T> List<T> asList(T... a)
 * 		-> ���: ���� ���� �迭�� ���� ũ���� List�� ��ȯ�Ͽ� ��ȯ
 */
public enum PayGrop {
	CASH("����", Arrays.asList("������ü","�������Ա�","�������","�佺")),
	CARD("ī��", Arrays.asList("������","�ſ�ī��","īī������","�������")),
	ETC("��Ÿ", Arrays.asList("����Ʈ","����")),
	EMPTY("������������", Collections.EMPTY_LIST);

	private String title;
	private List<String> payList;
	
	//������
	PayGrop(String title, List<String> payList) {
		this.title = title;
		this.payList = payList;
	}
	
	public static PayGrop findByBayCode(String code) {
		//�ڹ� ��Ʈ���� ������ ���� ����
		return Arrays.stream(PayGrop.values())
				.filter(PayGrop -> PayGrop.hasPayCode(code))
				.findAny()
				.orElse(EMPTY);
	}
	//����� ���� �޼ҵ�
	public boolean hasPayCode(String code) {
		return payList.stream().anyMatch(pay->pay.equals(code));
	}
	public String getTitle() {
		return title;
	}
	public List<String> getPayList() {
		return payList;
	}
}
