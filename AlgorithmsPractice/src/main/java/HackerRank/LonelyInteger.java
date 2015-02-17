package HackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LonelyInteger {

	static int lonelyinteger(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : a) {
			if (hm.containsKey(i)) {
				Integer value = hm.get(i);
				hm.replace(i, ++value);
			} else {
				hm.put(i, 1);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);

	}
}
