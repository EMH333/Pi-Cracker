package com.ethohampton.pi_decoder;

public class Pi_Decoder {


	public long trysToFindPass;
	public static String[] piInString;
	public static int[] piNumbers;
	

	public static void main(String[] args) {

		piInString = Pi.Pi.split(",");
		piNumbers = new int[piInString.length];
		for (int i = 0; i < piInString.length; i++) {
			piNumbers[i] = Integer.parseInt(piInString[i]);

		}



	}
}
