package com.ethohampton.pi_decoder.decoding;

import com.ethohampton.pi_decoder.Alphabet;
import com.ethohampton.pi_decoder.Pi_Decoder;

public class Decode_Pi {
	public static String passwordToFind = "bbbb";
	public static String answer = "";
	public static int[] numbers = Pi_Decoder.piNumbers;
	public static int runs;

	private static String aLetter;
	private static String bLetter;
	private static String cLetter;
	private static String dLetter;

	private static int scale(int v) {
		while (v > 24) {
			v = v / 2;
		}
		return v;
	}

	public static String decode() {
		/*
		 * for (int i = 0; i < 8 piNumbers.length ; i++) { int v = piNumbers[i];
		 * 
		 * while (v > 24) {// TODO implement a feature that evenly distributes
		 * // values v = v / 2; } Alphabet.findLetter(v);
		 * System.out.println(Alphabet.letter); answer = answer +
		 * Alphabet.letter;
		 * 
		 * } System.out.println(answer);
		 */
		runs = numbers.length;
		for (int a = 0; a < runs; a++) {
			System.out.println("Current run: " + a);
			aLetter = Alphabet.findLetter(scale(numbers[a]));
			for (int b = 0; b < runs; b++) {
				bLetter = Alphabet.findLetter(scale(numbers[b]));
				for (int c = 0; c < runs; c++) {
					cLetter = Alphabet.findLetter(scale(numbers[c]));
					for (int d = 0; d < runs; d++) {
						dLetter = Alphabet.findLetter(scale(numbers[d]));

						answer = aLetter + bLetter + cLetter + dLetter;
						// System.out.println(answer);
						if (answer.equals(passwordToFind)) {
							return "The password is: " + answer;
						}

					}
				}
			}
		}

		return "No answer found";
	}
}
