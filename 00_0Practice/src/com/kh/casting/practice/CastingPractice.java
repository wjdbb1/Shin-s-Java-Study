package com.kh.casting.practice;

import java.util.Scanner;

public class CastingPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch +" "+ "unicode : " + (int) ch);

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		double kor = sc.nextDouble();
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		System.out.print("���� : ");
		double mat = sc.nextDouble();

		double sum = kor + eng + mat;
		double avg = (kor + eng + mat) / 3;

		System.out.println("���� : " + (int) sum);
		System.out.println("��� : " + (int) avg);
	}

	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A';

		System.out.println(iNum1 % iNum2); // 2
		System.out.println((int) dNum); // 2

		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double) iNum1); // 10.0

		System.out.println((double) iNum1 / iNum2); // 2.5
		System.out.println(dNum); // 2.5

		System.out.println((int) fNum); // 3
		System.out.println((int) (iNum1 / fNum)); // 3

		System.out.println(iNum1 / fNum); // 3.3333333
		System.out.println((double) iNum1 / fNum); // 3.333333333333335

		System.out.println((char) ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println((int) ch + iNum1); // 75
		System.out.println((char) (ch + iNum1)); // 'K'

	}
}

/*
public void method1() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	char ch = sc.nextLine().charAt(0);
	
	System.out.println(ch + " unicode : " + (int)ch);
	
}

public void method2() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� : ");
	double kor = sc.nextDouble();
	
	System.out.print("���� : ");
	double eng = sc.nextDouble();
	
	System.out.print("���� : ");
	double mat = sc.nextDouble();
	
	int sum = (int)(kor + eng + mat);
	int avg = sum / 3;
	
	System.out.println("���� : " + sum);
	System.out.println("��� : " + avg);
	
}

public void method3() {
	
	int iNum1 = 10;
	int iNum2 = 4;
	
	float fNum = 3.0f;
	
	double dNum = 2.5;
	
	char ch = 'A';
	
	System.out.println(iNum1 / iNum2); // 2
	System.out.println((int)dNum); // 2
	
	System.out.println((double)iNum1); // 10.0
	System.out.println(iNum2 * dNum); // 10.0

	System.out.println(dNum); // 2.5
	System.out.println((double)iNum1/iNum2); // 2.5
	
	System.out.println((int)fNum); // 3
	System.out.println(iNum1/(int)fNum); // 3
	
	System.out.println(iNum1/fNum); // 3.3333333
	System.out.println(iNum1/(double)fNum); // 3.33333333333333335
	
	System.out.println(ch); // 'A'
	System.out.println((int)ch); // 65
	System.out.println(ch + iNum1); // 75
	System.out.println((char)(ch + iNum1)); // 'K'
	
}

}
*/
