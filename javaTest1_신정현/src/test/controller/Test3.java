package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i = 1; // �ʱ��
		int sum = 0;

		while (i <= 100) {// ���ǽ�

			sum += i;
			i++;

		}
		System.out.println("�հ� : " + (double) sum);
		System.out.println("��� : " + (double) (sum / 100));

	}
}