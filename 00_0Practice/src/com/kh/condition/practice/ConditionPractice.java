package com.kh.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {

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
		}

		if (num == 2) {
			result = "����";

		}
		if (num == 3) {
			result = "��ȸ";
		}
		if (num == 4) {
			result = "����";

		}
		if (num == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");
			return;
		}
		System.out.println(result + " �޴� �Դϴ�.");
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� �� �Է��ϼ���: ");
		int num = sc.nextInt();

		/*
		 * if (num % 2 == 0 && num > 0) { System.out.println("¦����"); } if (num % 2 != 0
		 * && num > 0) { System.out.println("Ȧ����"); } if (num < 0) {
		 * System.out.println("����� �Է����ּ���");
		 */

		/*
		 * if (num % 2 == 0 && num > 0) { System.out.println("¦����"); } else if (num % 2
		 * != 0 && num > 0) { System.out.println("Ȧ����"); } else {
		 * System.out.println("����� �Է����ּ���"); }
		 */

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = (kor + eng + mat) / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + mat);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ� !");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void practice4() {

		/*
		 * if (month == 1 || month == 2 || month == 12) { season = "�ܿ�"; } else if
		 * (month >= 3 && month <= 5) { season = "��"; } else if (month >= 6 && month <=
		 * 8) { season = "����"; } else if (month >= 9 && month <= 11) { season = "����"; }
		 * else { season = "�ش��ϴ� ������ �����ϴ�."; }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;

		default:
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� : ");
		String id = sc.nextLine();

		System.out.print("��й�ȣ  : ");
		String pw = sc.nextLine();

		if (id.equals("sjh")) {
			if (pw.equals("qwe11")) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");

		}
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String grade = sc.nextLine();

		if (grade.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ��ۼ�, ����ۼ�, �Խñ���ȸ");

		} else if (grade.equals("ȸ��")) {
			System.out.println("�Խñ��ۼ�, �Խñ���ȸ, ����ۼ�");

		} else if (grade.equals("��ȸ��")) {
			System.out.println("�Խñ���ȸ");

		} else {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();

		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMI ���� : " + bmi);

		String result = "";

		if (bmi >= 30) {
			result = "����";

		} else if (bmi < 18.5) {
			result = "��ü��";
		} else if (bmi <= 18.5) {
			result = "���� ü��";
		} else if (bmi <= 23) {
			result = "��ü��";
		} else if (bmi < 25) {
			result = "�� ��";
		}
		System.out.println(result);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();

		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();

		sc.nextLine();
		System.out.print("�����ڸ� �Է�(+, -, *, /, %) : ");
		char op = sc.nextLine().charAt(0);

		int result = 0;

		if (num1 > 0 && num2 > 0) {
			if (op == '+') {
				result = num1 + num2;

			} else if (op == '-') {
				result = num1 - num2;

			} else if (op == '*') {
				result = num1 * num2;

			} else if (op == '/') {
				result = num1 / num2;

			} else if (op == '%') {
				result = num1 % num2;
			}
		}

		System.out.printf("%d %c %d = %d", num1, op, num2, result);

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�߰� ��� ���� : ");
		int score1 = sc.nextInt();

		System.out.print("�⸻ ��� ���� : ");
		int score2 = sc.nextInt();

		System.out.print("���� ���� : ");
		int score3 = sc.nextInt();

		System.out.print("�⼮ ȸ�� : ");
		int at = sc.nextInt();

		double sum = score1 * 0.2 + score2 * 0.3 + score3 * 0.3 + at;

		System.out.println("==========���==========");
		if (sum >= 70 && at >= (20 * 0.7)) {

			System.out.println("�߰� ��� ���� (20) : " + (double) score1 * 0.2);
			System.out.println("�⸻ ��� ���� (30) : " + (double) score2 * 0.3);
			System.out.println("���� ���� (30) : " + (double) score3 * 0.3);
			System.out.println("�⼮ȸ�� (20) : " + (double) at);
			System.out.println("���� : " + (double) sum);
			System.out.println("PASS");

		} else if (at < 20 * 0.7 && sum < 70) {

			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + at + "/20)");
			System.out.println("FAIL [���� �̴�] (���� " + (double) sum + ")");

		} else if (at < 20 * 0.7) {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + at + "/20)");
		} else {

			System.out.println("FAIL [���� �̴�] (���� " + (double) sum + ")");

		}
	}

	public void practice10() {
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			practice1();
			break;

		case 2:
			practice2();
			break;

		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;

		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");

		}
	}

}

/*
public void practice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. �Է�");
	System.out.println("2. ����");
	System.out.println("3. ��ȸ");
	System.out.println("4. ����");
	System.out.println("9. ����");
	
	System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
	int menu = sc.nextInt();
	
	// 1. if-else if�� �̿��ϴ� ���
	
	
	if(menu == 1) {
		System.out.println("�Է� �޴��Դϴ�.");
	}else if(menu == 2) {
		System.out.println("���� �޴��Դϴ�.");
	}else if(menu == 3) {
		System.out.println("��ȸ �޴��Դϴ�.");
	}else if(menu == 4) {
		System.out.println("���� �޴��Դϴ�.");
	}else if(menu == 9) {
		System.out.println("���α׷��� ����˴ϴ�.");
	}else {
		System.out.println("�߸��Է��ϼ̽��ϴ�.");
	}
	
	
	// 2. switch�� �̿��ϴ� ���
	
	switch(menu) {
	case 1 : System.out.println("�Է� �޴��Դϴ�."); break;
	case 2 : System.out.println("���� �޴��Դϴ�."); break;
	case 3 : System.out.println("��ȸ �޴��Դϴ�."); break;
	case 4 : System.out.println("���� �޴��Դϴ�."); break;
	case 9 : System.out.println("���α׷��� ����˴ϴ�."); break;
	default : System.out.println("�߸��Է��ϼ̽��ϴ�."); break;
	}
	
	
	// 3. switch�� �̿��� �� String ���� �̿��ϴ� ���
	String str = null;
	
	switch(menu) {
	case 1 : str = "�Է�"; break;
	case 2 : str = "����"; break;
	case 3 : str = "��ȸ"; break;
	case 4 : str = "����"; break;
	case 9 : System.out.println("���α׷��� ����˴ϴ�."); return;
	default : System.out.println("�߸��Է��ϼ̽��ϴ�."); return;
	}
	
	System.out.println(str + " �޴��Դϴ�.");
	
}

public void practice2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
	int num = sc.nextInt();
	
	// 1. ��ø if��
	if(num > 0) {
		if(num % 2 == 0) {
			System.out.println("¦����.");
		}else {
			System.out.println("Ȧ����.");
		}
	}else {
		System.out.println("����� �Է����ּ���.");
	}
	
	// 2. if-else if-else ��
	if(num <= 0) {
		System.out.println("����� �Է����ּ���.");
	}else if(num % 2 == 0) {
		System.out.println("¦����.");
	}else {
		System.out.println("Ȧ����.");
	}
}

public void practice3() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� ���� : ");
	int kor = sc.nextInt();
	System.out.print("���� ���� : ");
	int math = sc.nextInt();
	System.out.print("���� ���� : ");
	int eng = sc.nextInt();
	
	int sum = kor + math + eng;
	double avg = sum / 3.0;
	
	if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
		System.out.println("���� : " + eng);
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�����մϴ�. �հ��Դϴ�!");
	} else {
		System.out.println("���հ��Դϴ�.");
	}
	
}

public void practice4() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1 ~ 12 ������ ���� �Է� : ");
	int num = sc.nextInt();
	
	// 1. �̷� ���
	switch(num) {
	case 12:
	case 1:
	case 2:
			System.out.println(num + "���� �ܿ��Դϴ�.");
			break;
	case 3:
	case 4:
	case 5: 
			System.out.println(num + "���� ���Դϴ�.");
			break;
	case 6:
	case 7:
	case 8:
			System.out.println(num + "���� �����Դϴ�.");
			break;
	case 9:
	case 10:
	case 11:
			System.out.println(num + "���� �����Դϴ�.");
			break;
	default : 
			System.out.println(num + "���� �߸� �Էµ� ���Դϴ�.");
			break;
	}
	
	// 2. String ���� ����ؼ� ��¹��� �ѹ���
	String season = "";
	
	switch(num) {
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
	default : 
		season = "�߸� �Էµ� ��";
		break;
	}
	
	System.out.println(num + "���� " + season + "�Դϴ�.");
}

public void practice5() {
	
	String userId = "byeollim";
	String userPwd = "1234";
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���̵� : ");
	String id = sc.nextLine();
	
	System.out.print("��й�ȣ : ");
	String pwd = sc.nextLine();
	
	if(userId.equals(id) && userPwd.equals(pwd)) {
		System.out.println("�α��� ����");
	}else if(!userId.equals(id)) {
		System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
	}else {
		System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
	}
	
}

public void practice6() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
	
	switch(sc.nextLine()) { // �̷��� �ٷ� �Է��ؼ� ���� ����..
	case "������" : System.out.println("ȸ������, �Խñ� ����");
	case "ȸ��"  : System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
	case "��ȸ��" : System.out.println("�Խñ� ��ȸ"); break; // ���⼭ break�ؾ� default������ �Ѿ�� �ʴ´�.
	default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
	}
	
}

public void practice7() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Ű(m)�� �Է����ּ��� : ");
	double height = sc.nextDouble();
	
	System.out.print("������(kg)�� �Է����ּ��� : ");
	double weight = sc.nextDouble();
	
	double bmi = weight / (height * height);
	
	System.out.println("BMI ���� : " + bmi);
	
	if(bmi < 18.5) {
		System.out.println("��ü��");
	}else if(bmi < 23) {
		System.out.println("���� ü��");
	}else if(bmi < 25) {
		System.out.println("��ü��");
	}else {
		System.out.println("��");
	}
	
}

public void practice8() {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("�ǿ�����1 �Է� : ");
	int num1 = sc.nextInt();
	
	System.out.print("�ǿ�����2 �Է� : ");
	int num2 = sc.nextInt();
	sc.nextLine();
	
	System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
	char ch = sc.nextLine().charAt(0);
	
	int result=0;
	
	if(num1 > 0 && num2 > 0) {
		
		switch(ch) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
		}
		
	}else {
		System.out.println("����� �ƴ� ���� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
	}
	
	System.out.printf("%d %s %d = %d", num1, ch, num2, result);

}

public void practice9() {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("�߰� ��� ���� : ");
	int midTerm = sc.nextInt();

	System.out.print("�⸻ ��� ���� : ");
	int finalTerm = sc.nextInt();

	System.out.print("����  ���� : ");
	int homework = sc.nextInt();

	System.out.print("�⼮ Ƚ�� : ");
	int attendance = sc.nextInt();
	
	double m = midTerm * 0.2;
	double f = finalTerm * 0.3;
	double hw = homework * 0.3;
	double at = attendance;
	
	double sum = m + f + hw + at;
	
	System.out.println("===========���==========");
	
	if(sum >= 70 && at >= 20 * 0.7) {
		System.out.println("�߰� ��� ����(20) : " + m);
		System.out.println("�⸻ ��� ����(30) : " + f);
		System.out.println("���� ����       (30) : " + hw);
		System.out.println("�⼮ ����       (20) : " + at);
		
		System.out.println("���� : " + sum);
		System.out.println("PASS");
	}else {
		if(sum >= 70) {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendance + "/20)");
		}else if(at >= 20 * 0.7){
			System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
		}else {
			System.out.println("FAIL [�⼮ Ƚ�� ����] (" + attendance + "/20)");
			System.out.println("FAIL [���� �̴�] (���� " + sum + ")");
		}
	}
	
}

public void practice10() {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("������ ����� �����ϼ���.");
	System.out.println("1. �޴� ���");
	System.out.println("2. ¦��/Ȧ��");
	System.out.println("3. �հ�/���հ�");
	System.out.println("4. ����");
	System.out.println("5. �α���");
	System.out.println("6. ���� Ȯ��");
	System.out.println("7. BMI");
	System.out.println("8. ����");
	System.out.println("9. Pass/Fail");

	System.out.print("���� : ");
	int menu = sc.nextInt();
	
	switch (menu) { 

	case 1:	practice1(); break;
	case 2:	practice2(); break;
	case 3:	practice3(); break;
	case 4:	practice4(); break;
	case 5:	practice5(); break;
	case 6:	practice6(); break;
	case 7:	practice7(); break;
	case 8:	practice8(); break;
	case 9:	practice9(); break;
	default:
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	
}

}
*/
