package com.kh.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
		if (num < 1) {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하였습니다. 다시입력하세요.");

			}
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		if (num < 1) {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하였습니다. 다시입력하세요.");

			}
		}

	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
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

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
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
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두번째 숫자 : ");
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
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}

		}
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("==== " + dan + "단 ====");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		/*
		 * if (dan >= 2 && dan <= 9) { for (int i = 1; i < 10; i++) {
		 * System.out.println(dan+"*"+i+"="+(dan * i)); } } else {
		 * System.out.println("1~9사이의 양수를 입력하여야 합니다"); }
		 */

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) {

			for (int i = dan; dan <= 9; dan++) {
				System.out.println("==== " + dan + "단 ====");

				for (int j = 1; j <= 9; j++) {

					System.out.println(dan + " * " + j + " = " + (dan * j));
				}

			}
		} else {
			System.out.println("2~9사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("숫자 : ");
			int dan = sc.nextInt();

			if (dan >= 2 && dan <= 9) {

				for (int i = dan; dan <= 9; dan++) {
					System.out.println("==== " + dan + "단 ====");

					for (int j = 1; j <= 9; j++) {

						System.out.println(dan + " * " + j + " = " + (dan * j));
					}

				}
				break;
			} else {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
			}
		}
	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int snum = sc.nextInt();
		System.out.print("공차 : ");
		int tnum = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(snum + (tnum * i) + " ");
		}

	}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
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
		System.out.print("정수입력 : ");
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
			System.out.print("연산자를 입력(+, -, *, /, %) : ");
			String op = sc.nextLine();

			if (op.equals("exit")) {
				System.out.print("프로그램을 종료합니다. ");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
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
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				}
			} else if (op.equals("%")) {
				result = num1 % num2;

			}

			else {
				System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		}
	}

	public void practice15() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		boolean flag = true; // 소수인지 아닌지 논리값을 담을 flag 변수

		if (num >= 2) {

		for (int i = 2; i < num; i++) { // 2 ~ num-1 까지 반복 (즉, 1과 자기 자신을 빼고)

		if (num % i == 0) { // 2 ~ num-1 까지 한번씩 나눠볼 때 나누어떨어지는 순간이 한번이라도 나오면

		flag = false; // num은 소수가 아니라는 소리 --> false로 바꿔버림
		break; // 더이상 실행해볼 가치 없어서 break 받고 반복문 빠져 나감
		}
		}

		if (flag) { // flag 값이 true일 경우
		System.out.println("소수입니다.");
		} else {
		System.out.println("소수가 아닙니다.");
		}

		} else {
		System.out.println("잘못 입력하셨습니다.");
		}
		}

	public void practice16() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
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
					System.out.println("소수입니다.");
				} else {
					System.out.println("소수가 아닙니다.");
				}

				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		boolean flag = true;
		int count = 0; // 소수 갯수 증가 시킬 변수

		if (num >= 2) {
			for (int i = 2; i <= num; i++) {

				for (int j = 2; j < i; j++) {

					if (i % j == 0) {
						flag = false;
						break;
					}
				}

				if (flag) { // 소수일 경우
					System.out.print(i + " ");
					count++;
				}

				flag = true; // 다시 true로 초기화
			}
			System.out.println();
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int user = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= user; i++) { // 1부터 사용자가 입력한 수까지

			if (i % 2 == 0 || i % 3 == 0) { // 2로 나누어떨어지거나 3으로 나누어떨어지면 : 2의 배수이거나 3의 배수이면 출력
				System.out.print(i + " ");
			}

			if (i % 2 == 0 && i % 3 == 0) { // 2로도 나누어떨어지고 3으로도 나누어떨어지면 : 2와 3의 공배수일때 count 증가
				count++;
			}
		}
		System.out.println("count : " + count);
	}

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
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
		System.out.print("정수입력 : ");
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
		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			// 공백 먼저 출력
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();// 개행
		}
	}

	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				// 첫번쨰 줄과 마지막 줄은 모두 "*"출력
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

			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();

			int ran1 = (int) (Math.random() * 6) + 1;
			int ran2 = (int) (Math.random() * 6) + 1;

			System.out.println("첫번째 주사위 눈의 값 : " + ran1);
			System.out.println("두번째 주사위 눈의 값 : " + ran2);
			System.out.println("두 주사위 눈의 합 : " + (ran1 + ran2));

			if (num == (ran1 + ran2)) {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}

			System.out.print("계속 하시겠습니까? (y/n) : ");
			ch = sc.next().charAt(0);

		} while (ch != 'n' && ch != 'N');

	}

}

/*
public void practice1() { // only for문
	Scanner sc = new Scanner(System.in);
	System.out.print("1 이상의 숫자를 입력하세요 : ");
	int user = sc.nextInt();

	if (user >= 1) {
		for (int i = 1; i <= user; i++) {
			System.out.print(i + " ");
		}
	} else {
		System.out.println("1 이상의 숫자를 입력해주세요.");
	}
}

public void practice2() { // for문 + while문 + 분기문
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			break;
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
}

public void practice3() { // only for문
	Scanner sc = new Scanner(System.in);

	System.out.print("1 이상의 숫자를 입력하세요 : ");
	int user = sc.nextInt();

	if (user >= 1) {

		for (int i = user; i >= 1; i--) {
			System.out.print(i + " ");
		}

	} else {
		System.out.println("1 이상의 숫자를 입력해주세요.");
	}
}

public void practice4() { // for문 + while문 + 분기문
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			break;
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
}

public void practice5() { // only for문
	Scanner sc = new Scanner(System.in);

	System.out.print("정수를 하나 입력하세요 : ");
	int num = sc.nextInt();

	int sum = 0;

	// for문 방법
	for (int i = 1; i <= num; i++) {
		sum += i;

		if (i != num) {
			System.out.print(i + " + ");
		} else {
			System.out.print(i + " = ");
		}
	}
}

public void practice6() { // only for문
	Scanner sc = new Scanner(System.in);

	System.out.print("첫 번째 숫자 : ");
	int num1 = sc.nextInt();

	System.out.print("두 번째 숫자 : ");
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
		System.out.println("1 이상의 숫자를 입력해주세요.");
	}
}

public void practice7() { // for문 + while문 + 분기문
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
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
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
}

public void practice8() { // only for문
	Scanner sc = new Scanner(System.in);

	System.out.print("숫자 : ");
	int num = sc.nextInt();

	System.out.println("===== " + num + "단 =====");

	for (int i = 1; i < 10; i++) {
		System.out.printf("%d * %d = %d\n", num, i, (num * i));
	}
}

// -------------- 중첩 반복문 ----------------------

public void practice9() {
	Scanner sc = new Scanner(System.in);

	System.out.print("숫자 : ");
	int num = sc.nextInt();

	if (num >= 2 && num <= 9) {

		for (int i = num; i < 10; i++) { // 단을 지정하는 for문
			System.out.printf("===== %d단 =====\n", i);

			for (int j = 1; j <= 9; j++) { // 곱해지는 수를 지정하는 for문
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}

			System.out.println();
		}

	} else {
		System.out.println("2~9 사이의 숫자만 입력해주세요.");
	}
}

public void practice10() {
	Scanner sc = new Scanner(System.in);

	while (true) {

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num >= 2 && num <= 9) {

			for (int i = num; i <= 9; i++) { // 단을 지정하는 for문
				System.out.printf("===== %d단 =====\n", i);

				for (int j = 1; j <= 9; j++) { // 곱해지는 수를 지정하는 for문
					System.out.printf("%d * %d = %d%n", i, j, (i * j));
				}

				System.out.println();
			}
			break;

		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
}

public void practice11() {
	Scanner sc = new Scanner(System.in);

	System.out.print("시작 숫자 : ");
	int start = sc.nextInt();

	System.out.print("공차 : ");
	int num = sc.nextInt();

	// for문 방법
	for (int i = 1; i <= 10; i++) { // 10번 반복
		System.out.print(start + " ");
		start += num;
	}
}

public void practice12() { // 별 찍기
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = sc.nextInt();

	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void practice13() { // 별 찍기
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = sc.nextInt();

	for (int i = num; i > 0; i--) {
		for (int j = i; j > 0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}

	// 다른 방법
	
	 * for(int i = num; i > 0; i--) {
	 * 
	 * for(int j=1; j<=i; j++) { System.out.print("*"); }
	 * 
	 * System.out.println(); }
	 
}

public void practice14() {
	Scanner sc = new Scanner(System.in);

	// 연산자 입력 받고
	// 해당 연산기호가 exit일 경우 (조건문) --> 프로그램 종료 (반복문 종료)
	// 정수 두 개를 입력받고
	// 연산기호가 / 면서 두번째 정수가 0일 경우 (조건문) --> 오류문구 출력 (반복문 다시 시작)
	// 연산기호에 따라 해당 결과 출력문 출력

	while (true) {
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.nextLine();

		if (op.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break; // exit 입력시 반복문을 빠져나감
		}

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		// 연산자가 /이고 두번째 정수가 0일 경우
		if (op.equals("/") && num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
			continue; // 뒤의 실행들은 실행하지 않고 바로 반복문의 위로 올라감
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
			System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
			continue; // 연산자 잘 못 입력시 아래의 출력문 무시하고 반복문의 위로 올라감
		}

		System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
		System.out.println();
	}
}

// hard ver
// ------------------------------------------------------------------------------

public void practice15() {
	// 나누어 떨어지는 수가 1과 자기 자신 밖에 없는 수 --> 소수
	// 예를 들면 4의 경우
	// 4 % 1 == 0
	// 4 % 2 == 0
	// 4 % 3 == 1
	// 4 % 4 == 0
	// 4라는 숫자는 나누어떨어지는 수가 1과 자기 자신 말고도 2가 있다. --> 소수 X

	// 예를 들면 5의 경우
	// 5 % 1 == 0
	// 5 % 2 == 1
	// 5 % 3 == 2
	// 5 % 4 == 1
	// 5 % 5 == 0
	// 5라는 숫자는 나누어 떨어지는 수가 1과 자기 자신 밖에 없음 --> 소수 O
	Scanner sc = new Scanner(System.in);

	System.out.print("숫자 : ");
	int num = sc.nextInt();

	boolean flag = true; // 소수인지 아닌지 논리값을 담을 flag 변수

	if (num >= 2) {

		for (int i = 2; i < num; i++) { // 2 ~ num-1 까지 반복 (즉, 1과 자기 자신을 빼고)

			if (num % i == 0) { // 2 ~ num-1 까지 한번씩 나눠볼 때 나누어떨어지는 순간이 한번이라도 나오면

				flag = false; // num은 소수가 아니라는 소리 --> false로 바꿔버림
				break; // 더이상 실행해볼 가치 없어서 break 받고 반복문 빠져 나감
			}
		}

		if (flag) { // flag 값이 true일 경우
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}

	} else {
		System.out.println("잘못 입력하셨습니다.");
	}
}

public void practice16() {
	Scanner sc = new Scanner(System.in);

	while (true) {
		System.out.print("숫자 : ");
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
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}

			break;

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}

public void practice17() {
	Scanner sc = new Scanner(System.in);

	System.out.print("숫자 : ");
	int num = sc.nextInt();

	boolean flag = true;
	int count = 0; // 소수 갯수 증가 시킬 변수

	if (num >= 2) {
		for (int i = 2; i <= num; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag) { // 소수일 경우
				System.out.print(i + " ");
				count++;
			}

			flag = true; // 다시 true로 초기화
		}

		System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");

	} else {
		System.out.println("잘못 입력하셨습니다.");
	}
}

public void practice18() {
	Scanner sc = new Scanner(System.in);

	System.out.print("자연수 하나를 입력하세요 : ");
	int user = sc.nextInt();
	int count = 0;

	for (int i = 1; i <= user; i++) { // 1부터 사용자가 입력한 수까지

		if (i % 2 == 0 || i % 3 == 0) { // 2로 나누어떨어지거나 3으로 나누어떨어지면 : 2의 배수이거나 3의 배수이면 출력
			System.out.print(i + " ");
		}

		if (i % 2 == 0 && i % 3 == 0) { // 2로도 나누어떨어지고 3으로도 나누어떨어지면 : 2와 3의 공배수일때 count 증가
			count++;
		}
	}
	System.out.println("count : " + count);
}

public void practice19() {
	Scanner sc = new Scanner(System.in);

	System.out.print("정수 입력 : ");
	int user = sc.nextInt();

	for (int i = 1; i <= user; i++) {
		// 공백 먼저 출력
		for (int j = 1; j <= user - i; j++) {
			System.out.print(" ");
		}
		// 별 출력
		for (int k = 1; k <= i; k++) {
			System.out.print("*");
		}
		System.out.println(); // 개행
	}
}

public void practice20() {
	Scanner sc = new Scanner(System.in);

	System.out.print("홀수 입력 : ");
	int user = sc.nextInt();

	// 위쪽 삼각형
	for (int i = 0; i < user / 2; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// 아래쪽 삼각형
	for (int i = user / 2; i < user; i++) {
		for (int j = user - i; j > 0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public void practice21() {
	Scanner sc = new Scanner(System.in);

	System.out.print("정수 입력 : ");
	int user = sc.nextInt();

	for (int i = 0; i < user; i++) {
		// 공백 먼저 출력
		for (int j = 0; j < user - i - 1; j++) {
			System.out.print(" ");
		}
		// 별 출력
		for (int k = 0; k < i * 2 + 1; k++) {
			System.out.print("*");
		}
		System.out.println(); // 개행
	}
}

public void practice22() {
	Scanner sc = new Scanner(System.in);

	
	System.out.print("정수 입력 : ");
	int user = sc.nextInt();

	for (int i = 0; i < user; i++) {
		for (int j = 0; j < user; j++) {
			// 첫 번째 줄과 마지막 줄은 모두 "*" 출력
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
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int ran1 = (int) (Math.random() * 6) + 1;
		int ran2 = (int) (Math.random() * 6) + 1;

		System.out.println("첫번째 주사위 눈의 값 : " + ran1);
		System.out.println("두번째 주사위 눈의 값 : " + ran2);
		System.out.println("두 주사위 눈의 합 : " + (ran1+ran2));
		
		if(num == (ran1+ran2)) {
			System.out.println("맞췄습니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
		
		System.out.print("계속 하시겠습니까? (y/n) : ");
		ch = sc.next().charAt(0);
		
	
	} while (ch != 'n' && ch != 'N');
}

}
*/
