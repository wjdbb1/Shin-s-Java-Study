package test.controller;

public class Test2 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 5; dan++) {
			if (dan % 2 == 1) {
			for (int su = 1; su <= 9; su++) {
				if (su % 2 == 0) {
					continue;
				}
				System.out.println(dan + " X " + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}
}
}