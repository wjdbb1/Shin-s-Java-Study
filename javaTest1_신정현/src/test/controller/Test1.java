package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 100) {
			if (num % 2 == 0) {
				System.out.println("2�� ����Դϴ�.");
			}else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}

		}

	}
}