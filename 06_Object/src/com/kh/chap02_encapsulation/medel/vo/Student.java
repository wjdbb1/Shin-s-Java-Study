package com.kh.chap02_encapsulation.medel.vo;

public class Student {
//	�ʵ��
	// ����������[�����] �ڷ��� ������;

	private String name;
	private int kor;
	private int math;
	private int eng;

	// �����ں�

	// �޼ҵ�� : ����� �����ϴ� �κ�
	// ���������� ��ȯ�� �޼ҵ�([�Ű�����])

	// setter
	// ������(�ʵ�)���� ��� �� �����ϴ� ����� �ϴ� �޼ҵ�
	// �� �� �޼ҵ�� �ܺ� ���� �����ϵ��� �ؾ� �ϹǷ� public ���� ������ ���

	// setter �޼ҵ���� ��Ÿ�� ǥ����� �̿��Ͽ� setXXX�� ��� ������
	// ex) setName, setKor, setMath, ...
	// �Ű����� ���� �ƹ����Գ� ���� ���������� ���ʻ� �ʵ��� �����ϰ� ���
	public void setName(String name) { // �̸��� �������ִ� �޼ҵ�
		// name = name;
		// -> �Ű������� name = �Ű������� name;
		// {} ���������� �ش� �������� ������� ������ �켱 ������ ���� ����
		// �츮�� ���ϴ°� �ʵ��� name = �Ű������� name
		this.name = name; // -> this ���� �ش� ��ü�� �ּҰ��� �������
	}

	public void setKor(int kor) { // ���� ������ �������ִ� �޼ҵ�
		this.kor = kor;
	}

	public void setMath(int math) { // ���� ���� �������ִ� �޼ҵ�
		this.math = math;
	}

	public void setEng(int eng) { // ���� ���� �������ִ� �޼ҵ�
		this.eng = eng;
	}

	// getter
	// ���� ��ȯ���ִ� ����� �ϴ� �޼ҵ�
	// getter �޼ҵ���� ��Ÿ�� ǥ����� �̿��Ͽ� getXXX�� ��� ������
	// ex) getName, getKor, getMath ...

	// getter �޼ҵ�� ���� �ش� �ʵ� ���� ��ȯ�� �ִ� �޼ҵ�� �ش� �޼ҵ�� ���� �Ǵ� ���� ���� ������ �Ű������� �ۼ��� �ʿ䰡 ����
	// �� ��ȯ�� ����� �ϹǷ� ���� ��ȯ�ϰ��� �ϴ� ���� �ڷ����� ��ȯ���� ����

	public String getName() { // �̸��� ��ȯ�ϴ� �޼ҵ�
		return name; // ��ȯ���� ���� �� �ݵ�� return ������ �ش� ��ȯ���� �� ����

	}

	public int getKor() { // ���������� ��ȯ�ϴ� �޼ҵ�
		return kor;
	}

	public int getMath() { // ���������� ��ȯ�ϴ� �޼ҵ�
		return math;

	}

	public int getEng() { // ���������� ��ȯ�ϴ� �޼ҵ�
		return eng;
	}

	// ��� �ʵ� ���� �� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String information() {
		return "�̸� : " + name + ", �������� : " + kor + ", �������� : " + math + ",�������� : " + eng;

	}

}
