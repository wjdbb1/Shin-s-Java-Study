package com.kh.condition.practice;

import java.util.Scanner;

public class PracticeCo {
	public void method1() {

		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");

		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();

		String result = "";

		if (num == 1) {
			result = "�Է�";
		} else if (num == 2) {
			result = "����";
		} else if (num == 3) {
			result = "��ȸ";
		} else if (num == 4) {
			result = "����";
		} else if (num == 9) {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			return;
		}
		System.out.println(result + "�޴��Դϴ�.");

		/*
		 * if (num == 1) { System.out.println("�Է� �޴� �Դϴ�."); } else if (num == 2) {
		 * System.out.println("���� �޴� �Դϴ�."); } else if (num == 3) {
		 * System.out.println("��ȸ �޴� �Դϴ�."); } else if (num == 4) {
		 * System.out.println("���� �޴� �Դϴ�."); } else if (num == 9) {
		 * System.out.println("���α׷��� ����˴ϴ�."); } else {
		 * System.out.println("�߸� �Է��Ͽ����ϴ�."); }
		 */
		/*
		 * switch (num) { case 1: System.out.println("�Է� �޴� �Դϴ�."); break; case 2:
		 * System.out.println("���� �޴� �Դϴ�."); break; case 3:
		 * System.out.println("��ȸ �޴� �Դϴ�."); break; case 4:
		 * System.out.println("���� �޴� �Դϴ�."); break;
		 * 
		 * case 9: System.out.println("���α׷��� ����˴ϴ�."); break; default:
		 * System.out.println("�߸� �Է��Ͽ����ϴ�."); break;
		 * 
		 * }
		 */
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");

			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}

		/*
		 * if (num > 0 && num % 2 == 0) { System.out.println("¦����"); } else if (num > 0
		 * && num % 2 == 1) { System.out.println("Ȧ����"); } else if (num <= 0) {
		 * System.out.println("����� �Է����ּ���."); }
		 */

	}

	public void method3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();

		System.out.print("���� : ");
		int eng = sc.nextInt();

		System.out.print("���� : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = (kor + eng + math) / 3;

		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {

			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");

		}

	}

	public void method4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12�� ������ ���� �Է� : ");
		int month = sc.nextInt();

		String season = "";
		switch (month) {

		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default:
			season = "�߸� �Էµ� ��";
			break;
		}

		System.out.println(month + "���� " + season + "�Դϴ�.");
	}

	public void method5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� : ");
		String InputId = sc.nextLine();

		System.out.print("��й�ȣ : ");
		String InputPw = sc.nextLine();

		String id = "sjh";
		String pw = "qwe123";

		if (InputId.equals(id)) {
			if (InputPw.equals(pw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}

	}

	public void method6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str = sc.nextLine();

		switch (str) {
		case "������":
			System.out.println("ȸ������, �Խñ۰���");
		case "ȸ��":
			System.out.println("�Խñ��ۼ�, ����ۼ�");
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;

		default:

			System.out.println("�߸� �Է��߽��ϴ�.");

		}
		/*
		 * if (str.equals("������")) {
		 * System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ����ۼ�"); } else if
		 * (str.equals("ȸ��")) { System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ����ۼ�"); } else if
		 * (str.equals("��ȸ��")) { System.out.println("�Խñ� ��ȸ"); } else {
		 * System.out.println("�߸� �Է��߽��ϴ�."); } }
		 */
	}

	public void method7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ű(cm)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();

		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		int weight = sc.nextInt();

		double bmi = weight / (height * height);
		System.out.println("BMI ���� : " + bmi);

		if (bmi < 18.5) {

			System.out.println("��ü��");
		} else if (bmi < 23) {

			System.out.println("����ü��");
		} else if (bmi < 25) {

			System.out.println("��ü��");
		} else if (bmi < 30) {

			System.out.println("��");
		} else /* if (bmi >= 30) */ {

			System.out.println("����");
		}

	}

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();

		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();

		System.out.print("�����ڸ� �Է�(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);

		int result = 0;
		if (num1 > 0 && num2 > 0) {
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;

			default:
				System.out.println("�����ȣ�� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
		} else {
			System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			return;

		}
		System.out.printf("%d %c %d %c %d", num1, op, num2, '=', result);

		/*
		 * if (num1 > 0 && num2 > 0) { if (op == '+') {
		 * 
		 * result = num1 + num2; } else if (op == '-') {
		 * 
		 * result = num1 - num2; } else if (op == '*') {
		 * 
		 * result = num1 * num2; } else if (op == '/') {
		 * 
		 * result = num1 / num2; } else if (op == '%') {
		 * 
		 * result = num1 % num2; } else {
		 * 
		 * System.out.println("�����ȣ�� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return; } } else {
		 * 
		 * System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
		 * 
		 * } System.out.printf("%d %c %d %c %d", num1, op, num2, '=', result);
		 * 
		 * }
		 */
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�߰� ��� ���� : ");
		int score1 = sc.nextInt();

		System.out.print("�⸻ ��� ���� : ");
		int score2 = sc.nextInt();

		System.out.print("���� ���� : ");
		int score3 = sc.nextInt();

		System.out.print("�⼮  ���� : ");
		int att = sc.nextInt();

		double m = score1 * 0.2;
		double f = score1 * 0.3;
		double hw = score3 * 0.3;
		double at = att;

		double sum = m + f + hw + at;

		System.out.println("======= ��� =======");
		if (sum >= 70 && at >= 20 * 0.7) {
			System.out.println("�߰� ��� ����(20) : " + m);
			System.out.println("�⸻ ��� ����(30) : " + f);
			System.out.println("���� ����       (30) : " + hw);
			System.out.println("�⼮ ����       (20) : " + at);

			System.out.println("���� : " + sum);
			System.out.println("PASS");
		} else {
			if (sum >= 70) {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + att + "/20)");
			} else if (at >= 20 * 0.7) {
				System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
			} else {
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + att + "/20)");
				System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
			}
		}

	}

	

	public void method10() {

		System.out.println("1. �޴� ���");
		System.out.println("2. �޴� ���");
		System.out.println("3. �޴� ���");
		System.out.println("4. �޴� ���");
		System.out.println("5. �޴� ���");
		System.out.println("6. �޴� ���");
		System.out.println("7. �޴� ���");
		System.out.println("8. �޴� ���");
		System.out.println("9. �޴� ���");

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			method1();
			break;
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method4();
			break;
		case 5:
			method5();
			break;
		case 6:
			method6();
			break;
		case 7:
			method7();
			break;
		case 8:
			method8();
			break;
		case 9:
			method9();
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");

		}
	}

}