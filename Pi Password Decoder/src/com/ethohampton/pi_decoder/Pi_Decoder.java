package com.ethohampton.pi_decoder;

public class Pi_Decoder {

	public String passwordToFind;
	public static String answer = "test";
	public long trysToFindPass;
	public static String[] piInString;
	public static int[] piNumbers;
	

	public static void main(String[] args) {

		piInString = Pi.Pi.split(",");
		piNumbers = new int[1024];
		for (int i = 0; i < piInString.length; i++) {
			piNumbers[i] = Integer.parseInt(piInString[i]);

		}

		for (int i = 0; i < piNumbers.length; i++) {
			String str = null;
			int v = piNumbers[i];
			
			str = Alphabet.findLetter(v);
			
			
			answer.concat(str);
		}

	}
}
