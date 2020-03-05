package com.kh.variable;

public class F_Printf {
	public void printfMethod() {
		System.out.println('a');
		System.out.printf("%c\n", 'a'); // 개행 하려면 \n붙여야함
		System.out.printf("%c %c\n", 'a', 'b');
		System.out.printf("%3c%5c", 'a', 'b');
		System.out.println(); // 개행

		System.out.printf("%5d%-5d%5d\n", 100, 200, 300);
		System.out.printf("%s\t%f\t%10.2f\n", "ABC", 10.95, 10.975);

		// 10진수 100을 10진수, 8진수, 16진수로 나타내면?
		System.out.printf("100을 10진 : %5d 8진 : %5o 16진 : %5x\n", 100, 100, 100);

		// 10진수 100, 16진수 100, 8진수 100을 10진수로 나타내면?
		System.out.printf("100을 10진 : " + 100);
		System.out.printf("16진수 100 : " + 0x100);
		System.out.printf("8진수 100: " + 0100);

	}
}
