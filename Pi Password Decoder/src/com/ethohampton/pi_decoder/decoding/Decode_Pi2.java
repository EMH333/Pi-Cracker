package com.ethohampton.pi_decoder.decoding;

import com.ethohampton.pi_decoder.Alphabet;
import com.ethohampton.pi_decoder.Pi_Decoder;

public class Decode_Pi2 {
	public static String passwordToFind = "";
	public static String answer = "";
	public static int[] numbers = Pi_Decoder.piNumbers;
	public static int runs;
	public static StringBuffer buffer = new StringBuffer();
	public static boolean found = false;

	private static String[] letters;

	private static int scale(int v) {
		while (v > 24) {
			v = v / 2;
		}
		return v;
	}

	public static String findHash(String hashToFind){
		char[] temp = null;
		while(!found){
			buffer.getChars(0, buffer.length(), temp, temp.length);
			
		}

		return null;
	}
}
