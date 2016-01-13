package com.ethohampton.pi_decoder;

public class Pi_Decoder {

	public String passwordToFind = "sfjdkl";
	public static String answer = "";
	public long trysToFindPass;
	public static String[] piInString;
	public static int[] piNumbers;
	

	public static void main(String[] args) {

		piInString = Pi.Pi.split(",");
		piNumbers = new int[piInString.length];
		for (int i = 0; i < piInString.length; i++) {
			piNumbers[i] = Integer.parseInt(piInString[i]);

		}

		for (int i = 0; i < 8/*piNumbers.length*/; i++) {
			int v = piNumbers[i];
			
			while(v>24){
				v=v/2;
			}
			Alphabet.findLetter(v);
			System.out.println(Alphabet.letter);
				answer = answer + Alphabet.letter;
			
		}
		System.out.println(answer);

	}
}
