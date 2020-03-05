package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeA {
	public void method1() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void method2() {
		int[] arr = new int[10];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void method4() {
		String[] arr = new String[5];

		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";

		System.out.println(arr[1]);

	}

	public void method5() {///////////////////////
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		System.out.print("���� : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

		}
		int count = 0;
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + "���� : " + count);

	}

	public void method6() {
		String[] arr = { "��", "ȭ", "��", "��", "��", "��", "��" };

		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num <= 6 && num >= 0) {

			System.out.print(arr[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

	public void method7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {

			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}

		System.out.println();
		System.out.println("�� �� : " + sum);
	}

	public void method8() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			int size = sc.nextInt();

			if (size >= 3 && size % 2 == 1) {
				int[] arr = new int[size];

				int count = 1;
				for (int i = 0; i < arr.length / 2; i++) {
					arr[i] = count++;

				}
				for (int i = arr.length / 2; i < arr.length; i++) {
					arr[i] = count--;

				}
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}

	}

	public void method9() {

		String[] arr = { "���", "����", "�Ķ��̵�", "�Ѹ�Ŭ" };

		Scanner sc = new Scanner(System.in);

		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String menu = sc.nextLine();
		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i].equals(menu)) {

				break;

			}
		}
		if (i < arr.length) {
			System.out.print(menu + "ġŲ ��� ����");
		} else
			System.out.print(menu + "ġŲ�� ���� �޴��Դϴ�.");
	}

	public void method10() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void method11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// ���
		}
	}

	public void method12() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String jumin = sc.nextLine();

		char[] origin = new char[jumin.length()];

		for (int i = 0; i < origin.length; i++) {
			origin[i] = jumin.charAt(i);
		}

		// System.out.println("���� �迭 ���");
		// for (int i = 0; i < origin.length; i++) {
		// System.out.print(origin[i]);
		// }
		// System.out.println();

		char[] copy = new char[origin.length];

		for (int i = 0; i < origin.length; i++) {
			if (i < 8) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
		}
		// System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
		System.out.println();

		// System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		// System.out.println("copy�� �ּҰ� : " + copy.hashCode());

	}

	public void method13() {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// ���
		}
	}

	public void method14() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}

		int count = 0;

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			count++;

		}
		System.out.print("���� ���� : " + count);

	}

	public void method15() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է��ϼ���  : ");
		int size = sc.nextInt();
		sc.nextLine();

		String[] arr = new String[size];

		for (int i = 0; i < arr.length; i++) {

			System.out.print(i + 1 + "��° ���ڿ� : ");
			arr[i] = sc.nextLine();

		}
		while (true) {
			System.out.print("�� ���� �Է� �Ͻðڽ��ϱ�?(Y/N) : ");
			char answer = sc.next().charAt(0);
			sc.nextLine();

			if (answer == 'y' || answer == 'Y') {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int size2 = sc.nextInt();
				sc.nextLine();

			}

		}

	}

}
