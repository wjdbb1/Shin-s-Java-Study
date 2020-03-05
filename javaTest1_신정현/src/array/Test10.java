package array;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int[] copyAr = new int[(array.length) * (array[0].length)];
		// int[] copyArAr = new int[(array의 행 갯수) * (열갯수)];

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 3 == 0) {

					copyAr[count] = array[i][j];

					for (int z = 0; z < count; z++) { // 이전에 발생한 랜덤 값과 비교
						if (copyAr[count] == copyAr[z]) { // 중복된 값이 있을시

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
