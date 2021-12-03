import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AoC_1_b {
	public static void main(String args[]) throws FileNotFoundException {
		
		ArrayList<Integer> listValuesFile = new ArrayList<>();

		Scanner fileFirstDayB = new Scanner(new File("Day1.txt"));
		
		while(fileFirstDayB.hasNext()){
			
			String lineFile = fileFirstDayB.nextLine();
			listValuesFile.add(Integer.parseInt(lineFile));
		}
		
		int sumPartial = 0;
		int j = 0;
		ArrayList<Integer> listValuesSum = new ArrayList<>();
		
		for(int i = 0; i < listValuesFile.size(); ++i) {
			if(j < listValuesFile.size()) {
				
				for(j = i; j < (3 + i); ++j) {
					sumPartial += listValuesFile.get(j);
				}
	
				listValuesSum.add(sumPartial);
				
			
				sumPartial = 0;
			}
			else {
				
				break;
			}
		}
		
		int counterIncrement = 0;
		
		for(int i = 0; i < listValuesSum.size() - 1; ++i) {
			if(listValuesSum.get(i + 1) > (listValuesSum.get(i))) {
				++counterIncrement;
			}
		}
		System.out.println(counterIncrement);
	}
}
