package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlushCounter {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> flushCount = new HashMap<>();
		flushCount.put("Patrick Stewart", 0);
		flushCount.put("TJ Hooker", 0);
		flushCount.put("He Man", 0);
		flushCount.put("Rita Repulsa", 0);

		BufferedReader fileReader = new BufferedReader(new FileReader("PokerHands.csv"));
		fileReader.readLine();
		String line;

		while ((line = fileReader.readLine()) != null) {
			String[] lineData = line.split(",");

			String player = lineData[0];
			String hand = lineData[1];

			if (hand.equals("FLUSH")) {
				flushCount.put(player, flushCount.get(player) + 1);
				flushCount.put("Zordon", 2);
				if (player.equals("He Man")) {
					flushCount.put("He Man", flushCount.get("He Man") + 1);
				}
			}

		}
		for (String key : flushCount.keySet()) {
			if (key.equals("He Man")) {
				flushCount.remove (key);
				break;
			}
		}

		for (String key : flushCount.keySet()) {
			if (key.equals("Rita Repulsa")) {
				flushCount.remove(key);
				break;
			}

		}
		for (String player : flushCount.keySet())

		{
			System.out.println(player + " Flush Count: " + flushCount.get(player));
		}

	}

}
