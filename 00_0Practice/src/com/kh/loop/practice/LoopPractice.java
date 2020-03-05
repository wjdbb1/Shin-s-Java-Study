package com.kh.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
		if (num < 1) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ��Է��ϼ���.");

			}
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		if (num < 1) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ��Է��ϼ���.");

			}
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(i);
			} else {

				System.out.print(i + " + ");

			}
			sum += i;
		}
		System.out.print(" = " + sum);

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		int min = 0;
		int max = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;

		}
		if (num1 > 0 && num2 > 0) {
			//int sum = 0;
			for (int i = min; i <= max; i++) {

				System.out.print(i + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();

			System.out.print("�ι�° ���� : ");
			int num2 = sc.nextInt();

			int min = 0;
			int max = 0;
			if (num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;

			}
			if (num1 > 0 && num2 > 0) {
				int sum = 0;
				for (int i = min; i <= max; i++) {

					System.out.print(i + " ");

				}
				break;
			} else {
				System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
			}

		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();

		System.out.println("==== " + dan + "�� ====");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		/*
		 * if (dan >= 2 && dan <= 9) { for (int i = 1; i < 10; i++) {
		 * System.out.println(dan+"*"+i+"="+(dan * i)); } } else {
		 * System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�"); }
		 */

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {

			for (int i = dan; dan <= 9; dan++) {
				System.out.println("==== " + dan + "�� ====");

				for (int j = 1; j <= 9; j++) {

					System.out.println(dan + " * " + j + " = " + (dan * j));
				}

			}
		} else {
			System.out.println("2~9������ ���ڸ� �Է����ּ���.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("���� : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {

				for (int i = dan; dan <= 9; dan++) {
					System.out.println("==== " + dan + "�� ====");

					for (int j = 1; j <= 9; j++) {

						System.out.println(dan + " * " + j + " = " + (dan * j));
					}

				}
				break;
			} else {
				System.out.println("2~9������ ���ڸ� �Է����ּ���.");
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int snum = sc.nextInt();
		System.out.print("���� : ");
		int tnum = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(snum + (tnum * i) + " ");
		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	public void practice14() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�����ڸ� �Է�(+, -, *, /, %) : ");
			String op = sc.nextLine();

			if (op.equals("exit")) {
				System.out.print("���α׷��� �����մϴ�. ");
				break;
			}
			System.out.print("����1 : ");
			int num1 = sc.nextInt();

			System.out.print("����2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			int result = 0;

			if (op.equals("+")) {
				result = num1 + num2;

			} else if (op.equals("-")) {
				result = num1 - num2;

			} else if (op.equals("*")) {
				result = num1 * num2;

			} else if (op.equals("/")) {
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				}
			} else if (op.equals("%")) {
				result = num1 % num2;

			}

			else {
				System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		}
	}

	public void practice15() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		boolean flag = true; // �Ҽ����� �ƴ��� �������� ���� flag ����

		if (num >= 2) {

		for (int i = 2; i < num; i++) { // 2 ~ num-1 ���� �ݺ� (��, 1�� �ڱ� �ڽ��� ����)

		if (num % i == 0) { // 2 ~ num-1 ���� �ѹ��� ������ �� ����������� ������ �ѹ��̶� ������

		flag = false; // num�� �Ҽ��� �ƴ϶�� �Ҹ� --> false�� �ٲ����
		break; // ���̻� �����غ� ��ġ ��� break �ް� �ݺ��� ���� ����
		}
		}

		if (flag) { // flag ���� true�� ���
		System.out.println("�Ҽ��Դϴ�.");
		} else {
		System.out.println("�Ҽ��� �ƴմϴ�.");
		}

		} else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		}

	public void practice16() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();

			boolean flag = true;

			if (num >= 2) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						flag = false;
						break;
					}
				}

				if (flag) {
					System.out.println("�Ҽ��Դϴ�.");
				} else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}

				break;

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();

		boolean flag = true;
		int count = 0; // �Ҽ� ���� ���� ��ų ����

		if (num >= 2) {
			for (int i = 2; i <= num; i++) {

				for (int j = 2; j < i; j++) {

					if (i % j == 0) {
						flag = false;
						break;
					}
				}

				if (flag) { // �Ҽ��� ���
					System.out.print(i + " ");
					count++;
				}

				flag = true; // �ٽ� true�� �ʱ�ȭ
			}
			System.out.println();
			System.out.println("2���� " + num + "���� �Ҽ��� ������ " + count + "���Դϴ�.");

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int user = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= user; i++) { // 1���� ����ڰ� �Է��� ������

			if (i % 2 == 0 || i % 3 == 0) { // 2�� ����������ų� 3���� ����������� : 2�� ����̰ų� 3�� ����̸� ���
				System.out.print(i + " ");
			}

			if (i % 2 == 0 && i % 3 == 0) { // 2�ε� ����������� 3���ε� ����������� : 2�� 3�� ������϶� count ����
				count++;
			}
		}
		System.out.println("count : " + count);
	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			System.out.println("*");
		}
	}

	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println("");

		}

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			// ���� ���� ���
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();// ����
		}
	}

	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				// ù���� �ٰ� ������ ���� ��� "*"���
				if (i == 0 || i == num - 1) {
					System.out.print("*");
				} else {
					if (j == 0 || j == num - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");

					}
				}
			}
			System.out.println();
		}

	}

	public void practice23() {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		do {

			System.out.print("���� �Է� : ");
			int num = sc.nextInt();

			int ran1 = (int) (Math.random() * 6) + 1;
			int ran2 = (int) (Math.random() * 6) + 1;

			System.out.println("ù��° �ֻ��� ���� �� : " + ran1);
			System.out.println("�ι�° �ֻ��� ���� �� : " + ran2);
			System.out.println("�� �ֻ��� ���� �� : " + (ran1 + ran2));

			if (num == (ran1 + ran2)) {
				System.out.println("������ϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}

			System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
			ch = sc.next().charAt(0);

		} while (ch != 'n' && ch != 'N');

	}

}

/*
public void practice1() { // only for��
	Scanner sc = new Scanner(System.in);
	System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
	int user = sc.nextInt();

	if (user >= 1) {
		for (int i = 1; i <= user; i++) {
			System.out.print(i + " ");
		}
	} else {
		System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	}
}

public void practice2() { // for�� + while�� + �б⹮
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			break;
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
}

public void practice3() { // only for��
	Scanner sc = new Scanner(System.in);

	System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
	int user = sc.nextInt();

	if (user >= 1) {

		for (int i = user; i >= 1; i--) {
			System.out.print(i + " ");
		}

	} else {
		System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	}
}

public void practice4() { // for�� + while�� + �б⹮
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			break;
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
}

public void practice5() { // only for��
	Scanner sc = new Scanner(System.in);

	System.out.print("������ �ϳ� �Է��ϼ��� : ");
	int num = sc.nextInt();

	int sum = 0;

	// for�� ���
	for (int i = 1; i <= num; i++) {
		sum += i;

		if (i != num) {
			System.out.print(i + " + ");
		} else {
			System.out.print(i + " = ");
		}
	}
}

public void practice6() { // only for��
	Scanner sc = new Scanner(System.in);

	System.out.print("ù ��° ���� : ");
	int num1 = sc.nextInt();

	System.out.print("�� ��° ���� : ");
	int num2 = sc.nextInt();

	if (num1 >= 1 && num2 >= 1) {

		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}

	} else {
		System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
	}
}

public void practice7() { // for�� + while�� + �б⹮
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 >= 1) {
			int max = 0;
			int min = 0;

			if (num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}

			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}

			break;

		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
}

public void practice8() { // only for��
	Scanner sc = new Scanner(System.in);

	System.out.print("���� : ");
	int num = sc.nextInt();

	System.out.println("===== " + num + "�� =====");

	for (int i = 1; i < 10; i++) {
		System.out.printf("%d * %d = %d\n", num, i, (num * i));
	}
}

// -------------- ��ø �ݺ��� ----------------------

public void practice9() {
	Scanner sc = new Scanner(System.in);

	System.out.print("���� : ");
	int num = sc.nextInt();

	if (num >= 2 && num <= 9) {

		for (int i = num; i < 10; i++) { // ���� �����ϴ� for��
			System.out.printf("===== %d�� =====\n", i);

			for (int j = 1; j <= 9; j++) { // �������� ���� �����ϴ� for��
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}

			System.out.println();
		}

	} else {
		System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
	}
}

public void practice10() {
	Scanner sc = new Scanner(System.in);

	while (true) {

		System.out.print("���� : ");
		int num = sc.nextInt();

		if (num >= 2 && num <= 9) {

			for (int i = num; i <= 9; i++) { // ���� �����ϴ� for��
				System.out.printf("===== %d�� =====\n", i);

				for (int j = 1; j <= 9; j++) { // �������� ���� �����ϴ� for��
					System.out.printf("%d * %d = %d%n", i, j, (i * j));
				}

				System.out.println();
			}
			break;

		} else {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
		}
	}
}

public void practice11() {
	Scanner sc = new Scanner(System.in);

	System.out.print("���� ���� : ");
	int start = sc.nextInt();

	System.out.print("���� : ");
	int num = sc.nextInt();

	// for�� ���
	for (int i = 1; i <= 10; i++) { // 10�� �ݺ�
		System.out.print(start + " ");
		start += num;
	}
}

public void practice12() { // �� ���
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int num = sc.nextInt();

	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void practice13() { // �� ���
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �Է� : ");
	int num = sc.nextInt();

	for (int i = num; i > 0; i--) {
		for (int j = i; j > 0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}

	// �ٸ� ���
	
	 * for(int i = num; i > 0; i--) {
	 * 
	 * for(int j=1; j<=i; j++) { System.out.print("*"); }
	 * 
	 * System.out.println(); }
	 
}

public void practice14() {
	Scanner sc = new Scanner(System.in);

	// ������ �Է� �ް�
	// �ش� �����ȣ�� exit�� ��� (���ǹ�) --> ���α׷� ���� (�ݺ��� ����)
	// ���� �� ���� �Է¹ް�
	// �����ȣ�� / �鼭 �ι�° ������ 0�� ��� (���ǹ�) --> �������� ��� (�ݺ��� �ٽ� ����)
	// �����ȣ�� ���� �ش� ��� ��¹� ���

	while (true) {
		System.out.print("������(+, -, *, /, %) : ");
		String op = sc.nextLine();

		if (op.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�.");
			break; // exit �Է½� �ݺ����� ��������
		}

		System.out.print("����1 : ");
		int num1 = sc.nextInt();

		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		// �����ڰ� /�̰� �ι�° ������ 0�� ���
		if (op.equals("/") && num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
			continue; // ���� ������� �������� �ʰ� �ٷ� �ݺ����� ���� �ö�
		}

		int result = 0;

		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n");
			continue; // ������ �� �� �Է½� �Ʒ��� ��¹� �����ϰ� �ݺ����� ���� �ö�
		}

		System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
		System.out.println();
	}
}

// hard ver
// ------------------------------------------------------------------------------

public void practice15() {
	// ������ �������� ���� 1�� �ڱ� �ڽ� �ۿ� ���� �� --> �Ҽ�
	// ���� ��� 4�� ���
	// 4 % 1 == 0
	// 4 % 2 == 0
	// 4 % 3 == 1
	// 4 % 4 == 0
	// 4��� ���ڴ� ����������� ���� 1�� �ڱ� �ڽ� ������ 2�� �ִ�. --> �Ҽ� X

	// ���� ��� 5�� ���
	// 5 % 1 == 0
	// 5 % 2 == 1
	// 5 % 3 == 2
	// 5 % 4 == 1
	// 5 % 5 == 0
	// 5��� ���ڴ� ������ �������� ���� 1�� �ڱ� �ڽ� �ۿ� ���� --> �Ҽ� O
	Scanner sc = new Scanner(System.in);

	System.out.print("���� : ");
	int num = sc.nextInt();

	boolean flag = true; // �Ҽ����� �ƴ��� �������� ���� flag ����

	if (num >= 2) {

		for (int i = 2; i < num; i++) { // 2 ~ num-1 ���� �ݺ� (��, 1�� �ڱ� �ڽ��� ����)

			if (num % i == 0) { // 2 ~ num-1 ���� �ѹ��� ������ �� ����������� ������ �ѹ��̶� ������

				flag = false; // num�� �Ҽ��� �ƴ϶�� �Ҹ� --> false�� �ٲ����
				break; // ���̻� �����غ� ��ġ ��� break �ް� �ݺ��� ���� ����
			}
		}

		if (flag) { // flag ���� true�� ���
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}

	} else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
}

public void practice16() {
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("���� : ");
		int num = sc.nextInt();

		boolean flag = true;

		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println("�Ҽ��Դϴ�.");
			} else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}

			break;

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}

public void practice17() {
	Scanner sc = new Scanner(System.in);

	System.out.print("���� : ");
	int num = sc.nextInt();

	boolean flag = true;
	int count = 0; // �Ҽ� ���� ���� ��ų ����

	if (num >= 2) {
		for (int i = 2; i <= num; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) { // �Ҽ��� ���
				System.out.print(i + " ");
				count++;
			}

			flag = true; // �ٽ� true�� �ʱ�ȭ
		}

		System.out.println("2���� " + num + "���� �Ҽ��� ������ " + count + "���Դϴ�.");

	} else {
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
}

public void practice18() {
	Scanner sc = new Scanner(System.in);

	System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
	int user = sc.nextInt();
	int count = 0;

	for (int i = 1; i <= user; i++) { // 1���� ����ڰ� �Է��� ������

		if (i % 2 == 0 || i % 3 == 0) { // 2�� ����������ų� 3���� ����������� : 2�� ����̰ų� 3�� ����̸� ���
			System.out.print(i + " ");
		}

		if (i % 2 == 0 && i % 3 == 0) { // 2�ε� ����������� 3���ε� ����������� : 2�� 3�� ������϶� count ����
			count++;
		}
	}
	System.out.println("count : " + count);
}

public void practice19() {
	Scanner sc = new Scanner(System.in);

	System.out.print("���� �Է� : ");
	int user = sc.nextInt();

	for (int i = 1; i <= user; i++) {
		// ���� ���� ���
		for (int j = 1; j <= user - i; j++) {
			System.out.print(" ");
		}
		// �� ���
		for (int k = 1; k <= i; k++) {
			System.out.print("*");
		}
		System.out.println(); // ����
	}
}

public void practice20() {
	Scanner sc = new Scanner(System.in);

	System.out.print("Ȧ�� �Է� : ");
	int user = sc.nextInt();

	// ���� �ﰢ��
	for (int i = 0; i < user / 2; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// �Ʒ��� �ﰢ��
	for (int i = user / 2; i < user; i++) {
		for (int j = user - i; j > 0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void practice21() {
	Scanner sc = new Scanner(System.in);

	System.out.print("���� �Է� : ");
	int user = sc.nextInt();

	for (int i = 0; i < user; i++) {
		// ���� ���� ���
		for (int j = 0; j < user - i - 1; j++) {
			System.out.print(" ");
		}
		// �� ���
		for (int k = 0; k < i * 2 + 1; k++) {
			System.out.print("*");
		}
		System.out.println(); // ����
	}
}

public void practice22() {
	Scanner sc = new Scanner(System.in);

	
	System.out.print("���� �Է� : ");
	int user = sc.nextInt();

	for (int i = 0; i < user; i++) {
		for (int j = 0; j < user; j++) {
			// ù ��° �ٰ� ������ ���� ��� "*" ���
			if (i == 0 || i == user - 1) {
				System.out.print("*");
			} else {
				if (j == 0 || j == user - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}

public void method23() {
	Scanner sc = new Scanner(System.in);
	char ch = ' ';
	do {
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		int ran1 = (int) (Math.random() * 6) + 1;
		int ran2 = (int) (Math.random() * 6) + 1;

		System.out.println("ù��° �ֻ��� ���� �� : " + ran1);
		System.out.println("�ι�° �ֻ��� ���� �� : " + ran2);
		System.out.println("�� �ֻ��� ���� �� : " + (ran1+ran2));
		
		if(num == (ran1+ran2)) {
			System.out.println("������ϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
		ch = sc.next().charAt(0);
		
	
	} while (ch != 'n' && ch != 'N');
}

}
*/