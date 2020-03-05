package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i = 1; // 초기식
		int sum = 0;

		while (i <= 100) {// 조건식

			sum += i;
			i++;

		}
		System.out.println("합계 : " + (double) sum);
		System.out.println("평균 : " + (double) (sum / 100));

	}
}