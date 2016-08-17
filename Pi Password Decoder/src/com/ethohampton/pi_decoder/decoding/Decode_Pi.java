package com.ethohampton.pi_decoder.decoding;

import com.ethohampton.pi_decoder.Alphabet;
import com.ethohampton.pi_decoder.Pi_Decoder;
import com.ethohampton.pi_decoder.objects.LoopAnswer;

public class Decode_Pi {
	public static String passwordToFind = "";
	public static String answer = "";
	public static int[] numbers = Pi_Decoder.piNumbers;
	public static int runs = numbers.length;

	private static int scale(int v) {
		while (v > 24) {
			v = v / 2;
		}
		return v;
	}

	public static String findHash(String hashToFind, int maxLetters) {
		passwordToFind = hashToFind;
		loop(new LoopAnswer(maxLetters, ""));

		return null;
	}

	public static LoopAnswer loop(LoopAnswer previous) {
		if (previous.getTimes() > 1) {
			for (int a = 0; a < runs; a++) {
				String letter = Alphabet.findLetter(scale(numbers[a]));
				LoopAnswer answer = new LoopAnswer(previous.getTimes() - 1, previous.getPrevious() + letter);
				loop(answer);
			}
		} else {

			for (int a = 0; a < runs; a++) {
				String letter = Alphabet.findLetter(scale(numbers[a]));

				answer = previous.getPrevious() + letter;
				System.out.println(answer);
				if (answer.equals(passwordToFind)) {
					System.out.println("found");
				}

			}
		}
		return null;
	}
}
