package HackerRank;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String res = alternatingCharacters(in.nextLine());
		System.out.println(res);
	}

	private static String alternatingCharacters(String nextLine) {
		String trimmed = nextLine.replaceAll("\\s+", "");
		int length = trimmed.length();
		int row = (int) Math.floor(Math.sqrt(length));
		int col = (int) Math.ceil(Math.sqrt(length));

		if ((row * col) < length) {
			row++;
		}

		char[][] array = new char[row][col];
		int pos = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (pos < length)
					array[i][j] = trimmed.charAt(pos++);
			}
		}

		char[][] rotatedArray = new char[col][row];

		for (int i = 0; i < col; ++i) {
			for (int j = 0; j < row; ++j) {
				rotatedArray[i][j] = array[j][col - i - 1];
			}
		}

		StringBuffer result = new StringBuffer();
		for (int i = (col - 1); i >= 0; --i) {
			result.append(String.valueOf(rotatedArray[i]).trim());
			result.append(" ");
		}

		return result.toString();
	}
}
