package aoc18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("dec01.csv");
		
		Scanner input = null;
		
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<String> changes = new ArrayList<String>();
		
		while (input.hasNext()) {
			changes.add(input.nextLine());		
		}
		
		int frequency = 0;
		
		ArrayList<Integer> foundFrequencies = new ArrayList<Integer>();
		
		
		outerloop:
		while (true) {
		
			for (String s : changes) {
				int shift = Integer.parseInt(s.substring(1));
				
				if (s.charAt(0) == '+') {
					frequency += shift;
				}
				else {
					frequency -= shift;
				}
				
				if (foundFrequencies.contains(frequency)) {
					break outerloop;
				}
				else {
					foundFrequencies.add(frequency);
				}
			}	
		}
		
		System.out.println(frequency);
		
		
		
		
		

	}

}
