package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����1 : ");
		int num1 = sc.nextInt();

		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		if (num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			
			int result = num1*num2;
		
			if(result<10) {
				System.out.println("���ڸ� �� �Դϴ�.");
			}else if(result<=99) {
				System.out.println("���ڸ� �� �Դϴ�.");
			}
			
		}

	}

}
