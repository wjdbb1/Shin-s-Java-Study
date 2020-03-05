package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ��� ����
	// ���� ���� : ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���� ������ ����

	public void method1() {
		int[] origin = { 1, 2, 3, 4, 5 };

		// origin�� copy�� ����
		int[] copy = origin;

		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
		// ����� copy�迭�� �̿��ؼ� 2�� �ε��� ���� 99�� ����
		copy[2] = 99;
		System.out.println("===== ���纻 �迭 �� ���� �� =====");

		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();

		// copy �迭�� 2�� �ε��� ���� �����ߴµ� �������� ���� ����
		// ==> ���� ���� �����ϰ� �ֱ� ����(���� �ּҰ�)

		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		// ============>���� ����
	}

	// ���ο� �迭�� ����� ���ؼ��� ���� ���簡 �ʿ���
	public void method2() {
		// 1. for���� �̿��� ���
		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[5];
		// 5ũ���� �� �迭�� ����� �� ����� 0���� �ʱ�ȭ

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];

		}

		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
		// ����� copy�迭�� �̿��ؼ� 2�� �ε��� ���� 99�� ����
		copy[2] = 99;
		System.out.println("===== ���纻 �迭 �� ���� �� =====");

		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();

		

		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());

	}

	public void method3() {
		// 2. SystemŬ�������� arraycopy()�޼ҵ带 �̿��� ����

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[10]; // �˳��ϰ� ũ�� ����

		// System.arracopy(���� �迭��, ���� ���� �� �ε���, ���纻 �迭��, ���纻 �迭�� ���� �� ���� ��ġ, �������);

		System.arraycopy(origin, 0, copy, 2, origin.length);
		// origin �迭�� copy �迭�� �����ϴµ� origin �迭�� 0�� �ε������� �������� ����
		// ���̸�ŭ�� copy�迭�� 2�� �ε������� ä��ڴٴ� �ǹ�

		// �������
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
	}

	public void method4() {
		// 3. Arrays Ŭ�������� �����ϴ� copyOf()�޼ҵ� ���

		int[] origin = { 1, 2, 3, 4, 5 };

		// ���纻 �迭 = Arrays.copyOf(�����迭, ������ ����);
		int[] copy = Arrays.copyOf(origin, 5);

		// ���� ������ ���� ��ŭ ������ ũ�Ⱑ �Ҵ� ��
		// �ش� ���̰� �����ϰ��� �ϴ� ���̺��� Ŭ ��� �⺻ �迭 ���� ��� ����(�ڿ��� 0 �� ��)
		// ���� ��� ���� ������ ���̸�ŭ ����

		// �������
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
	}

	public void method5() {
		// 4. clone() �޼ҵ� �̿��� ����
		// : ���� �ε����� ������ �� ������ ���� �迭 ��ä�� �����ؼ� ���ο� �迭 �Ҵ�

		int[] origin = { 1, 2, 3, 4, 5 };
		int[] copy = origin.clone();

		// �������
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");

		}
		System.out.println();

		// �� ���� �Ǿ����� copy Ȯ��

		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {

			System.out.print(copy[i] + " ");

		}
		System.out.println();
	}

	// ���翡 ���� ������ ���� ������
	// ���� ���縦 �ϸ� ���� �ּҸ� ���� => ���� / ���纻 ���ϳ��� �����ϸ� ���ο��� ������ ��ħ

	// �츮�� ���縦 ����ϴ� ������ �ַ� ������ ������ ä ���纻���� �׽�Ʈ�� �ʿ��� ���
	// (����, ���� ���) => ���� ���縦 �ϴ� ����� �ʿ�!!!
	


	
	
	
	

}