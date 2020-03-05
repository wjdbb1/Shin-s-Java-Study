package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

/*	// 1. ���̰� 10�� �迭�� ������
	int[] arr
	= new int[10];

	// 2. 1���� 10������ ���� �ݺ����� ���� ������� ����
	
	//arr[0] = 1;
	//arr[1] = 2;
	//arr[2] = 3;
	//arr[3] = 4;
	//arr[4] = 5;
	//arr[5] = 6;
	//arr[6] = 7;
	//arr[7] = 8;
	//arr[8] = 9;
	//arr[9] = 10;
	
	// i��° �ε��� ���� i+1 ���� �־��ָ� �ǰڱ���!

	// 0���� �迭�Ǳ���-1 ���� �ݺ� --> 0�� �ε������� ������ �ε������� �ݺ�
	for(int i = 0; i < arr.length; i++) {
	arr[i] = i+1;
	}

	// 3. �� ������ ���
	for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
	}

	}
*/
	public void practice2() {

		int[] arr = new int[10];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	/*
	// 1. ���̰� 10�� �迭�� ������
	int[] arr = new int[10];

	// 2. 10���� 1������ ���� �ݺ����� ���� ������� ����
	
	//arr[0] = 10;
 //arr[1] = 9;
	//arr[2] = 8;
	//arr[3] = 7;
	//arr[4] = 6;
	//arr[5] = 5;
//arr[6] = 4;
//arr[7] = 3;
//arr[8] = 2;
//arr[9] = 1;
/	
	// i��° �ε��� ���� arr.length-i ���� �־��ָ� �ǰڱ���!

	// 0���� �迭�Ǳ���-1 ���� �ݺ� --> 0�� �ε������� ������ �ε������� �ݺ�
	for(int i = 0; i < arr.length; i++) {
	arr[i] = arr.length - i;
	}

	// 3. �� ������ ���
	for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
	}

	}
*/


	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ����: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

/*	
	// 1. ����ڿ��� ���� �Է� �ޱ�

	Scanner sc = new Scanner(System.in);

	System.out.print("���� ���� : ");
	int size = sc.nextInt();

	// 2. �迭�� �Ҵ��� ���� ����ڰ� �Է��� ����(size)��ŭ�� ũ��� �Ҵ�
	int[] arr = new int[size];

	// 3. 1���� �Է¹��� ������ �迭�� �ʱ�ȭ
	for(int i = 0; i < arr.length; i++) {
	arr[i] = i+1;
	}

	// 4. �� ������ ����� ���� Ȯ��
	for(int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] + " ");
	}
	}

*/

	public void practice4() {

		String[] arr = new String[5];

		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[1]) {
				System.out.println(arr[i]);

			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}

		System.out.print(str + "��" + ch + "�� �����ϴ� ��ġ(�ε���) : ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");

				count++;

			}
		}

		System.out.println();
		System.out.println(ch + "���� : " + count);

	}

	public void practice6() {

		String[] arr = { "��", "ȭ", "��", "��", "��", "��", "��" };

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "����");

		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭" + i + "�� ° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();

		} // 3. ��ü �� ���� �� �� �� ���
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) { // 3�̻��̸鼭 Ȧ���� ���(��, �� �Է��� ���)

				// ����ڰ� �Է��� ���� ũ�� ��ŭ�� �迭�� ������

				int[] arr = new int[num];

				// ���� �ֱ� ���� ���� --> ���������� ��� 1�� ������ų ���� ���������� ��� 1�� ���ҽ�ų����
				int count = 1;

				// �߰����� ����
				for (int i = 0; i < arr.length / 2; i++) {
					arr[i] = count++; // 1����
				}
				// �߰����� ����
				for (int i = arr.length / 2; i < arr.length; i++) {
					arr[i] = count--;
				}

				// ���
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				break; // ����� ���� �ϰ� ���� �ݺ��� ����������

			} else { // 3�̻��� �ƴϰų� Ȧ���� �ƴѰ�� (��,�߸� �Է��� ���)
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
		String str = sc.nextLine();

		/*
		 * String[] arr = new String[5]; arr[0] = "���"; arr[1] = "�Ķ��̵�"; arr[2] = "����";
		 * arr[3] = "ĥ��";
		 */

		String[] arr = { "���", "�Ķ��̵�", "����", "ĥ��" };

		int i = 0;

		for (; i < arr.length; i++) {

			if (arr[i].equals(str)) {

				break;
			}
		}
		if (i < arr.length) {
			System.out.println(str + "ġŲ ��ް���");

		} else {
			System.out.println(str + "ġŲ�� ���� �޴� �Դϴ�.");
		}

	}

	public void practice10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			System.out.print(arr[i] + " ");
		}
	}
}