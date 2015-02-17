package HackerRank;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		String a;
		t = Integer.parseInt(in.nextLine());
		for (int i = 0; i < t; i++) {
			a = in.nextLine();
			int res = alternatingCharacters(a);
			System.out.println(res);
		}

	}

	private static int alternatingCharacters(String a) {
		char last = a.charAt(0);
		int count = 0;
		for (int i = 1; i < a.length(); i++) {
			if (a.charAt(i) == last) {
				count++;
			} else {
				last = a.charAt(i);
			}
		}

		return count;
	}

}
