package ��Ƽ�����忹��;

import java.awt.Toolkit;

public class BeepPringEx01 {

	public static void main(String[] args) {
		//Toolkit ��ü ������
		/*
		 * Toolkit Ŭ������ '�ý��� ����'�� ��� ������ �ý����� �ڿ��� ������ �� �ִ� Ŭ�����̴�. 
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000); // 1�ʰ� �Ͻ� ����
			}catch(Exception e) {}
		}
		
		for(int i =0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); // 1�ʰ� �Ͻ� ����
			}catch(Exception e) {}
		}
		
	}

}
