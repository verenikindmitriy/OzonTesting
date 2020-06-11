import java.math.BigInteger;
import java.util.Scanner;

public class D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");

		BigInteger first = sc.nextBigInteger();
		BigInteger second = sc.nextBigInteger();

		sc.close();

		System.out.println(first.add(second));

	}
}
