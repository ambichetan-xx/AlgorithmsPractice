package HackerRank;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t, a;
		t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			int res = utopianTree(a);
			System.out.println(res);
		}

	}

	private static int utopianTree(int a) {

		boolean spring = true;
		int height = 1;
		for (int i = 0; i < a; i++) {
			if (spring) {
				height = height * 2;
				spring = false;
			} else {
				height++;
				spring = true;
			}
		}
		return height;
	}
}
