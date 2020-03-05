package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/*
	 * �迭 : ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� �� ����� ������ �ε����� �����Ǹ� �ε����� 0���� ������
	 */

	public void method1() {
		/*
		 * 1. �迭 ���� �ڷ���[] �迭��; �ڷ��� �迭��[];
		 * 
		 */

		int[] arr; // -> �ڷ��� �ڿ� ���ȣ�� �ִ� ���� �ٷ� �迭���� �� �� ����
		// int arr[];

		/*
		 * 2. �迭 �Ҵ� �迭�� = new �ڷ��� [�迭ũ��];
		 */

		arr = new int[5]; // -> �迭�� 5���� int�� ������ ���� �� �ִ�

		// ����� �Ҵ��� ���ÿ� ó�� ����
		int[] arr1 = new int[5];

		/*
		 * 3. �ʱ�ȭ �迭��[�ε���] = ��;
		 */
		arr1[0] = 0;
		arr1[1] = 0;
		arr1[2] = 0;
		arr1[3] = 0;
		arr1[4] = 0;
		// arr1[5] = 0; -> �ε����� 0���� �Ҵ��� ũ�� -1 ���� ����

		// �迭�� ���� : ������ �� �� �ε����� ��ġ�� ���� ������ ��Ģ�� �ִٸ� �ݺ��� ��� ����
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;

		}

		// ��� => for��

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}

	public void method2() {
		// ���� ����
		int i; // �޸� ������ ���� ���� �ڽ��� ����� ����
				// �� �� �޸��� stack�̶�� ������ �Ҵ�

		// �迭 ����
		int[] iArr; // ���� ����� �����ϰ� stack������ ������ ����
					// �ٸ� ���� ��� �뵵�� �ƴ϶� �ּ� ���� ������ ������
					// ���� ��� ������ �׳� ����, �ּ� ���� ��� ������ ���۷���(����) ����

		char cArr[]; // �⺻�ڷ���(boolean, char, byte, short, int, long, float, double
						// ���� ���� �� �ִ� -> ����, �׿ܴ� -> ���۷���

		// �迭 �Ҵ�
		// iArr=new int[]; //�ݵ�� �Ҵ��� ũ�� �������־�� ��
		iArr = new int[5];
		cArr = new char[10];
		// new �����ڸ� ���� �迭�� �Ҵ��ϸ� �޸��� heap������ �ش� �迭�� ũ�⸸ŭ��
		// ������ ����� ���� �� ������ �ּҰ��� stack ������ ���۷��� ������ ����

		// ==> ���� �ش� �迭�� ���� �ְų� ������ �� �ش� �ּҸ� �����ؼ� ���

		System.out.println("iArr : " + iArr);
		System.out.println("cArr : " + cArr);

		// heap ������ �޸𸮿��� ������ ����ٰų� ���������� ������ ���� ���ϴ� ����k
		// �ּҸ� ���ؼ��� ã�ư� �� ����
	}

	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// ��������� �迭�� �����ϰ� �Ҵ��� ������ ���� ���� ���� ���� ����(�ʱ�ȭx)

		// �ش� �ε������� ����ϸ� ������ �������� for���� �̿��� ��¹����� Ȯ��
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);

		}
		System.out.println("===========================");

		for (int i = 0; i < iArr.length; i++)

		{
			System.out.println(iArr[i]);

		}

		/*
		 * int num; System.out.println(num);
		 */

		// ���� ������ �޸� �ʱ�ȭ�� ���� �ʾƵ� ���� ���� ���� ��� ��
		// �迭�� ���� �ʱ�ȭ���� ���� �� JVM�� ������ �⺻ ������ �ʱ�ȭ

		// �ֳ��ϸ� heap ������ ���� ���� ������ ������ �� ����

		// ���ڿ��� ���̸� �˱� ���� length() ��� �޼ҵ带 �̿�
		// ������ �迭�� ���̸� �˱� ���ؼ��� �޼ҵ尡 �ƴ� ������(lentgh)�� �̿�

		System.out.println("iArr�� ���� : " + iArr.length);
		System.out.println("cArr�� ���� : " + cArr.length);
	}

	public void method4() {
		// ����ڿ��� �Է¹��� ������ �迭�� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ���� : ");
		int size = sc.nextInt();
		// double�� �迭 dArr�� ����ڰ� �Է��� size��ŭ �Ҵ�
		double[] dArr = new double[size];

		System.out.println(dArr);
		System.out.println("dArr�� ���� : " + dArr.length);
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}

	}

	public void method5() {
		int[] iArr = new int[5];
		int num = 2;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = num; // 2 4 6 8 10
			num += 2;

		}
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		// hashCode() : �ּҰ��� 10���� ��
		System.out.println("iArr�� ���� : " + iArr.length);

		// iArr[5] = 12 ;
		// �迭�� ���� : �ѹ� ������ ũ��� ������ �Ұ�����

		// ũ�⸦ �ٲٷ��� �ٽ� �迭 ũ�⸦ �����ؼ� �Ҵ����־�� ��
		iArr = new int[10];
		// 10�̶�� ũ���� �迭�� heap������ ���� �����ϰ�
		// ���� ������ �ּ� ���� iArr�̶�� ���۷��� ������ �����

		System.out.println("===== ���� ���� iArr =====");
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		// hashCode() : �ּҰ��� 10���� ��
		System.out.println("iArr�� ���� : " + iArr.length);

		// �ּҰ��� ���� �� ���� �� �� ����
		// �׷��� ������ �����ϰ� �ִ� ������ ����� ���ο���� �����ϹǷ�
		// ���� �迭��?? ==> ��� ������ ���������ʰ� heap������ �յ� ���ٴϴ� ����
		// ==>���� �ð��� ������ ������ �÷��Ͱ� �� �̻� ���� ���ٰ� �Ǵ��Ͽ� ����(�ڵ� �޸� ����)

		// ���� �Ҵ� �� �迭�� �������?
		iArr = null;
		// ���۷��� ������ null ���� ���� �Ǹ� �ּҰ��� null�� �ٲ�Ƿ�
		// heap�� �ִ� �������� ���� ���� �������� �ش� ������ ���߿� ������ �÷��Ͱ� ������

		System.out.println("===== ���� ���� iArr =====");
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		// -> �������� ���⶧���� �ƿ� ����� �Ұ��� �ϱ⶧���� ��������
		// hashCode() : �ּҰ��� 10���� ��
		System.out.println("iArr�� ���� : " + iArr.length);

		// NullPointerException �߻�
		// �ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� ���� �� �߻�

	}

	public void method6() {
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ

		int[] iArr = { 1, 2, 3, 4 };

		// �߰�ȣ ���� ����ϴ� ��� new�����ڸ� ������� �ʾƵ� �Ǹ�,
		// ���� ������ŭ �ڵ����� ũ�Ⱑ �Ҵ�

		int[] iArr2 = new int[] { 1, 2, 3, 4 };

		// iArr�̶� iArr2�� �� �ִ� ���� �����Ƿ� �ѹ� ������ Ȯ���غ���
		System.out.println(iArr == iArr2);
		// ==> ���۷��� �������� �ּҰ��� �������Ƿ�
		// ���� heap������ �Ҵ�Ǿ� �ִ� �ٸ� �迭�̹Ƿ� �ּҴ� ���� �� ����

	}

	public void method7() {
		String[] sArr = new String[5];

		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]); // ���ڿ� �迭�� �⺻ �� null
		}
		// 0�� �ε������� ������ �ε��� ���� �ݺ��Ͽ�
		// ����ڿ��� ���ڿ��� �Է� �ް� �ش� �ε����� ����ڰ� �Է��� ���� �־�
		// �� �ԷµǾ����� ����� ����

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sArr.length; i++) {
			System.out.print("���ڿ� �Է� : ");
			sArr[i] = sc.nextLine();
		}
		// �� �ԷµǾ����� Ȯ��(���)

		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]);

		}
	}

	public void method8() {
		// ����ڿ��� 5���� Ű�� ������ �Է¹޾� �迭�� ��Ƶΰ�
		// �ݺ����� ���� 5���� Ű�� ����, ��� ���ϱ�

		Scanner sc = new Scanner(System.in);

		double[] height = new double[5];

		double sum = 0;
		for (int i = 0; i < height.length; i++) {
			System.out.print("Ű �Է� : ");
			height[i] = sc.nextDouble();
			sum += height[i];

		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / height.length);
	}

	public void method9() {
		// ����ڿ��� �Ѱ��� ������ �Է� �ް� �� ũ�⸸ŭ�� �迭�� �����
		// 1~100������ ���� �� �߻����Ѽ� ��� ����ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// ���� �� �߻�
		// ��� 1. java.lang.Math Ŭ������ random() �޼ҵ�
		// ��� 2. java.util.Random Ŭ����

		Random ran = new Random();
		System.out.println("int ������ ����  : " + ran.nextInt());// ���� = ������
		System.out.println("1 ~ 100������ ���� : " + (ran.nextInt(100) + 1));

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void method10() {
		// �ִ밪 �ּҰ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		// 5���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �Է� : ");
			arr[i] = sc.nextInt();

		}

		int max = arr[0];
		int min = arr[0];

		// 1�� �ε������� �迭 ������ �ݺ��ϸ� �� ���ϱ�
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
			if (min > arr[i]) {
				min = arr[i];

			}
		}

		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּڰ� : " + min);

	}
}
