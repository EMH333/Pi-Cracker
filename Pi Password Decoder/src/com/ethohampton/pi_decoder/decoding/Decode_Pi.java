package com.ethohampton.pi_decoder.decoding;

import com.ethohampton.pi_decoder.Alphabet;
import com.ethohampton.pi_decoder.Pi_Decoder;

public class Decode_Pi {
	public String passwordToFind = "sfjdkl";
	public static String answer = "";
	public static int[] piNumbers = Pi_Decoder.piNumbers;

	public static String decode(Class<?> main) {
		for (int i = 0; i < 8/* piNumbers.length */; i++) {
			int v = piNumbers[i];

			while (v > 24) {// TODO implement a feature that evenly distributes
							// values
				v = v / 2;
			}
			Alphabet.findLetter(v);
			System.out.println(Alphabet.letter);
			answer = answer + Alphabet.letter;

		}
		System.out.println(answer);
		return answer;
	}
}
