import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class F {

	public static void main(String[] args) throws IOException {

		File file = new File("input.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);

		String targetString = reader.readLine();
		Long target = Long.parseLong(targetString);

		String numbersString = reader.readLine();

		reader.close();
		fileReader.close();

		String[] numbers = numbersString.split(" ");
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			if (Long.parseLong(numbers[i]) >= target) {
				numbers = Arrays.copyOf(numbers, i++);
			}
		}

		boolean hasRelevantNumbers = false;

		for (int i = 0; i < numbers.length; i++) {
			Long first = Long.parseLong(numbers[i]);

			Long second = target - first;
			String required = second.toString();
			int startFrom = i + 1;
			if (Arrays.binarySearch(numbers, startFrom, numbers.length, required) > 0)  {
				hasRelevantNumbers = true;
				writeToFile("1");
				break;
			}
		}

		if (!hasRelevantNumbers)
			writeToFile("0");
	}

	private static void writeToFile(String answer) throws IOException {
		File file = new File("output.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(answer);
		fileWriter.close();
	}
}
