package HackerRank;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t, a;
		t = in.nextLong();
		for (int i = 0; i < t; i++) {
			a = in.nextLong();
			long res = flippingBits(a);
			System.out.println(res);
		}

	}

	private static long flippingBits(long a) {
		String binStr = Long.toBinaryString(a);
		binStr = String.format("%32s", binStr).replace(' ', '0');
		char[] binArray = binStr.toCharArray();
		for (int i = 0; i < binArray.length; i++) {
			if (binArray[i] == '0') {
				binArray[i] = '1';
			} else
				binArray[i] = '0';
		}
		binStr = String.valueOf(binArray);

		return Long.valueOf(binStr, 2);
	}
}
