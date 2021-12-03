package Using_ReplaceAll;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AoC_2_a {
	public static void main(String args[]) throws IOException {

		ArrayList<String> listValuesFile = new ArrayList<>();

		Scanner fileFirstDayB = new Scanner(new File("Day2.txt"));

		while (fileFirstDayB.hasNext()) {

			String lineFile = fileFirstDayB.nextLine();
			listValuesFile.add(lineFile);
		}

		int forward = 0;
		int depth = 0;

		for (String valueOfList : listValuesFile) {
			if (valueOfList.startsWith("f") == true) {
				String numberForward = valueOfList.replaceAll("forward ", "");
				forward += Integer.parseInt(numberForward);
			}
			else if (valueOfList.startsWith("d") == true) {
				String numberDown = valueOfList.replaceAll("down ", "");
				depth += Integer.parseInt(numberDown);

			}
			else if (valueOfList.startsWith("u") == true) {
				String numberUp = valueOfList.replaceAll("up ", "");
				depth -= Integer.parseInt(numberUp);

			}
		}
		
		int finalPosition = forward * depth;
		System.out.println(finalPosition);
	}

}