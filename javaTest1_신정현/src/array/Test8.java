package array;

public class Test8 {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				sum += array[i][j];

			}
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (sum / (array.length * array[0].length)));

	}
}