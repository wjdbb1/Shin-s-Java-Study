package com.kh.variable;

// �ٸ� ��Ű�� �ȿ����� ���� Ŭ�������� ���� �� ����
//==> Ŭ�������� ��Ű������� �����ϴ� ���� Ǯ����
public class A_Variable {

	public void printValue() {
		System.out.println("���� ��� ��");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);

		int point = 100; // ����Ʈ
		int bonus = 10; // ���ʽ�
		int personCount = 10; // ����� -> 20������ ����
		int fees = 10; // ������

		System.out.println("���� ��� ��");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);

		// ������, �����, ���������� ���� ���� ����ϴ� ���� ���̱�!

	}

	public void declareVariable() {
		// ���� ����
		// ���� : �ڷ��� ������;
		// �������� �׻� �ҹ��ڷ� ����. ���� �ܾ��̸� ù���ڴ� �빮�� -> ��Ÿ��ǥ���

		// 1.����
		boolean isTrue; // 1byte

		// 2.������
		// 2-1.������
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte --> ������ �߿� ���� ��ǥ���� �ڷ��� (�⺻��)
		long lNum; // 8byte

		// 2-2. �Ǽ���
		float fNum; // 4byte
		double dNum;// 8byte --> �Ǽ��� �߿� ���� ��ǥ���� �ڷ��� (�⺻��)

		// 3.������
		char ch;

		// 4. ���ڿ�(������) --> �⺻ �ڷ����� �ƴ� ���� �ڷ���
		String str;

		// **������ ���� ���� **
		// ������ = ��;

		isTrue = true;// ���� �������� true, false���� ���� ����
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; // l�Ǵ� L�� ���̸鼭 long�� �ڷ��� ���̶�� ǥ��
					// ǥ������ �ʾƵ� ���� �� (�ڵ� ����ȯ)

		fNum = 4.0F; // �ݵ�� f�� �ٿ����� --> ������ �ս��� �Ͼ �� ����
		dNum = 8.0d; // d�� �����ص� �� --> double�� �⺻�� �̹Ƿ�

		// ch = 'ABC'; //���ڿ��� �� ���ڸ� �� ���� ����
		ch = 'A'; // ����ǥ�� �̿��Ͽ� �� ����

		str = "ABC";// �ֵ���ǥ�� �̿��Ͽ� �� ����
		str = "A";// �� ���� ���ڸ� ������ �� ����

		// ** ���� ��� ** //
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);

	}

	public void initvariable() {
		// �޼ҵ� �ȿ� ���� �� ������ '��������'�̹Ƿ�
		// �ش� �޼ҵ忡���� ��� �����ϸ� �ݵ�� �ʱ�ȭ(�� ����)�Ǿ�� �Ѵ� !!!!

		// ���� ��� ��Ģ
		int number;
		// int number; --> �����D�� ������ ����
		int Number; // ��ҹ��ڴ� ���еǱ� ������ ����

		// int true; --> �����(true)��� �Ұ�

		int age1;
		// int 1age; --> ���ڷ� ������ �� ����
		
		int number_1;
		int number$2;
		//int numver#3; --> _ ,$ �̿��� Ư������ ��� �Ұ�
		
		//���� �ܾ�� �� �������� ��� �ٿ����� �ι�° �ܾ���� ù ���ڸ� �빮�ڷ� �ۼ� -> ��Ÿ�� ǥ���
		
		String username;// ���ʻ� Ʋ��
		String userName;// ���ʻ� �´� ǥ��
		
		//�ڹٴ� �ѱ۵� ��� ������
		String �̸�; //�ѱ��� ������� �ʴ� ȯ�濡���� ������ �߻���ų ���ɼ��� �־� �� ������� ����
		
		
		

	}

}
