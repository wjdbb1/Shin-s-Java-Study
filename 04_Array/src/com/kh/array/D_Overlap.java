package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	// �ߺ� ����

	public void method1() {
		// ����ڿ��� 5���� ���� �Է� �޾� �迭�� ����
		// ��, �ߺ� ���� ������� ����

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "��° ���� �� : ");
			arr[i] = sc.nextInt();// �Է�

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) { // �ߺ� ���� ���� ���(if������ ���� ����)
					System.out.println("�ߺ� ���� �����մϴ�.");

					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// ���
		}
	}

	public void method2() {
		int[] arr = new int[5];

		// ������ 1���� 10������ ������ �ߺ����� �߻����� arr�� ���

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) { // ������ �߻��� ���� ���� ��
				if (arr[i] == arr[j]) { // �ߺ��� ���� ������
					System.out.println(j + "��°�� " + i + "��° : " + arr[i] + "�ߺ�");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public void method3() {
		// method2�� �����ϰ� ���� ��(�ߺ����� ������ )
		// �������� ����(���� ���ķ� ����)�Ͽ� ����غ���

		int[] arr = new int[5];

		// ������ 1���� 10������ ������ �ߺ����� �߻����� arr�� ���

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) { // ������ �߻��� ���� ���� ��
				if (arr[i] == arr[j]) { // �ߺ��� ���� ������
					System.out.println(j + "��°�� " + i + "��° : " + arr[i] + "�ߺ�");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}
}