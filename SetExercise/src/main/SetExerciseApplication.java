package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {

	public static void main(String[] args) throws IOException {
		Set<String> pokerHands = new HashSet<>();

		BufferedReader fileReader = new BufferedReader(new FileReader("PokerHands.csv"));
		fileReader.readLine();
		String line;

		while ((line = fileReader.readLine()) != null) {
			String[] lineData = line.split(",");

			String players = lineData[0];
			String hand = lineData[1];

			hand = hand.replaceAll("PAIR", "DEUCES").replaceAll("ACE HIGH", "").replaceAll("QUEEN HIGH", "");
			if (!hand.contains("ACE HIGH") && !hand.contains("QUEEN HIGH")) {
				pokerHands.add(hand);
			}

		}
		for (String hand : pokerHands) {
			System.out.println(hand);
		}
	}
}
