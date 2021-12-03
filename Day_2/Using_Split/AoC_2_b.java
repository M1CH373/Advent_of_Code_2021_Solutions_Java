package Using_Split;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AoC_2_b {
	public static void main(String args[]) throws IOException {
		
		File fileSecondDayB = new File("Day2.txt");
		FileReader reader = new FileReader(fileSecondDayB);
		
		@SuppressWarnings("resource")
		BufferedReader input = new BufferedReader(reader);
		String lineFile = input.readLine();
		ArrayList<String> listWords = new ArrayList<>();
		ArrayList<Integer> listNumbers = new ArrayList<>();
		
		while(lineFile != null){
			String lineSplit[] = lineFile.split(" ");
			listWords.add(lineSplit[0]);
			listNumbers.add(Integer.parseInt(lineSplit[1]));
			lineFile=input.readLine();
		}

		int forward = 0;
		int depth = 0;
		int aim = 0;
		
		for(int i = 0; i < listWords.size(); ++i) {
			
			if(listWords.get(i).equals("forward")) {
				forward += listNumbers.get(i);
				depth += aim * listNumbers.get(i);
			}
			
			if(listWords.get(i).equals("down")) {
				aim +=listNumbers.get(i);
			}
			
			if(listWords.get(i).equals("up")) {
				aim -= listNumbers.get(i);
			}

		}

		int finalPosition = forward * depth;
		System.out.println(finalPosition);
	}

}
