import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AoC_1_a {
	public static void main(String args[]) throws FileNotFoundException {

		ArrayList<Integer> listValuesFile = new ArrayList<>();

		Scanner fileFirstDayA = new Scanner(new File("Day1.txt"));
		
		while(fileFirstDayA.hasNext()){
			
			String lineFile = fileFirstDayA.nextLine();
			listValuesFile.add(Integer.parseInt(lineFile));
		}
		
		int counterIncrement = 0;
		
		for(int i = 0; i < listValuesFile.size() - 1; ++i) {
			if(listValuesFile.get(i + 1) > listValuesFile.get(i)) {
				++counterIncrement;
			}
		}
		System.out.println(counterIncrement);
	}
}
