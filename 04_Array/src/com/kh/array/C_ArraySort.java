package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	// �迭 ����
	public void method1() {
		// �迭�� �����ϱ⿡ �ռ��� ������ ������ ���� �����ϴ� �׽�Ʈ����

		// �� ���� ������ ���� ���� ����

		int num1 = 20;
		int num2 = 10;

		System.out.println("==== ���� �� ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		// ���� �ӽ÷� ������ ���ο� ������ ���� �̵� ���Ѿ� ��

		int temp; // �ӽ÷� ���� ������ �� ����

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("==== ���� �� ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

	}

	public void method2() {
		// �迭�� �����ϰ� ��ġ ���� ����
		int[] arr = { 2, 1, 3 }; // �ϳ��� �ަU���� �б� : 1, 3, 2

		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}

	public void method3() {
		int[] arr = { 2, 5, 4, 1, 3 };

		// ���� ����
		// �迭�� n�� �ε��� ���� 0�� ~ n-1�� �ε��� ���� ��

		// i = 1 j = 0~0
		// i = 2 j = 0~1
		// i = 3 j = 0~2
		// i = 4 j = 0~3

		// ������ ��� �տ����� ���ؼ� i>j�ϋ� ���� �ٲ���

		// �������� ����
		// �ε��� �� ���� ������Ű�� �ݺ���
		for (int i = 1; i < arr.length; i++) {
			// �ε����� ������ �� ���� ó������ �ش� �ε������� ���ϴ� �ݺ���
			for (int j = 0; j < i; j++) {
				System.out.println("���� �ε��� ��ġ : " + i + ", " + j);
				// ���������� ���� ���� ó��
				if (arr[i] < arr[j]) { // �������� -->i�� j���� ������ (i�� ����)
										// ���������� �ε�ȣ�� �ݴ�� ó���ϸ� ����
					System.out.println("===== ��ȯ �߻� =====");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				// ���� ����� �ٷ� Ȯ���غ���
				System.out.println(i + "ȸ�� : " + Arrays.toString(arr));
				// �����ϰ� Array�� ���ٷ� ����غ��� ���� �� ���
				System.out.println();
			}

		}

	}

	public void method4() {
		int[] arr = { 2, 5, 4, 1, 3 };

		// �������� ����
		Arrays.sort(arr);
		// Arrays.sort(arr,0,3); //fromIndex, toIndex
		// 0�� �ε������� 3�� �ε��� ������ ����

		System.out.println(Arrays.toString(arr));

		// Arrays.sort()�� ���� ���������� �������� ����
		// ���� ���������� �����ϰ� �ʹٸ� ���ο� �迭�� ���� �Ųٷ� ����
		int[] copy = new int[5];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = arr[copy.length - 1 - i];

		}
		System.out.println(Arrays.toString(copy));
	}
	// ���� ����� ���� ���� �̿ܿ��� ��������, �������� �� ���� ����� �����Ƿ�
	// �߰������� �����ϰ� �ʹٸ� ã�Ƽ� ���� ��________��
}