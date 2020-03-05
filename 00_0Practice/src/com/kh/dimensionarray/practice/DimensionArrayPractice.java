package com.kh.dimensionarray.practice;

import java.util.Scanner;

public class DimensionArrayPractice {
	public void practice1() {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);

			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int cnt = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = cnt--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {

		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + "," + j + ")");

			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 10) + 1;

			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}

		}
		for (int i = 0; i < arr.length - 1; i++) {

			arr[3][3] += arr[i][3] + arr[3][i];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();

		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("�� ũ�� : ");
			int row = sc.nextInt();
			System.out.print("�� ũ�� : ");
			int col = sc.nextInt();

			char[][] arr = new char[row][col];

			if (row >= 1 && row <= 10 && col >= 1 && col <= 10) {

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) ((int) (Math.random() * 26) + 65);
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;

			} else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}

		}

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();

		char[][] arr = new char[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "���� ũ�� : ");
			int col = sc.nextInt();

			arr[i] = new char[col];
		}

		// �� �ʱ�ȭ
		char value = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * while (true) {
	 * 
	 * System.out.print("�� ũ�� : "); int row = sc.nextInt();
	 * 
	 * char[][] arr = new char[row][];
	 * 
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * System.out.print(i + "���� ũ�� : "); int col = sc.nextInt(); arr[i] = new
	 * char[col];
	 * 
	 * // ���ʱ�ȭ
	 * 
	 * for (int j = 0; j < arr[i].length; j++) {
	 * 
	 * }
	 * 
	 * } } }
	 */

	public void practice8() {
		String[] students = { "�迹��", "�迵��", "����", "������", "������", "������", "�̿���", "�ӽ�ȯ", "������", "������", "���¿�", "������" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
		// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
		// �л��� �̾ �� �� �ֵ��� count ���� ����

		// 1�д� �ֵ� �� �ֱ�
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		// 2�д� �ֵ� �� �ֱ�
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		// ���
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9() {
		String[] students = { "�迹��", "�迵��", "����", "������", "������", "������", "�̿���", "�ӽ�ȯ", "������", "������", "���¿�", "������" };

		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		int count = 0;
// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
// �л��� �̾ �� �� �ֵ��� count ���� ����

// 1�д� �ֵ� �� �ֱ�
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

// 2�д� �ֵ� �� �ֱ�
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

// ���
		System.out.println("== 1�д� ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2�д� ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==================================");

		Scanner sc = new Scanner(System.in);

		System.out.print("�˻��� �л� �̸��� �Է��ϼ���: ");
		String name = sc.nextLine();

		String part = ""; // �д�
		int row = 0; // ���° ��
		String col = ""; // ���� ������

		for (int i = 0; i < seat1.length; i++) {

			for (int j = 0; j < seat1[i].length; j++) {

				if (seat1[i][j].equals(name)) {

					part = "1�д�";
					row = i + 1;

					if (j == 0) {
						col = "����";
					} else {
						col = "������";
					}
				}
			}
		}

		for (int i = 0; i < seat2.length; i++) {

			for (int j = 0; j < seat2[i].length; j++) {
				if (seat2[i][j].equals(name)) {

					part = "2�д�";
					row = i + 1;

					if (j == 0) {
						col = "����";
					} else {
						col = "������";

					}
				}
			}
		}

		if (part.equals("")) {
			System.out.println("�˻��Ͻ� �л��� �����ϴ�.");
		} else {
			System.out.println("�˻��Ͻ� " + name + " �л��� " + part + " " + row + "��° �� " + col + "�� �ֽ��ϴ�.");
		}

	}

}

/*
public void practice1() {
	int[][] arr = new int[4][4];
	
	int value = 1;
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = value++;
		}
	}
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.printf("%2d ", arr[i][j]);
		}
		System.out.println();
	}
}

public void practice2() {
	int[][] arr = new int[4][4];
	
	int value = 16;
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = value--;
		}
	}
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.printf("%2d ", arr[i][j]);
		}
		System.out.println();
	}
}

public void practice3() {
	String[][] arr = new String[3][3];
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = "(" + i + ", " + j + ")";
		}
	}
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}

public void practice4() {
	int[][] arr = new int[4][4];
	
	for(int i = 0; i < arr.length-1; i++) {
		for(int j = 0; j < arr[i].length-1; j++) {
			arr[i][j] = (int)(Math.random() * 10 + 1);
			
			arr[i][3] += arr[i][j];
			arr[3][j] += arr[i][j];
			arr[3][3] += arr[i][j];
			
		}
	}
	
	// ���
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.printf("%3d ", arr[i][j]);
		}
		System.out.println();
	}
}


public void practice5() {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("�� ũ�� : ");
		int row = sc.nextInt();
		System.out.print("�� ũ�� : ");
		int col = sc.nextInt();
		
		if((row >= 1 && row <= 10) && (col >= 1 && col <= 10)){
			char[][] arr = new char[row][col];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char)((int)(Math.random() * 26 + 65));
				}
			}
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
			
		}else {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
		
	}
	
}

public void practice6() {
	String[][] arr = {{"��", "��", "��", "��", "��"}, 
					  {"��", "��", "��", "��", "��"}, 
					  {"��", "��", "��", "��", "��"}, 
					  {"��", "��", "��", "��", "��"},
					  {"��", "��", "!", "��", "!!"}};
	
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			// ���ݱ��� �о�Դ� �帧��
			// (0, 0), (0, 1), (0, 2), (0, 3), (0, 4), 
			// (1, 0), (1, 1), (1, 2), (1, 3), (1, 4), 
			// (2, 0), ....
			// ���� �� �� ���ϰ� ���� ��� �ٲ�� �帧

			// ���� �о���ϴ� �帧��
			// (0, 0), (1, 0), (2, 0), (3, 0), (4, 0), 
			// (0, 1), (1, 1), (2, 1), (3, 1), (4, 1), 
			// (0, 2), ....
			// ���� �ѹ� ���ϰ� ���� ��� �ٲ�� �帧

			System.out.print(arr[j][i] + " ");
			// ���� ��� �ȿ��� �����ִ� j�� �տ� �ּ� ������, j�� �� ���� �ٲ�� i�� �ڿ� �ּ� ���� �д�.
		}
		
	}
}

public void practice7() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� ũ�� : ");
	int row = sc.nextInt();
	
	char[][] arr = new char[row][];
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print(i + "���� ũ�� : ");
		int col = sc.nextInt();
		
		arr[i] = new char[col];
	}
	
	// �� �ʱ�ȭ
	char value = 'a';
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = value++;
		}
	}
	
	// ���
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}


public void practice8() {
	String[] students = {"�迹��", "�迵��", "����", "������", "������", "������", 
						 "�̿���", "�ӽ�ȯ", "������", "������", "���¿�", "������"};
	
	String[][] seat1 = new String[3][2];
	String[][] seat2 = new String[3][2];
	
	int count = 0;
	// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
	// �л��� �̾ �� �� �ֵ��� count ���� ����
	
	// 1�д� �ֵ� �� �ֱ�
	for(int i = 0; i < seat1.length; i++) {
		for(int j = 0; j < seat1[i].length; j++) {
			seat1[i][j] = students[count++];
		}
	}
	
	// 2�д� �ֵ� �� �ֱ�
	for(int i = 0; i < seat2.length; i++) {
		for(int j = 0; j < seat2[i].length; j++) {
			seat2[i][j] = students[count++];
		}
	}
	
	// ���
	System.out.println("== 1�д� ==");
	for(int i = 0; i < seat1.length; i++) {
		for(int j = 0; j < seat1[i].length; j++) {
			System.out.print(seat1[i][j] + " ");
		}
		System.out.println();
	}
	
	System.out.println("== 2�д� ==");
	for(int i = 0; i < seat2.length; i++) {
		for(int j = 0; j < seat2[i].length; j++) {
			System.out.print(seat2[i][j] + " ");
		}
		System.out.println();
	}
	
}

public void practice9() {
	String[] students = {"�迹��", "�迵��", "����", "������", "������", "������", 
			 			"�̿���", "�ӽ�ȯ", "������", "������", "���¿�", "������"};

	String[][] seat1 = new String[3][2];
	String[][] seat2 = new String[3][2];

	int count = 0;
	// 1�д��� ������ 2�д��� ���۵� ���� �̾ �����ϱ� ������
	// �л��� �̾ �� �� �ֵ��� count ���� ����

	// 1�д� �ֵ� �� �ֱ�
	for (int i = 0; i < seat1.length; i++) {
		for (int j = 0; j < seat1[i].length; j++) {
			seat1[i][j] = students[count++];
		}
	}

	// 2�д� �ֵ� �� �ֱ�
	for (int i = 0; i < seat2.length; i++) {
		for (int j = 0; j < seat2[i].length; j++) {
			seat2[i][j] = students[count++];
		}
	}

	// ���
	System.out.println("== 1�д� ==");
	for (int i = 0; i < seat1.length; i++) {
		for (int j = 0; j < seat1[i].length; j++) {
			System.out.print(seat1[i][j] + " ");
		}
		System.out.println();
	}

	System.out.println("== 2�д� ==");
	for (int i = 0; i < seat2.length; i++) {
		for (int j = 0; j < seat2[i].length; j++) {
			System.out.print(seat2[i][j] + " ");
		}
		System.out.println();
	}
	
	System.out.println("==================================");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�˻��� �л� �̸��� �Է��ϼ���: ");
	String name = sc.nextLine();
	
	String part = ""; // �д�
	int row = 0; 	  // ���° ��
	String col = "";  // ���� ������
	
	for(int i = 0; i < seat1.length; i++){
		
		for(int j = 0; j < seat1[i].length; j++){
			
			if(seat1[i][j].equals(name)) {
				
				part = "1�д�";
				row = i+1;
				
				if(j == 0){
					col = "����";
				}else{
					col = "������";
				}
			}
		}
	}
	
	for(int i = 0; i < seat2.length; i++){
		
		for (int j = 0; j < seat2[i].length; j++){
			if(seat2[i][j].equals(name)){
				
				part = "2�д�";
				row = i+1;
				
				if(j == 0){
					col = "����";
				}else {
					col = "������";
					
					
				}
			}
		}
	}
	
	if(part.equals("")) {
		System.out.println("�˻��Ͻ� �л��� �����ϴ�.");
	}else {
		System.out.println("�˻��Ͻ� " + name + " �л��� " + part + " " + row + "��° �� " + col + "�� �ֽ��ϴ�.");			
	}
	
	
}

}
*/