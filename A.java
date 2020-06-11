import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Long, Integer> repeated = new HashMap();

		while (sc.hasNextLong()) {
			long i = sc.nextLong();

			if (repeated.containsKey(i)) {
				int current = repeated.get(i);
				current++;
				repeated.put(i, current);
			} else {
				repeated.put(i, 1);
			}

		}

		sc.close();

		for (Entry<Long, Integer> entry : repeated.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
