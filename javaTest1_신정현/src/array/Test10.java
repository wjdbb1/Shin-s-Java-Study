package array;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] copyAr = new int[(array.length) * (array[0].length)];
		// int[] copyArAr = new int[(array�� �� ����) * (������)];

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 3 == 0) {

					copyAr[count] = array[i][j];

					for (int z = 0; z < count; z++) { // ������ �߻��� ���� ���� ��
						if (copyAr[count] == copyAr[z]) { // �ߺ��� ���� ������

							count--;

							break;
						}
					}
					count++;
				}

			}
		}
		System.out.print("copyAr : ");
		for (int i = 0; i < count; i++) {
			System.out.print(copyAr[i] + " ");
		}
	}
}
