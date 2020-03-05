package com.kh.chap03.branch;

public class B_Continue {
	public void method1() {

		// continue를 이용하여 홀수만 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0)// {
				continue; // 짝수인 경우 다음 출력문 실행x 반복문의 처음(증감식)으로 감
			// }
			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1부터 100까지의 정수들의 합 출력
		// 단, 4의 배수는 뺴고 계산

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0)
				continue;
			sum += i;

		}
		System.out.println(sum);
	}

	public void method3() {
		// for문을 이용하여 2~9단까지 구구단 출력
		// 단, 4의 배수의 단은 뺴고 출력하기

		for (int dan = 2; dan <= 9; dan++) {

			if (dan % 4 == 0) {
				continue;
			}
			System.out.println("=== " + dan + "단 ===");
			for (int su = 1; su <= 9; su++) {

				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println(); // 단이 끝날때마다 개행

		}

	}

	public void method4() {
		// for문을 이용하여 2~9단까지 구구단 출력
		// 단, 짝수는 뺴고 출력하기
		// ex) 2 * 1 = 2
		// 2 * 3 = 6

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("=== " + dan + "단 ===");
			for (int su = 1; su <= 9; su++) {
				if (su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println(); // 단이 끝날때마다 개행

		}
	}
}
